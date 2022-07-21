package com.melin.service.impl;

import com.melin.dao.IUserDao;
import com.melin.service.IUserService;

/**
 * @Author 9204909
 * @Since 2022/7/19
 */
public class UserServiceImpl implements IUserService {

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    public IUserDao getDao() {
        return dao;
    }

    IUserDao dao;
    @Override
    public void getUser() {
        dao.getUser();
    }
}
