package com.melin.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
    }
}
