package com.jiangong.demo.service;

import com.jiangong.demo.VO.RecordingVO;
import com.jiangong.demo.entity.Price;
import com.jiangong.demo.entity.Rating_item;
import com.jiangong.demo.entity.database.*;
import com.jiangong.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class Match_query_service {

    @Autowired
    private Construction_mix_Repository Con_R;
    @Autowired
    private Cement_Repository Cem_R;
    @Autowired
    private Slag_powder_Repository Sla_R;
    @Autowired
    private Fly_ash_Repository Fly_R;
    @Autowired
    private Admixture_Repository Adm_R;
    @Autowired
    private Expansion_agent_Repository Exp_R;
    @Autowired
    private Limestone_powder_Repository Lim_R;
    @Autowired
    private Scoring_rules_Repository Sco_R;

    //根据必备条件查询，返回匹配列表
    public List<Construction_mix> query_for_necessary
    (Design_record design_record) {

        //根据混凝土品种、强度等级、抗渗等级查询
        List<Construction_mix> construction_mixes = Con_R.findByConcretevarietyAndStrengthlevel1AndImpermeabilityrating
                (design_record.getConcretevariety(), design_record.getPowerlevel(), design_record.getImpermerating());

        //新列表存储筛选后的配合比
        List<Construction_mix> new_construction_mixes = new ArrayList<>();

        //进行条件匹配，如果没有选直接跳过循环
        for (Construction_mix mix : construction_mixes
        ) {
            //通过月份筛选，如果没选月份，匹配所有
            if (null != design_record.getPeriod() && !design_record.getPeriod().equals("null")) {
                String Smalltickettime = mix.getSmalltickettime();
                String pattern = "\\d+/(\\d+)/\\d+.*";
                // 创建 Pattern 对象
                Pattern r = Pattern.compile(pattern);
                // 现在创建 matcher 对象
                Matcher m = r.matcher(Smalltickettime);
                if (m.find()) {
                    int month = Integer.parseInt(m.group(1));
                    switch (design_record.getPeriod()) {
                        case "5-9":
                            //不在之中就跳过这条记录
                            if (month < 5 || month > 9) continue;
                            break;
                        case "12-2":
                            if (month != 12 && month != 1 && month != 2) continue;
                            break;
                        case "3-4,10-11":
                            if (month != 3 && month != 4 && month != 10 && month != 11) continue;
                            break;
                    }
                }
            }

            //通过Id获取水泥对象，然后进行水泥品种等级匹配
            if (null != design_record.getCementgrade() && !design_record.getCementgrade().equals("null")) {
                String Cementsamplenumber = mix.getCementsamplenumber();
                if (Cementsamplenumber != null) {
                    Cement cement = Cem_R.findOne(Cementsamplenumber);
                    if (cement != null) {
                        String cementBreedgrade = cement.getBreedgrade();
                        //判断是否匹配
                        if (cementBreedgrade == null || !cementBreedgrade.equals(design_record.getCementgrade()))
                            continue;
                    } else continue;
                } else continue;
            } else {
                String Cementsamplenumber = mix.getCementsamplenumber();
                //如果用户输入的为空，但数据库中的不为空，匹配失败，跳过
                if (Cementsamplenumber != null) {
                    continue;
                }
            }

            //如果用户没有录入粗砂(即细集料1，2，3都不等于粗砂)，那么就筛选掉配合比中有粗砂的记录(即粗砂编号不为空)
            //如果用户录入了粗砂，那么就筛选掉配合比中没有粗砂的记录
            if (null == design_record.getFineaggregate1model())
                design_record.setFineaggregate1model("null");
            if (null == design_record.getFineaggregate2model())
                design_record.setFineaggregate2model("null");
            if (null == design_record.getFineaggregate3model())
                design_record.setFineaggregate3model("null");

            if (!design_record.getFineaggregate1model().equals("粗砂")
                    && !design_record.getFineaggregate2model().equals("粗砂")
                    && !design_record.getFineaggregate3model().equals("粗砂")) {
                if (null != mix.getCoarsesandsamplenumber() && !mix.getCoarsesandsamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getCoarsesandsamplenumber() || mix.getCoarsesandsamplenumber().equals("null"))
                    continue;
            }

            if (!design_record.getFineaggregate1model().equals("中砂")
                    && !design_record.getFineaggregate2model().equals("中砂")
                    && !design_record.getFineaggregate3model().equals("中砂")) {
                if (null != mix.getMediumsandsamplenumber() && !mix.getMediumsandsamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getMediumsandsamplenumber() || mix.getMediumsandsamplenumber().equals("null"))
                    continue;
            }

            if (!design_record.getFineaggregate1model().equals("特细砂")
                    && !design_record.getFineaggregate2model().equals("特细砂")
                    && !design_record.getFineaggregate3model().equals("特细砂")) {
                if (null != mix.getExtrafinesandsamplenumber() && !mix.getExtrafinesandsamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getExtrafinesandsamplenumber() || mix.getExtrafinesandsamplenumber().equals("null"))
                    continue;
            }

            //如果用户没有录入大石(即粗集料1，2，3都不等于大石)，那么就筛选掉配合比中有大石的记录
            //如果用户录入了大石，那么就筛选掉配合比中没有大石的记录
            if (null == design_record.getCoarseaggregate1model())
                design_record.setCoarseaggregate1model("null");
            if (null == design_record.getCoarseaggregate2model())
                design_record.setCoarseaggregate2model("null");
            if (null == design_record.getCoarseaggregate3model())
                design_record.setCoarseaggregate3model("null");

            if (!design_record.getCoarseaggregate1model().equals("10-20")
                    && !design_record.getCoarseaggregate2model().equals("10-20")
                    && !design_record.getCoarseaggregate3model().equals("10-20")) {
                if (null != mix.getBigstonesamplenumber() && !mix.getBigstonesamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getBigstonesamplenumber() || mix.getBigstonesamplenumber().equals("null"))
                    continue;
            }

            //小石
            if (!design_record.getCoarseaggregate1model().equals("5-10")
                    && !design_record.getCoarseaggregate2model().equals("5-10")
                    && !design_record.getCoarseaggregate3model().equals("5-10")) {
                if (null != mix.getSmallstonesamplenumber() && !mix.getSmallstonesamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getSmallstonesamplenumber() || mix.getSmallstonesamplenumber().equals("null"))
                    continue;
            }

            //获取矿渣粉对象
            if (null != design_record.getSlagpowdergrade() && !design_record.getSlagpowdergrade().equals("null")) {
                String Slagpowdersamplenumber = mix.getSlagpowdersamplenumber();
                if (Slagpowdersamplenumber != null) {
                    Slag_powder slag_powder = Sla_R.findOne(Slagpowdersamplenumber);
                    if (slag_powder != null) {
                        String slag_powderBreedgrade = slag_powder.getBreedgrade();
                        //判断是否匹配
                        if (slag_powderBreedgrade == null || !slag_powderBreedgrade.equals(design_record.getSlagpowdergrade()))
                            continue;
                    } else continue;
                } else continue;
            } else {
                //用户没有录入矿渣粉的情况
                String Slagpowdersamplenumber = mix.getSlagpowdersamplenumber();
                if (Slagpowdersamplenumber != null) {
                    continue;
                }
            }

            //获取粉煤灰对象
            String Flyashsamplenumber = mix.getFlyashsamplenumber();
            //如果数据库中粉煤灰不为空
            if (null != Flyashsamplenumber) {
                Fly_ash fly_ash = Fly_R.findOne(Flyashsamplenumber);
                if (null != fly_ash) {
                    //用户录入不为空的情况
                    if (null != design_record.getFlyashcategory() && !design_record.getFlyashcategory().equals("null")) {
                        String fly_ashSamplecategory = fly_ash.getSamplecategory();
                        //判断是否匹配
                        //"F类"
                        if (fly_ashSamplecategory == null || !fly_ashSamplecategory.equals(design_record.getFlyashcategory()))
                            continue;
                    } else continue; //用户录入为空的就跳过
                    if (null != design_record.getFlyashgrade() && !design_record.getFlyashgrade().equals("null")) {
                        String fly_ashBreedgrade = fly_ash.getBreedgrade();
                        //判断是否匹配
                        //"Ⅱ级"
                        if (fly_ashBreedgrade == null || !fly_ashBreedgrade.equals(design_record.getFlyashgrade()))
                            continue;
                    } else continue;
                } else continue;
            } else {
                //如果数据库中粉煤灰为空，但用户录入不为空，匹配失败，跳过
                if (null != design_record.getFlyashcategory() && !design_record.getFlyashcategory().equals("null"))
                    continue;
                if (null != design_record.getFlyashgrade() && !design_record.getFlyashgrade().equals("null"))
                    continue;
            }

            //获取外加剂对象
            //如果用户录入的非空
            if (null != design_record.getReducewaterlevel() && !design_record.getReducewaterlevel().equals("null")) {
                String Waterreducersamplenumber = mix.getWaterreducersamplenumber();
                if (Waterreducersamplenumber != null) {
                    Admixture admixture = Adm_R.findOne(Waterreducersamplenumber);
                    if (admixture != null) {
                        String admintureBreedgrade = admixture.getBreedgrade();
                        //判断是否匹配
                        //"聚羧酸高性能减水剂-缓凝型"
                        if (admintureBreedgrade == null || !admintureBreedgrade.equals(design_record.getReducewaterlevel()))
                            continue;
                    } else continue;
                } else continue;
            } else {
                String Waterreducersamplenumber = mix.getWaterreducersamplenumber();
                if (Waterreducersamplenumber != null)
                    continue;
            }

            //获取石灰石粉
            //如果细度和亚甲蓝值任意一个被录入就表示录入了石灰石粉
            if (null == design_record.getLimestonefineness())
                design_record.setLimestonefineness("null");
            if (null == design_record.getLimestonebluevalue())
                design_record.setLimestonebluevalue("null");
            //如果用户没有录入石灰石粉
            if (design_record.getLimestonefineness().equals("null") || design_record.getLimestonebluevalue().equals("null")) {
                //如果配合比中石灰石粉不等于空就筛选掉这条记录
                if (null != mix.getLimestonepowdersamplenumber() && !mix.getLimestonepowdersamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getLimestonepowdersamplenumber() || mix.getLimestonepowdersamplenumber().equals("null"))
                    continue;
            }

            //获取膨胀剂
            if (null == design_record.getExpansionmodel())
                design_record.setExpansionmodel("null");
            //如果用户没有录入膨胀剂
            if (design_record.getExpansionmodel().equals("null")) {
                //如果配合比中膨胀剂不等于空就筛选掉这条记录
                if (null != mix.getExpansionagentsamplenumber() && !mix.getExpansionagentsamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getExpansionagentsamplenumber() || mix.getExpansionagentsamplenumber().equals("null"))
                    continue;
            }

            //获取其他材料
            if (null == design_record.getOthermaterialname())
                design_record.setOthermaterialname("null");
            //如果用户没有录入其他材料
            if (design_record.getOthermaterialname().equals("null")) {
                //如果配合比中其他材料不等于空就筛选掉这条记录
                if (null != mix.getSpecialmaterialsamplenumber() && !mix.getSpecialmaterialsamplenumber().equals("null"))
                    continue;
            } else {
                if (null == mix.getSpecialmaterialsamplenumber() || mix.getSpecialmaterialsamplenumber().equals("null"))
                    continue;
            }

            //如果条件都成立，加入列表
            new_construction_mixes.add(mix);
        }

        return new_construction_mixes;
    }

    //根据Construction_mix对象查询评分需要的数据，返回Rating_item对象
    public Rating_item query_for_rating(Construction_mix mix) {

        Rating_item rating_item = new Rating_item();

        /**混凝土类*/
        rating_item.setMaterialrequirements(mix.getMaterialrequirements());
        rating_item.setSlump(mix.getSlump());
        rating_item.setExpansion(mix.getExpansion());
        rating_item.setIntensity28d(mix.getIntensity28d());
        rating_item.setStrengthlevel1(mix.getStrengthlevel1());
        rating_item.setLimitexpansionrate1(mix.getLimitexpansionrate());

        /**原材料类*/
        //通过Id获取水泥对象，然后获取数据
        String Cementsamplenumber = mix.getCementsamplenumber();
        if (Cementsamplenumber != null) {
            Cement cement = Cem_R.findOne(Cementsamplenumber);
            if (cement != null) {
                rating_item.setBreedgrade(cement.getBreedgrade());
                rating_item.setSupplyunit(cement.getSupplyunit());
                rating_item.setCompression28d(cement.getCompression28d());
            }
        }

        //通过Id获取矿渣粉对象，然后获取数据
        String Slagpowdersamplenumber = mix.getSlagpowdersamplenumber();
        if (Slagpowdersamplenumber != null) {
            Slag_powder slag_powder = Sla_R.findOne(Slagpowdersamplenumber);
            if (slag_powder != null) {
                rating_item.setActivityindex28d(slag_powder.getActivityindex28d());
                rating_item.setBreedgrade1(slag_powder.getBreedgrade());
            }
        }

        //通过Id获取粉煤灰对象，然后获取数据
        String Flyashsamplenumber = mix.getFlyashsamplenumber();
        if (Flyashsamplenumber != null) {
            Fly_ash fly_ash = Fly_R.findOne(Flyashsamplenumber);
            if (fly_ash != null) {
                rating_item.setBreedgrade2(fly_ash.getBreedgrade());
                rating_item.setFineness1(fly_ash.getFineness());
                rating_item.setWaterdemandratio(fly_ash.getWaterdemandratio());
                rating_item.setLossonignition(fly_ash.getLossonignition());
            }
        }

        //通过Id获取膨胀剂对象，然后获取数据
        String Expansionagentsamplenumber = mix.getExpansionagentsamplenumber();
        if (Expansionagentsamplenumber != null) {
            Expansion_agent expansion_agent = Exp_R.findOne(Expansionagentsamplenumber);
            if (expansion_agent != null) {
                rating_item.setLimitexpansionrate2(expansion_agent.getLimitexpansionrate());
                rating_item.setCompressivestrength28d(expansion_agent.getCompressivestrength28d());
                rating_item.setExpansiongrade(expansion_agent.getBreedgrade());
            }
        }

        //通过Id获取外加剂对象，然后获取数据
        String Waterreducersamplenumber = mix.getWaterreducersamplenumber();
        if (Waterreducersamplenumber != null) {
            Admixture admixture = Adm_R.findOne(Waterreducersamplenumber);
            if (admixture != null) {
                rating_item.setWaterreductionrate(admixture.getWaterreductionrate());
            }
        }

        //通过Id获取石灰石粉对象，然后获取数据
        String Limestonepowdersamplenumber = mix.getLimestonepowdersamplenumber();
        if (Limestonepowdersamplenumber != null) {
            Limestone_powder limestone_powder = Lim_R.findOne(Limestonepowdersamplenumber);
            if (limestone_powder != null) {
                rating_item.setFineness2(limestone_powder.getFineness());
                rating_item.setMethylenebluevalue(limestone_powder.getMethylenebluevalue());
            }
        }

        return rating_item;
    }

    //根据Rating_item对象和评分规则进行评分
    //item_user表示用户输入的，也即前端传过来的，item_query是从数据库中查询的结果
    public Integer rating(Rating_item item_user, Rating_item item_query, int scoring_rule) {
        int total_score = 100;
        //获取评分规则
        Scoring_rules scoring_rules = Sco_R.findOne(scoring_rule);

        /**混凝土类*/
        //材料要求
        if (item_user.getMaterialrequirements() != item_query.getMaterialrequirements())
            total_score -= scoring_rules.getMaterialrequirements();
        //工作性能
        //坍落度
        String slump_user = item_user.getSlump();
        if (null != slump_user && !slump_user.equals("null")) {
            String pattern = "(\\d+)±(\\d+)";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(slump_user);
            if (m.find()) {
                int small = Integer.parseInt(m.group(1)) - Integer.parseInt(m.group(2));
                int big = Integer.parseInt(m.group(1)) + Integer.parseInt(m.group(2));
                if (item_query.getSlump() != null) {
                    int slump_query = Integer.parseInt(item_query.getSlump());
                    if (slump_query < (small - 10) || slump_query > (big + 10))
                        total_score -= scoring_rules.getWorkperformance() / 2;
                    else if (slump_query < small || slump_query > big)
                        total_score -= 2;
                } else total_score -= scoring_rules.getWorkperformance() / 2;
            }
        }
        //扩展度
        String expansion_user = item_user.getExpansion();
        if (null != expansion_user && !expansion_user.equals("null")) {
            int expansion_u = Integer.parseInt(expansion_user);
            if (item_query.getExpansion() != null && !item_query.getExpansion().equals("NULL")) {
                try {
                    int expansion_query = Integer.parseInt(item_query.getExpansion());
                    if (expansion_query < (expansion_u - 10))
                        total_score -= scoring_rules.getWorkperformance() / 2;
                    else if (expansion_query < expansion_u)
                        total_score -= 2;
                } catch (Exception e) {
                    total_score -= scoring_rules.getWorkperformance() / 2;
                }
            } else total_score -= scoring_rules.getWorkperformance() / 2;
        }
        //强度检测数据
        if (null != item_query.getIntensity28d() && !item_query.getIntensity28d().equals("NULL")) {
            double intensity28d_query = Double.valueOf(item_query.getIntensity28d());
            if (item_query.getStrengthlevel1() != null) {
                String pattern = "C(\\d+)";
                // 创建 Pattern 对象
                Pattern r = Pattern.compile(pattern);
                // 现在创建 matcher 对象
                Matcher m = r.matcher(item_query.getStrengthlevel1());
                if (m.find()) {
                    //value为标准值
                    int value = Integer.parseInt(m.group(1));
                    //检测是否低于标准值
                    if (intensity28d_query < value) {
                        total_score = 0;
                        return total_score;
                    } else if (intensity28d_query > (value * 1.8))
                        total_score -= scoring_rules.getIntensitydd();
                    else if (intensity28d_query < (value * 1.1) || intensity28d_query > (value * 1.25))
                        total_score -= 5;
                }
            }
        }
        //限制膨胀率
        if (item_user.getLimitexpansionrate1() != item_query.getLimitexpansionrate1())
            total_score -= scoring_rules.getLimitexpansionrate();

        //耐久性技术要求

        /**原材料类*/
        //水泥生产厂家：供应单位
        if (item_user.getSupplyunit() != item_query.getSupplyunit())
            total_score -= scoring_rules.getCementmanufacturer();
        //水泥28d抗压强度：抗压28d
        String breedgrade_query = item_query.getBreedgrade();
        if (breedgrade_query == "P·O42.5" || breedgrade_query == "P·O42.5R") {
            if (null != item_query.getCompression28d() && !item_query.getCompression28d().equals("null")) {
                double compression28d = Double.valueOf(item_query.getCompression28d());
                if (compression28d < 42.5)
                    total_score -= scoring_rules.getCementcs28d();
                else if (compression28d < 47)
                    total_score -= 3;
            } else
                total_score -= scoring_rules.getCementcs28d();
        }
        //矿渣粉28d活性指数：活性指数28d
        if (item_query.getBreedgrade1() != null && item_query.getActivityindex28d() != null
                && !item_query.getBreedgrade1().equals("NULL") && !item_query.getActivityindex28d().equals("NULL")) {
            double activityindex28d = Double.valueOf(item_query.getActivityindex28d());
            switch (item_query.getBreedgrade1()) {
                case "S105":
                    if (activityindex28d < 105) total_score -= scoring_rules.getSlagpowderi28d();
                    break;
                case "S95":
                    if (activityindex28d < 95) total_score -= scoring_rules.getSlagpowderi28d();
                    break;
                case "S75":
                    if (activityindex28d < 75) total_score -= scoring_rules.getSlagpowderi28d();
                    break;
            }
        }
        //粉煤灰细度：细度、需水量比
        if (item_query.getBreedgrade2() != null && item_query.getFineness1() != null
                && item_query.getWaterdemandratio() != null && !item_query.getBreedgrade2().equals("NULL")
                && !item_query.getFineness1().equals("NULL") && !item_query.getWaterdemandratio().equals("NULL")) {
            double fineness1 = Double.valueOf(item_query.getFineness1());
            double waterdemandratio = Double.valueOf(item_query.getWaterdemandratio());
            switch (item_query.getBreedgrade2()) {
                case "Ⅰ级":
                    if (fineness1 > 12 || waterdemandratio > 95) total_score -= scoring_rules.getFlyash();
                    break;
                case "Ⅱ级":
                    if (fineness1 > 30 || waterdemandratio > 105) total_score -= scoring_rules.getFlyash();
                    break;
                case "Ⅲ级":
                    if (fineness1 > 45 || waterdemandratio > 115) total_score -= scoring_rules.getFlyash();
                    break;
            }
        }
        //粉煤灰烧失量：烧失量
        if (item_query.getBreedgrade2() != null && item_query.getLossonignition() != null
                && !item_query.getBreedgrade2().equals("NULL") && !item_query.getLossonignition().equals("NULL")) {
            double lossonignition = Double.valueOf(item_query.getLossonignition());
            switch (item_query.getBreedgrade2()) {
                case "Ⅰ级":
                    if (lossonignition > 5) total_score -= scoring_rules.getFlyashloss();
                    break;
                case "Ⅱ级":
                    if (lossonignition > 8) total_score -= scoring_rules.getFlyashloss();
                    break;
                case "Ⅲ级":
                    if (lossonignition > 10) total_score -= scoring_rules.getFlyashloss();
                    break;
            }
        }

        //膨胀剂限制膨胀率：限制膨胀率(暂时没数据)

        //膨胀剂限制膨胀率28d抗压强度：28d抗压强度
        if (item_query.getCompressivestrength28d() != null && !item_query.getCompressivestrength28d().equals("NULL")) {
            //获取膨胀剂型号
            String kind = item_query.getExpansiongrade();
            if (kind != null && !kind.equals("NULL")) {
                char first = kind.charAt(0);
                if (first == 'Ⅰ' && Double.valueOf(item_query.getCompressivestrength28d()) < 22.5)
                    total_score -= scoring_rules.getExpansionagentcs28d();
                else if (first == 'Ⅱ' && Double.valueOf(item_query.getCompressivestrength28d()) < 42.5)
                    total_score -= scoring_rules.getExpansionagentcs28d();
            }
        }

        //外加剂减水率：减水率
        if (item_query.getWaterreductionrate() != null && !item_query.getWaterreductionrate().equals("NULL")) {
            double waterreductionrate = Double.valueOf(item_query.getWaterreductionrate());
            if (waterreductionrate < 25) total_score -= scoring_rules.getWaterreducer();
        }
        //石灰石粉细度：细度
        if (item_query.getFineness2() != null && !item_query.getFineness2().equals("NULL")) {
            double fineness2 = Double.valueOf(item_query.getFineness2());
            if (fineness2 > 15) total_score -= scoring_rules.getLimestonefineness();
        }
        //石灰石粉亚甲蓝值：亚甲蓝值
        if (item_query.getMethylenebluevalue() != null && !item_query.getMethylenebluevalue().equals("NULL")) {
            double methylenebluevalue = Double.valueOf(item_query.getMethylenebluevalue());
            if (methylenebluevalue > 1.4) total_score -= scoring_rules.getLimestonepowdermbv();
        }

        return total_score;
    }

    //根据单价计算价格，根据record计算表观密度
    public double[] costs(RecordingVO record, Price price) {
        double materialcosts = 0.0;
        double apparentdensity = 0.0;

        if (null != record.getCementconsumption() && !record.getCementconsumption().equals("null")) {
            double cem = Double.parseDouble(record.getCementconsumption());
            materialcosts += cem * price.getCement();
            apparentdensity += cem;
        }

        if (null != record.getFineaggregate1() && !record.getFineaggregate1().equals("null")) {
            double fin1 = Double.parseDouble(record.getFineaggregate1());
            materialcosts += fin1 * price.getFineaggregate1();
            apparentdensity += fin1;
        }
        if (null != record.getFineaggregate2() && !record.getFineaggregate2().equals("null")) {
            double fin2 = Double.parseDouble(record.getFineaggregate2());
            materialcosts += fin2 * price.getFineaggregate2();
            apparentdensity += fin2;
        }

        if (null != record.getCoarseaggregate1() && !record.getCoarseaggregate1().equals("null")) {
            double coa1 = Double.parseDouble(record.getCoarseaggregate1());
            materialcosts += coa1 * price.getCoarseaggregate1();
            apparentdensity += coa1;
        }
        if (null != record.getCoarseaggregate2() && !record.getCoarseaggregate2().equals("null")) {
            double coa2 = Double.parseDouble(record.getCoarseaggregate2());
            materialcosts += coa2 * price.getCoarseaggregate2();
            apparentdensity += coa2;
        }

        if (null != record.getWaterconsumption() && !record.getWaterconsumption().equals("null")) {
            double wat = Double.parseDouble(record.getWaterconsumption());
            materialcosts += wat * price.getWater();
            apparentdensity += wat;
        }

        if (null != record.getWaterreducingagentdosage() && !record.getWaterreducingagentdosage().equals("null")) {
            double wat = Double.parseDouble(record.getWaterreducingagentdosage());
            materialcosts += wat * price.getWaterreducingagent();
            apparentdensity += wat;
        }

        if (null != record.getFlyashdosage() && !record.getFlyashdosage().equals("null")) {
            double fly = Double.parseDouble(record.getFlyashdosage());
            materialcosts += fly * price.getFlyash();
            apparentdensity += fly;
        }

        if (null != record.getSlagpowderconsumption() && !record.getSlagpowderconsumption().equals("null")) {
            double sla = Double.parseDouble(record.getSlagpowderconsumption());
            materialcosts += sla * price.getSlagpowder();
            apparentdensity += sla;
        }

        if (null != record.getLimestonepowderconsumption() && !record.getLimestonepowderconsumption().equals("null")) {
            double lim = Double.parseDouble(record.getLimestonepowderconsumption());
            materialcosts += lim * price.getLimestonepowder();
            apparentdensity += lim;
        }

        if (null != record.getExpansionagentdosage() && !record.getExpansionagentdosage().equals("null")) {
            double exp = Double.parseDouble(record.getExpansionagentdosage());
            materialcosts += exp * price.getExpansionagent();
            apparentdensity += exp;
        }

        if (null != record.getSpecialmaterialdosage() && !record.getSpecialmaterialdosage().equals("null")) {
            double spe = Double.parseDouble(record.getSpecialmaterialdosage());
            materialcosts += spe * price.getOthermaterials();
            apparentdensity += spe;
        }

        //转化为吨的单位，并保留一位小数
        materialcosts = materialcosts / 1000;
        materialcosts = (double) Math.round(materialcosts * 10) / 10;

        //表观密度保留一位小数
        apparentdensity = (double) Math.round(apparentdensity * 10) / 10;

        double[] list = new double[2];
        list[0] = materialcosts;
        list[1] = apparentdensity;
        return list;
    }

}
