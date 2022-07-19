package com.melin.tests;

import com.melin.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    ApplicationContext ioc;
    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
    }
    @Test
    public void test01(){
        System.out.println("取得BEN 用CLASS");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
    }
    @Test
    public void test02(){
        System.out.println("取得BEN 用ALIAS");
        User bean = ioc.getBean("melinuser",User.class);
        System.out.println(bean);
    }
    @Test
    public void test03(){
        System.out.println("取得BEN 用 Name");
        User bean = ioc.getBean("user3",User.class);
        System.out.println(bean);
    }
}
