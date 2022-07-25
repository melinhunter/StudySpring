package com.melin;

/**
 * @author melin
 * @since 2022/7/22
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.melin.beans.Role;
import com.melin.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//相檔於XML<bean></bean>
@Configuration
@ComponentScan(basePackages = "com.melin")
@PropertySource("classpath:db.properties")
public class IocJavaConfig {
    @Bean("dd")
    public DruidDataSource dataSource(){
        System.out.println("name is " + name);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName(name);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean
    public Role role(){
        return new Role();
    }

    @Value("${mysql.username}")
    private String name;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.driverClassName}")
    private String driverClassName;
}
