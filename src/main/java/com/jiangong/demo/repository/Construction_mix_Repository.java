package com.jiangong.demo.repository;

import com.jiangong.demo.entity.database.Construction_mix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Construction_mix_Repository extends JpaRepository<Construction_mix,Integer> {


    //根据混凝土品种、强度等级、抗渗等级进行查询
    public List<Construction_mix> findByConcretevarietyAndStrengthlevel1AndImpermeabilityrating
            (String Concrete_variety,String Strength_level,String Impermeabilityrating);

    @Query(value ="SELECT samplenumber from Construction_mix where sampleid=5")
    public List<String> findBySampleid();

    /** 实现多值匹配 */
    @Query(value = "select id,concretevariety,strengthlevel1,impermeabilityrating,projectname " +
            "from Construction_mix " +
            "where concretevariety in :varietys " +
            "and strengthlevel1= :Strengthlevel1 " +
            "and impermeabilityrating= :Impermeabilityrating")
    List<Construction_mix> getVarietys(@Param("varietys") String[] varietys,
                                       @Param("Strengthlevel1") String Strengthlevel1,
                                       @Param("Impermeabilityrating") String Impermeabilityrating);

    /** 实现多值匹配 */
    public List<Construction_mix> findByIdIn(List<Integer> id);


}
