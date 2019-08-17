package com.jiangong.demo.service;

import com.jiangong.demo.entity.database.User;
import com.jiangong.demo.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class User_service implements UserDetailsService {

    @Autowired
    User_Repository Use_R;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = Use_R.findOne(username);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
    }
}
