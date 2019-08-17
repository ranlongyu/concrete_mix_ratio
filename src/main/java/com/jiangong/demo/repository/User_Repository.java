package com.jiangong.demo.repository;

import com.jiangong.demo.entity.database.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository extends JpaRepository<User,String> {
}
