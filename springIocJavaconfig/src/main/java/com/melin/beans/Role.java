package com.melin.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
@Component
public class Role {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(){
        System.out.println("Init Role !!");
    }
}
