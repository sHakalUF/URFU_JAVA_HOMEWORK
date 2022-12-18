package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);

//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(
//                        userBuilder
//                                .username("admin")
//                                .password("admin")
//                                .roles("MANAGER", "HR", "EMPLOYEE"))
//                .withUser(
//                        userBuilder
//                                .username("user")
//                                .password("user")
//                                .roles("HR"))
//                .withUser(
//                        userBuilder
//                                .username("employee")
//                                .password("employee")
//                                .roles("EMPLOYEE"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("MANAGER", "HR", "EMPLOYEE")
                .antMatchers("/hr/**").hasRole("HR")
                .antMatchers("/manager_info/**").hasRole("MANAGER")
                .and()
                .formLogin()
                .permitAll();
    }
}
