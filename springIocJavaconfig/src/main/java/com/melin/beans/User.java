package com.melin.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
@Component
public class User {
    /**
     * 使用@Value 可以設定依賴注入的屬性
     * 1. 除了可以寫硬編碼
     * 2. ${} #{};SpEL 表達式
     */
   private String name;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
