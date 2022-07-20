package com.melin.tests;

import com.melin.beans.Person;
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
        System.out.println("取得BEN 用 Name");
        User bean6 = ioc.getBean("user6",User.class);
        System.out.println(bean6);
    }

    @Test
    public void test04(){
        System.out.println("取得 base contructor DI BEN");
        User bean = ioc.getBean("user7",User.class);
        System.out.println(bean);

    }

    @Test
    public void test05(){
        System.out.println("取得 複雜參數的DI");
        Person bean = ioc.getBean("person", Person.class);
        System.out.println(bean);

    }

    @Test
    public void test06(){
        System.out.println("取得 複雜參數的DI 使用內部Bean");
        Person bean = ioc.getBean("person2", Person.class);
        System.out.println(bean);

    }

    @Test
    public void test07(){
        System.out.println("取得 複雜參數的DI 使用內部Bean");
        Person bean = ioc.getBean("person3", Person.class);
        System.out.println(bean);

    }
    @Test
    public void test08(){
        System.out.println("取得 複雜參數的DI 使用內部Bean");
        Person bean = ioc.getBean("person4", Person.class);
        System.out.println(bean);

    }
}
