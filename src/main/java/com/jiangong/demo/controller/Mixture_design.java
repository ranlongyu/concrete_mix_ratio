package com.jiangong.demo.controller;

import com.jiangong.demo.VO.Design_addVO;
import com.jiangong.demo.VO.RecordingVO;
import com.jiangong.demo.entity.Price;
import com.jiangong.demo.entity.Rating_item;
import com.jiangong.demo.entity.database.*;
import com.jiangong.demo.repository.Choose_Repository;
import com.jiangong.demo.repository.Constraint_rules_Repository;
import com.jiangong.demo.repository.Design_record_Repository;
import com.jiangong.demo.repository.Scoring_rules_Repository;
import com.jiangong.demo.service.Choose_service;
import com.jiangong.demo.service.Match_query_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 智能设计控制器
 */

@Controller
public class Mixture_design {

    @Autowired
    private Design_record_Repository Des_R;

    //service注入
    @Autowired
    private Match_query_service match_queryService;

    @Autowired
    private Choose_service choose_service;

    @Autowired
    private Choose_Repository Cho_R;

    @Autowired
    private Constraint_rules_Repository Cons_R;

    @Autowired
    private Scoring_rules_Repository Sco_R;

    //从主页点击智能设计按钮
    @GetMapping("/design/list")
    public String list_page(Model model, HttpServletRequest request) {
        //获取登录的用户
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        org.springframework.security.core.userdetails.User user = (org.springframework.security.core.userdetails.User) auth.getPrincipal();
        //根据用户名查询历史记录
        List<Design_record> design_records = Des_R.findRecord(user.getUsername());
        //返回查询记录
        model.addAttribute("design_records", design_records);
        return "intelligent_design/design_list";
    }

    //删除设计历史
    @DeleteMapping("/design/delete/{id}")
    public String delete_design(@PathVariable("id") String _id) {
        String[] arr = _id.split(",");
        for (String id : arr
        ) {
            Des_R.delete(Integer.parseInt(id));
        }
        return "redirect:/design/list";
    }

    //添加设计页面
    @GetMapping(value = "/design/add")
    @ResponseBody
    public Design_addVO add_page(ModelAndView model) {
        //选项字段
        Choose choose = Cho_R.findAll().get(0);
        //规则列表
        List<Constraint_rules> constraint_rules = Cons_R.findAll();
        //评分规则
        List<Scoring_rules> scoring_rules = Sco_R.findAll();

        Design_addVO design_addVO = new Design_addVO();
        design_addVO.setChoose(choose);
        design_addVO.setConstraint_rules(constraint_rules);
        design_addVO.setScoring_rules(scoring_rules);
        //model.addObject("choose",choose);
        //model.addObject("constraint_rules",constraint_rules);
        //model.addObject("design_addVO",design_addVO);
        //model.setViewName("intelligent_design/begin_design");
        return design_addVO;
    }

