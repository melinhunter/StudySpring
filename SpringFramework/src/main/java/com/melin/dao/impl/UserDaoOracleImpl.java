package com.melin.dao.impl;

import com.melin.dao.IUserDao;

/**
 * @Author Melin Chao
 * @Since 2022/7/19
 */
public class UserDaoOracleImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("query oracle DataBase");
    }

    public UserDaoOracleImpl() {
        System.out.println("UserDaoOracleImpl.......");
    }
}
