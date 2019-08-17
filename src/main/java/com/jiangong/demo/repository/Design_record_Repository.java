package com.jiangong.demo.repository;

import com.jiangong.demo.entity.database.Design_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Design_record_Repository extends JpaRepository<Design_record, Integer> {

    @Query(value = "SELECT d FROM Design_record d WHERE d.username=?1")
    public List<Design_record> findRecord(String username);
}
