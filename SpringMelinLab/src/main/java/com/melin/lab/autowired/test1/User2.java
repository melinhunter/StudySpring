package com.melin.lab.autowired.test1;

import org.springframework.stereotype.Service;

/**
 * @author melin
 * @since 2022/7/22
 */
@Service
public class User2 implements IUser{

    @Override
    public void say(){
        System.out.println("hihi , I'm user2");
    }
}
