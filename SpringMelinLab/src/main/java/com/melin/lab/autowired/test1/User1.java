package com.melin.lab.autowired.test1;

import org.springframework.stereotype.Service;

/**
 * @author melin
 * @since 2022/7/22
 */
@Service("user")
public class User1 implements IUser{

    @Override
    public void say(){
        System.out.println("say from user1");
    }
}
