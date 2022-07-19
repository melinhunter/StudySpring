package com.melin.app;

import com.melin.service.IUserService;
import com.melin.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Melin Chao
 * @Since 2022/7/19
 */
public class MyTest {
    @Autowired
    IUserService service;
    public static void main(String[] args) {

        //加載Spring 上下文 加載IOC 容器
        //ApplicationEontext Spring 的最上層核心接口
        //ClassPathXmlApplicationContext 根據CLASS PATH 的XML配置來實例化Spring 容器.
        //FileSystemXmlApplicationContext 根據硬碟路徑的XML配置來實例化Spring 容器.
        //AnnotationConfigApplicationContext 根據JAVA CONFIG(純註解)方式來配置
        //在容器實例化時就會加載LOAD 所有的Bean

        ApplicationContext ioc = new ClassPathXmlApplicationContext("melinSpring.xml", "service.xml");
        System.out.println("Spring 容器已加載");
        //IuserService[] service = ioc.getBean(UserService.class);

        IUserService service1 = (IUserService)ioc.getBean("userService2");
        IUserService service2 = ioc.getBean("userService", IUserService.class);

        service1.getUser();
        service2.getUser();


    }
}