    //设计提交后显示的内容
    @PostMapping("/design/submit")
    public ModelAndView submit_page(HttpServletRequest request, ModelAndView model) {

        //获取前端数据
        String timeSeg = request.getParameter("时间段");
        String[] mixtureKind = request.getParameterValues("混凝土品种");
        String stength = request.getParameter("强度等级");
        String kangsheng = request.getParameter("抗渗");
        String[] material = request.getParameterValues("材料要求");
        String pengzhang = request.getParameter("限制膨胀率");
        String tanluo = request.getParameter("坍落度");
        String kuozhan = request.getParameter("扩展度");

        //耐久性技术要求
        String laijiuxin = request.getParameter("耐久");
        //其他技术要求
        String qita = request.getParameter("其他");

        //水泥
        String shuikind = request.getParameter("水泥品种等级");
        String shui28compress = request.getParameter("水泥28d抗压强度");
        String shuichangjia = request.getParameter("水泥生产厂家");
        //细集料1
        String xi1kind = request.getParameter("Fine aggregate variety 1");
        String xi1xinhao = request.getParameter("Fine aggregate model 1");
        String xi1xidumoshu = request.getParameter("Fineness modulus 1");
        //细集料2
        String xi2kind = request.getParameter("Fine aggregate variety 2");
        String xi2xinhao = request.getParameter("Fine aggregate model 2");
        String xi2xidumoshu = request.getParameter("Fineness modulus 2");
        //细集料3
        String xi3kind = request.getParameter("Fine aggregate variety 3");
        String xi3xinhao = request.getParameter("Fine aggregate model 3");
        String xi3xidumoshu = request.getParameter("Fineness modulus 3");
        //粗集料1
        String cu1kind = request.getParameter("Coarse aggregate variety 1");
        String cu1xinhao = request.getParameter("Coarse aggregate model 1");
        String lower1 = request.getParameter("lower model 1");
        String upper1 = request.getParameter("upper model 1");
        if (lower1 != null && !lower1.equals("null") && upper1 != null && !upper1.equals("null"))
            cu1xinhao = lower1 + '-' + upper1;
        //粗集料2
        String cu2kind = request.getParameter("Coarse aggregate variety 2");
        String cu2xinhao = request.getParameter("Coarse aggregate model 2");
        String lower2 = request.getParameter("lower model 2");
        String upper2 = request.getParameter("upper model 2");
        if (lower2 != null && !lower2.equals("null") && upper2 != null && !upper2.equals("null"))
            cu2xinhao = lower2 + '-' + upper2;
        //粗集料3
        String cu3kind = request.getParameter("Coarse aggregate variety 3");
        String cu3xinhao = request.getParameter("Coarse aggregate model 3");
        String lower3 = request.getParameter("lower model 3");
        String upper3 = request.getParameter("upper model 3");
        if (lower3 != null && !lower3.equals("null") && upper3 != null && !upper3.equals("null"))
            cu3xinhao = lower3 + '-' + upper3;
        //减水剂
        String jianshuijikind = request.getParameter("减水剂品种等级");
        String jiancanliang = request.getParameter("推荐渗量");
        String jianshuilv = request.getParameter("减水率");
        String jianhanqiliang = request.getParameter("含气量");
        String jiankangya28d = request.getParameter("抗压强度比28d");
        String jianqingshuilv = request.getParameter("泌水率比");
        //粉煤灰
        String fenleibie = request.getParameter("Category of fly ash0");
        String fenpingzhong = request.getParameter("Grade of fly ash variety0");
        String fenxidu = request.getParameter("Fineness of fly ash0");
        String fenxushuiliangbi = request.getParameter("Water demand ratio0");
        String fenshaoshiliang = request.getParameter("Loss of burning0");
        String fenhuoxing28d = request.getParameter("Activity index of fly ash0");
        //矿渣粉
        String kuangzhafendengji = request.getParameter("Grade of slag powder0");
        String kuangzhahuoxing28d = request.getParameter("Activity index of slag0");
        String kuangzhachangjia = request.getParameter("Slag powder manufacturers0");
        //石灰石粉
        String shixidu = request.getParameter("Limestone fineness0");
        String shiyajialanzhi = request.getParameter("Methylene blue value0");
        String shihuoxin28d = request.getParameter("Limestone activity index0");
        //膨胀剂
        String pengpingzhong = request.getParameter("Type of expander0");
        String pengkangya28d = request.getParameter("Expansion agent strength0");
        String pengpengzhanglv = request.getParameter("Limiting expansion rate0");
        //其他材料
        String qitamingcheng = request.getParameter("otherName0");
        String qitaxinhao = request.getParameter("otherModel0");
        String qitayongliang = request.getParameter("otherUse0");
        //评分规则
        String score_id = request.getParameter("score_number");
        //价格
        String jiashuini = request.getParameter("水泥价格");
        String jiaxi1 = request.getParameter("Fine aggregate price 1");
        String jiaxi2 = request.getParameter("Fine aggregate price 2");
        String jiacu1 = request.getParameter("Coarse aggregate price 1");
        String jiacu2 = request.getParameter("Coarse aggregate price 2");
        String jiashui = request.getParameter("水价格");
        String jiajianshuiji = request.getParameter("减水剂价格");
        String jiafenmeihui = request.getParameter("Price of fly ash");
        String jiakuangzhafen = request.getParameter("Slag powder price");
        String jiashihuishifen = request.getParameter("limestone price");
        String jiapengzhangji = request.getParameter("Expander price");
        String jiaqitacailiao = request.getParameter("other material price");

        /**从前端获取匹配数据，对数据格式化*/
        //月份
        //混凝土品种
        StringBuffer buffer1 = new StringBuffer();
        for (String mix : mixtureKind
        ) {
            buffer1.append(mix).append("\\");
        }
        String _Concretevariety = buffer1.substring(0, buffer1.length() - 1);
        //强度等级
        //抗渗等级
        String _Impermeabilityrating = kangsheng;
        if (_Impermeabilityrating != null && _Impermeabilityrating.equals("null"))
            _Impermeabilityrating = null;
        //水泥品种等级
        //矿渣粉品种等级
        //粉煤灰类别
        //粉煤灰品种等级
        //外加剂品种等级

        /**从前端获取评分数据，对数据格式化*/
        Rating_item item_user = new Rating_item();

        //材料要求
        String _well_material = "";
        if (material != null && material.length != 0) {
            StringBuffer buffer2 = new StringBuffer();
            for (String mat : material
            ) {
                buffer2.append(mat).append("、");
            }
            String well_material = buffer2.substring(0, buffer2.length() - 1);
            item_user.setMaterialrequirements(well_material);
            _well_material = well_material;
        }
        //工作性能要求：坍落度、扩展度
        //坍落度
        item_user.setSlump(tanluo);
        //扩展度
        item_user.setExpansion(kuozhan);
        //限制膨胀率
        item_user.setLimitexpansionrate1(pengzhang);
        //水泥生产厂家：供应单位
        item_user.setSupplyunit(shuichangjia);

        //System.out.println(item_user.toString());

        /**记录用户的设计记录*/
        Design_record design_record = new Design_record();
        //设计时间
        Date time = new Date();
        design_record.setTime(time);
        //用户名
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        design_record.setUsername(userDetails.getUsername());
        //时间段
        design_record.setPeriod(timeSeg);
        //混凝土品种
        design_record.setConcretevariety(_Concretevariety);
        //强度等级
        design_record.setPowerlevel(stength);
        //抗渗等级
        design_record.setImpermerating(_Impermeabilityrating);
        //材料要求
        design_record.setMaterialrequirements(_well_material);
        //限制膨胀率
        design_record.setLimitexpansionrate(pengzhang);
        //坍落度
        design_record.setSlump(tanluo);
        //扩展度
        design_record.setExpansion(kuozhan);
        //耐久性技术要求
        design_record.setDurrequirements(laijiuxin);
        //其他技术要求
        design_record.setOtherrequirements(qita);
        //水泥品种等级
        design_record.setCementgrade(shuikind);
        //水泥28d抗压强度
        design_record.setCementcompress28d(shui28compress);
        //水泥生产厂家：供应单位
        design_record.setCementmanufacturer(shuichangjia);

        //细集料1品种
        design_record.setFineaggregate1variety(xi1kind);
        //细集料1型号
        design_record.setFineaggregate1model(xi1xinhao);
        //细集料1细度模数
        design_record.setFineaggregate1fm(xi1xidumoshu);
        //细集料2品种
        design_record.setFineaggregate2variety(xi2kind);
        //细集料2型号
        design_record.setFineaggregate2model(xi2xinhao);
        //细集料2细度模数
        design_record.setFineaggregate2fm(xi2xidumoshu);
        //细集料3品种
        design_record.setFineaggregate3variety(xi3kind);
        //细集料3型号
        design_record.setFineaggregate3model(xi3xinhao);
        //细集料3细度模数
        design_record.setFineaggregate3fm(xi3xidumoshu);
        //粗集料1品种
        design_record.setCoarseaggregate1variety(cu1kind);
        //粗集料1型号
        design_record.setCoarseaggregate1model(cu1xinhao);
        //粗集料2品种
        design_record.setCoarseaggregate2variety(cu2kind);
        //粗集料2型号
        design_record.setCoarseaggregate2model(cu2xinhao);
        //粗集料3品种
        design_record.setCoarseaggregate3variety(cu3kind);
        //粗集料3型号
        design_record.setCoarseaggregate3model(cu3xinhao);

        //减水剂品种等级
        design_record.setReducewaterlevel(jianshuijikind);
        //推荐渗量
        design_record.setReducerecommendamount(jiancanliang);
        //减水率
        design_record.setReducewaterrate(jianshuilv);
        //含气量
        design_record.setReducegascontent(jianhanqiliang);
        //抗压强度比28d
        design_record.setReducecompress28d(jiankangya28d);
        //泌水率比
        design_record.setReducebleedratio(jianqingshuilv);

        //粉煤灰类别
        design_record.setFlyashcategory(fenleibie);
        //粉煤灰品种等级
        design_record.setFlyashgrade(fenpingzhong);
        //粉细度
        design_record.setFlyfineness(fenxidu);
        //粉需水量比
        design_record.setFlywaterneed(fenxushuiliangbi);
        //粉烧失量
        design_record.setFlyloss(fenshaoshiliang);
        //粉28d活性指数
        design_record.setFly28dactivity(fenhuoxing28d);

        //矿渣粉品种等级
        design_record.setSlagpowdergrade(kuangzhafendengji);
        //矿28d活性指数
        design_record.setSlag28dactivity(kuangzhahuoxing28d);
        //矿生产厂家
        design_record.setSlagmanufacturer(kuangzhachangjia);

        //石灰石粉细度
        design_record.setLimestonefineness(shixidu);
        //石亚甲蓝值
        design_record.setLimestonebluevalue(shiyajialanzhi);
        //石28d活性指数
        design_record.setLimestone28dactivity(shihuoxin28d);

        //膨胀剂型号
        design_record.setExpansionmodel(pengpingzhong);
        //膨28d抗压强度
        design_record.setExpansion28d(pengkangya28d);
        //膨限制膨胀率
        design_record.setExpansionlimit(pengpengzhanglv);

        //其他材料名称
        design_record.setOthermaterialname(qitamingcheng);
        //其他材料型号
        design_record.setOthermaterialmodel(qitaxinhao);
        //其他材料用量
        design_record.setOthermaterialconsumption(qitayongliang);

        /**存储记录*/
        Des_R.save(design_record);

        /**从前端获取材料价格*/
        //前端传过来的价格单位为吨
        Price price = new Price();
        //水泥
        if (null != jiashuini && !jiashuini.equals(""))
            price.setCement(Double.parseDouble(jiashuini));
        else
            price.setCement(0);
        //细集料1
        if (null != jiaxi1 && !jiaxi1.equals(""))
            price.setFineaggregate1(Double.parseDouble(jiaxi1));
        else
            price.setFineaggregate1(0);
        //细集料2
        if (null != jiaxi2 && !jiaxi2.equals(""))
            price.setFineaggregate2(Double.parseDouble(jiaxi2));
        else
            price.setFineaggregate2(0);
        //粗集料1
        if (null != jiacu1 && !jiacu1.equals(""))
            price.setCoarseaggregate1(Double.parseDouble(jiacu1));
        else
            price.setCoarseaggregate1(0);
        //粗集料2
        if (null != jiacu2 && !jiacu2.equals(""))
            price.setCoarseaggregate2(Double.parseDouble(jiacu2));
        else
            price.setCoarseaggregate2(0);
        //水
        if (null != jiashui && !jiashui.equals(""))
            price.setWater(Double.parseDouble(jiashui));
        else
            price.setWater(0);
        //减水剂
        if (null != jiajianshuiji && !jiajianshuiji.equals(""))
            price.setWaterreducingagent(Double.parseDouble(jiajianshuiji));
        else
            price.setWaterreducingagent(0);
        //粉煤灰
        if (null != jiafenmeihui && !jiafenmeihui.equals(""))
            price.setFlyash(Double.parseDouble(jiafenmeihui));
        else
            price.setFlyash(0);
        //矿渣粉
        if (null != jiakuangzhafen && !jiakuangzhafen.equals(""))
            price.setSlagpowder(Double.parseDouble(jiakuangzhafen));
        else
            price.setSlagpowder(0);
        //石灰石粉
        if (null != jiashihuishifen && !jiashihuishifen.equals(""))
            price.setLimestonepowder(Double.parseDouble(jiashihuishifen));
        else
            price.setLimestonepowder(0);
        //膨胀剂
        if (null != jiapengzhangji && !jiapengzhangji.equals(""))
            price.setExpansionagent(Double.parseDouble(jiapengzhangji));
        else
            price.setExpansionagent(0);
        //其他材料
        if (null != jiaqitacailiao && !jiaqitacailiao.equals(""))
            price.setOthermaterials(Double.parseDouble(jiaqitacailiao));
        else
            price.setOthermaterials(0);

        /**查询匹配数据*/
        List<Construction_mix> list = match_queryService.query_for_necessary(design_record);

        //System.out.println(list.size());

        /**VO层数据拼装*/
        List<RecordingVO> recondingVOList = new ArrayList<>();
        //遍历列表查询数据并计算评分，再进行封装
        for (Construction_mix mix : list
        ) {
            Rating_item item_query = match_queryService.query_for_rating(mix);
            double rating = match_queryService.rating(item_user, item_query, Integer.parseInt(score_id));

            RecordingVO recordingVO = new RecordingVO();

            //测试用的id，记录该记录对应的编号
            recordingVO.setId(mix.getId().toString());

            recordingVO.setCementconsumption(String.format("%.0f", Double.valueOf(mix.getCementconsumption())));
            //粗细集料从数据库中查询
            if (null == xi1xinhao)
                recordingVO.setFineaggregate1(String.valueOf(0));
            else
                switch (xi1xinhao) {
                    case "粗砂":
                        recordingVO.setFineaggregate1(String.format("%.0f", Double.valueOf(mix.getCoarsesandconsumption())));
                        break;
                    case "中砂":
                        recordingVO.setFineaggregate1(String.format("%.0f", Double.valueOf(mix.getMediumsandconsumption())));
                        break;
                    case "特细砂":
                        recordingVO.setFineaggregate1(String.format("%.0f", Double.valueOf(mix.getExtrafinesandconsumption())));
                        break;
                    default:
                        recordingVO.setFineaggregate1(String.valueOf(0));
                }
            if (null == xi2xinhao)
                recordingVO.setFineaggregate2(String.valueOf(0));
            else
                switch (xi2xinhao) {
                    case "粗砂":
                        recordingVO.setFineaggregate2(String.format("%.0f", Double.valueOf(mix.getCoarsesandconsumption())));
                        break;
                    case "中砂":
                        recordingVO.setFineaggregate2(String.format("%.0f", Double.valueOf(mix.getMediumsandconsumption())));
                        break;
                    case "特细砂":
                        recordingVO.setFineaggregate2(String.format("%.0f", Double.valueOf(mix.getExtrafinesandconsumption())));
                        break;
                    default:
                        recordingVO.setFineaggregate2(String.valueOf(0));
                }
            if (null == xi3xinhao)
                recordingVO.setFineaggregate3(String.valueOf(0));
            else
                switch (xi3xinhao) {
                    case "粗砂":
                        recordingVO.setFineaggregate3(String.format("%.0f", Double.valueOf(mix.getCoarsesandconsumption())));
                        break;
                    case "中砂":
                        recordingVO.setFineaggregate3(String.format("%.0f", Double.valueOf(mix.getMediumsandconsumption())));
                        break;
                    case "特细砂":
                        recordingVO.setFineaggregate3(String.format("%.0f", Double.valueOf(mix.getExtrafinesandconsumption())));
                        break;
                    default:
                        recordingVO.setFineaggregate3(String.valueOf(0));
                }
            if (null == cu1xinhao)
                recordingVO.setCoarseaggregate1(String.valueOf(0));
            else
                switch (cu1xinhao) {
                    case "10-20":
                        recordingVO.setCoarseaggregate1(String.format("%.0f", Double.valueOf(mix.getBigstonedosage())));
                        break;
                    case "5-10":
                        recordingVO.setCoarseaggregate1(String.format("%.0f", Double.valueOf(mix.getSmallstonedosage())));
                        break;
                    default:
                        recordingVO.setCoarseaggregate1(String.valueOf(0));
                }
            if (null == cu2xinhao)
                recordingVO.setCoarseaggregate2(String.valueOf(0));
            else
                switch (cu2xinhao) {
                    case "10-20":
                        recordingVO.setCoarseaggregate2(String.format("%.0f", Double.valueOf(mix.getBigstonedosage())));
                        break;
                    case "5-10":
                        recordingVO.setCoarseaggregate2(String.format("%.0f", Double.valueOf(mix.getSmallstonedosage())));
                        break;
                    default:
                        recordingVO.setCoarseaggregate2(String.valueOf(0));
                }
            if (null == cu3xinhao)
                recordingVO.setCoarseaggregate3(String.valueOf(0));
            else
                switch (cu3xinhao) {
                    case "10-20":
                        recordingVO.setCoarseaggregate3(String.format("%.0f", Double.valueOf(mix.getBigstonedosage())));
                        break;
                    case "5-10":
                        recordingVO.setCoarseaggregate3(String.format("%.0f", Double.valueOf(mix.getSmallstonedosage())));
                        break;
                    default:
                        recordingVO.setCoarseaggregate3(String.valueOf(0));
                }

            //水用量=水用量+回收水用量
            double water = Double.valueOf(mix.getWaterconsumption()) + Double.valueOf(mix.getRecycledwaterconsumption());
            recordingVO.setWaterconsumption(String.format("%.0f", water));
            recordingVO.setWaterreducingagentdosage(String.format("%.2f", Double.valueOf(mix.getWaterreducingagentdosage())));
            recordingVO.setFlyashdosage(String.format("%.0f", Double.valueOf(mix.getFlyashdosage())));
            recordingVO.setSlagpowderconsumption(String.format("%.0f", Double.valueOf(mix.getSlagpowderconsumption())));
            recordingVO.setLimestonepowderconsumption(String.format("%.0f", Double.valueOf(mix.getLimestonepowderconsumption())));
            recordingVO.setExpansionagentdosage(String.format("%.0f", Double.valueOf(mix.getExpansionagentdosage())));
            recordingVO.setSpecialmaterialdosage(String.format("%.0f", Double.valueOf(mix.getSpecialmaterialdosage())));
            try {
                recordingVO.setIntensity28d(String.format("%.1f", Double.valueOf(mix.getIntensity28d())));
            } catch (Exception e) {
                recordingVO.setIntensity28d("null");
            }
            recordingVO.setRating(String.valueOf(rating));

            //根据单价计算价格，根据record计算表观密度
            double[] need = match_queryService.costs(recordingVO, price);
            recordingVO.setMaterialcosts(String.valueOf(need[0]));
            recordingVO.setApparentdensity(String.valueOf(need[1]));

            //踢出评分很小的值
            if (rating > 10)
                recondingVOList.add(recordingVO);
        }

        //对封装好的配合比排序
        //排序方式按分数
        List<RecordingVO> sortbyrating = new ArrayList<>(recondingVOList);
        sortbyrating.sort(new Comparator<RecordingVO>() {
            @Override
            public int compare(RecordingVO o1, RecordingVO o2) {
                return -Double.valueOf(o1.getRating()).compareTo(Double.valueOf(o2.getRating()));
            }
        });
        //排序方式按价格
        List<RecordingVO> sortbyprice = new ArrayList<>(recondingVOList);
        sortbyprice.sort(new Comparator<RecordingVO>() {
            @Override
            public int compare(RecordingVO o1, RecordingVO o2) {
                return Double.valueOf(o1.getMaterialcosts()).compareTo(Double.valueOf(o2.getMaterialcosts()));
            }
        });
        //综合排序
        for (RecordingVO vaule : recondingVOList
        ) {
            double overallrating = sortbyrating.indexOf(vaule) * 0.5 + sortbyprice.indexOf(vaule) * 0.5;
            vaule.setOverallrating(String.valueOf(overallrating));   //改变了recondingVOList中每个元素的overallrating的值
        }
        List<RecordingVO> sortbywhole = new ArrayList<>(recondingVOList);
        sortbywhole.sort(new Comparator<RecordingVO>() {
            @Override
            public int compare(RecordingVO o1, RecordingVO o2) {
                return Double.valueOf(o1.getOverallrating()).compareTo(Double.valueOf(o2.getOverallrating()));
            }
        });

        //打印出返回给前端的第一条记录的id
        //System.out.println(sortbywhole.get(0).getId());

        /**返回数据*/
        //大于10条取前10条，否则全部返回。
        model.addObject("sortbywhole", sortbywhole.size() > 10 ? sortbywhole.subList(0, 10) : sortbywhole);
        //返回前端选择的信息
        model.addObject("item_user", item_user);
        model.addObject("price", price);
        model.addObject("design_record", design_record);
        //System.out.println(design_record.toString());

        model.setViewName("intelligent_design/submission");
        return model;
    }
}
