package com.melin.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author melin
 * @since 2022/7/21
 */
public class Emp {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}
