package com.melin.tests;

import com.alibaba.druid.pool.DruidDataSource;
import com.melin.IocJavaConfig;
import com.melin.controller.EmpController;
import com.melin.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author melin
 * @since 2022/7/22
 */
public class Test01 {


    ApplicationContext ioc;
    @Before
    public void init(){
        ioc =  new AnnotationConfigApplicationContext(IocJavaConfig.class);
    }

    /**
     *
     */
    @Test
    public void test01(){
        EmpController controller = ioc.getBean(EmpController.class);
        controller.getUser();
        UserController bean = ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public void test02() {
        DruidDataSource ds = ioc.getBean("dd",DruidDataSource.class);
        System.out.println(ds);

    }

    @Test
    public void test03() {
        DruidDataSource ds = ioc.getBean("dd",DruidDataSource.class);
        System.out.println(ds);

    }
}
