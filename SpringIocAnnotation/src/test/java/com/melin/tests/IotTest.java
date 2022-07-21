package com.melin.tests;

import com.melin.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
public class IotTest {

    ClassPathXmlApplicationContext ioc = null;

    @Before
    public void init(){
        ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
    }
    @Test
    public void test(){
        UserController userController = ioc.getBean("controller", UserController.class);
        System.out.println(userController);
    }
}
