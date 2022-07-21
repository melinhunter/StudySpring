package com.melin.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
@Component
public class User {

    @Value("司馬無悔")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
