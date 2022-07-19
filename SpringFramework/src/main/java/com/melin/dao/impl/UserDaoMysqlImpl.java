package com.melin.dao.impl;

import com.melin.dao.IUserDao;

/**
 * @Author Melin Chao
 * @Since 2022/7/19
 */
public class UserDaoMysqlImpl implements IUserDao {
    @Override
    public void getUser() {
        //query database
        System.out.println("query mysql dataBase!! ");
    }

    public UserDaoMysqlImpl() {
        System.out.println("UserDAOMysqlImpl.......");
    }
}
