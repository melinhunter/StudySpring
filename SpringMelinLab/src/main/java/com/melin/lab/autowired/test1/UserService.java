package com.melin.lab.autowired.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author melin
 * @since 2022/7/22
 */

@Service
public class UserService {
    //Iuser 有二個Implement Bean User1, User2
    //bytype 找到二個再ByName 時, 找不到, 會報錯.
    //可以把user 改為user1 or user2 或是將其中一個命名為user --> @Service("user")
    //或是在Autowired 時指定名稱 或是 在@Server 再設定@Primary
    @Autowired
    private IUser user;


    @Autowired
    public void test(IUser user2){
        System.out.println("TEST METHOD AUTOWARIED");
    }

    @Autowired
    public void test1(IUser user2){
        System.out.println("TEST2 METHOD AUTOWARIED");
        user2.say();
    }

    @Autowired
    public void test3(IUser user){
        // 因為user1 己被命名為user 所以沒有user1
        System.out.println("TEST3 METHOD AUTOWARIED");
        user.say();
    }

    @Autowired
    private Map<String, IUser> userMap;


    public void draw() {
        System.out.println(userMap);
    }
}
