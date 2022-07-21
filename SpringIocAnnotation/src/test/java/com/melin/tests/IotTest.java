package com.melin.tests;

import com.melin.beans.User;
import com.melin.controller.UserController;
import com.melin.dao.UserDao;
import com.melin.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        UserController userController = ioc.getBean("userController", UserController.class);
        System.out.println(userController);
    }

    @Test
    public void test2(){
        UserDao bean = ioc.getBean(UserDao.class);
        System.out.println(bean);
    }
    @Test
    public void test21(){
        UserController bean = ioc.getBean(UserController.class);
        System.out.println(bean);
        User bean2 = ioc.getBean("user", User.class);
        System.out.println(bean2);
    }
    @Test
    public void test3(){
        User bean = ioc.getBean("user", User.class);
        System.out.println(bean.getName());
    }
    @Test
    public void test4(){
        UserController bean = ioc.getBean("userController", UserController.class);
        bean.getUser();
        //System.out.println(bean.getUser());
    }

    @Test
    public void test5(){
        UserService bean = ioc.getBean(UserService.class);
        bean.getUser();
        //System.out.println(bean.getUser());
    }
    @Test
    public void testx3(){
        AnnotationConfigApplicationContext aalc = new AnnotationConfigApplicationContext();
        aalc.scan("com.melin");
        User bean = aalc.getBean(User.class);

        System.out.println(bean);
    }
}
