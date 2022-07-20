package com.melin.tests;

import com.alibaba.druid.pool.DruidDataSource;
import com.melin.beans.Person;
import com.melin.beans.User;
import com.melin.beans.Wife;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author melin
 *
 */
public class IoCAdvanceTest {
    ClassPathXmlApplicationContext ioc;
    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring-ioc-advance.xml");
    }
    @Test
    public void test01(){
        System.out.println("Spring 已加載");
        //Person person = ioc.getBean("person", Person.class);
        //System.out.println(person);
    }
    @Test
    public void test02(){
        System.out.println("Spring 已加載");
        Wife wife = ioc.getBean("wife", Wife.class);
        //Person person = ioc.getBean("person", Person.class);
        //System.out.println(person);
    }
    @Test
    public void test03(){
        System.out.println("Spring 已加載");
        Wife wife2 = ioc.getBean("wife2", Wife.class);
        Wife wife21 = ioc.getBean("wife2", Wife.class);
        Wife wife3 = ioc.getBean("wife3", Wife.class);
        Wife wife31 = ioc.getBean("wife3", Wife.class);

        //Person person = ioc.getBean("person", Person.class);
        //System.out.println(person);
    }

    @Test
    public void test04(){
        System.out.println("Spring 已加載");
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);

        //Person person = ioc.getBean("person", Person.class);
        //System.out.println(person);
    }

    @Test
    public void test05(){
        System.out.println("Spring 已加載");
        Person person = ioc.getBean("person2", Person.class);
        System.out.println(person);

        //Person person = ioc.getBean("person", Person.class);
        //System.out.println(person);
    }

    /**
     * 自動注入
     */
    @Test
    public void test06(){
        System.out.println("Spring 已加載");
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);

    }

    /**
     * 自動注入
     */
    @Test
    public void test07(){
        System.out.println("Spring 已加載");
        Person person = ioc.getBean("person2", Person.class);
        System.out.println(person);

    }

    /**
     * 生命周期回調(CALL BACK)
     * 1. 使用接口(interface) 回調
     *      1. 初始化回調 實現InitializingBean override afterPropertiesSet
     *      2. 銷毁回調 實現DisposableBean override destroy
     * 2. 用Config 方式實現
     *      1. init-method
     *      2.
     */
    @Test
    public void test08(){
        System.out.println("Spring 已加載");
        Person person = ioc.getBean("person3", Person.class);
        System.out.println(person);
        ioc.close();

    }

    /**
     * 第三方Bean
     */
    @Test
    public void test09(){
        System.out.println("Spring 已加載");
        DruidDataSource ds = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(ds);
        ioc.close();

    }

    /**
     * SpEL
     */
    @Test
    public void test10(){
        Person person = ioc.getBean("personSpEL", Person.class);
        System.out.println(person);

    }
}
