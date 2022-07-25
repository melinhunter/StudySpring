package com.melin.service.impl;

import com.melin.beans.Emp;
import com.melin.beans.User;
import com.melin.dao.EmpDao;
import com.melin.dao.UserDao;
import com.melin.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author melin
 * @since 2022/7/21
 */
@Service
public class EmpServiceImpl implements BasicService<Emp> {

    @Autowired
    EmpDao empDao;

    @Override
    public Emp getBean() {
        System.out.println("doing by EmpServiceImpl");
        return empDao.getBean();
    }
}
