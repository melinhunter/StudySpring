package com.melin.dao.impl;

import com.melin.beans.Emp;
import com.melin.dao.EmpDao;
import org.springframework.stereotype.Repository;

/**
 * @author melin
 * @since 2022/7/21
 */
@Repository
public class EmpDaoImpl implements EmpDao {
    public Emp getBean(){
        System.out.println("查詢 Emp DataBase ");
        Emp emp = new Emp();
        emp.setName("TEST");
        return emp;
    }

}
