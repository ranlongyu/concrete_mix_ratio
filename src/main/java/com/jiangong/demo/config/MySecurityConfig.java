package com.jiangong.demo.config;

import com.jiangong.demo.service.User_service;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.annotation.Resource;
import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private DataSource dataSource;

    @Bean
    UserDetailsService user_service() {
        return new User_service();
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        // 配置数据源
        jdbcTokenRepository.setDataSource(dataSource);
        //自动创建数据库表，使用一次后注释掉，不然会报错
        //jdbcTokenRepository.setCreateTableOnStartup(true);
        return jdbcTokenRepository;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        //授权规则
        http.headers().frameOptions().sameOrigin();
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/hello").hasRole("admin");

        //开启自动登录
        http.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/index");

        //开启记住我功能
        http.rememberMe()
                .tokenRepository(persistentTokenRepository())
                .tokenValiditySeconds(1209600);

        //默认都会产生一个hiden标签 里面有安全相关的验证 这边我们不需要 可禁用掉
        http.csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        //认证规则
        //auth.inMemoryAuthentication().withUser("admin").password("123456").roles("admin");
        //使用JPA进行认证
        auth.userDetailsService(user_service());
    }
}

