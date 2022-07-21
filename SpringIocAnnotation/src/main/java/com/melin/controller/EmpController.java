package com.melin.controller;

import com.melin.beans.Emp;
import com.melin.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author melin
 * @since 2022/7/21
 */
@Controller
public class EmpController {
    @Autowired
    BasicService<Emp> service;

    public void getUser(){
        System.out.println(service.getBean().getName());
    }
}
