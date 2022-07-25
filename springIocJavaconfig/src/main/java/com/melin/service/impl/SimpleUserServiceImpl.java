package com.melin.service.impl;

import com.melin.dao.UserDao;
import com.melin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
@Service
public class SimpleUserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void getUser() {
        System.out.println("以 "+ this.getClass().getName() +" 實作" );
        userDao.getUser();
    }
}
