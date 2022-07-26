package com.melin;

import com.melin.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author melin
 * @since 2022/7/25
 */
@ComponentScan
public class SecondJavaConfig {
    @Bean(name={"userdd1", "userdd2"})
    public User userSecondJavaConfig(){
        User user =  new User();
        user.setName("HHIHIHI");
return user;
    }
}
