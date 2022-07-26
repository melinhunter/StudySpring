package com.melin;

/**
 * @author melin
 * @since 2022/7/22
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.melin.beans.Role;
import com.melin.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//相檔於XML<bean></bean>
@Configuration
@ComponentScan(basePackages = "com.melin")
//@PropertySource("classpath:db.properties")
//@Import(SecondJavaConfig.class )
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

    @Bean
    public Role role(User userdd1){
        System.out.println(userdd1.getName());

        return new Role();
    }

}
