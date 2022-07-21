package com.melin.controller;

import com.melin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author Melin Chao
 * @Since 2022/7/21
 */
@Controller
public class UserController {

    /**
     * 使用@Autowired 作自動注入
     * bytype, byname
     * 如果有二個type 則才 byname 匹配
     * 若也找不到名字就會報錯
     *    解決方法 1.修改Bean 的名字
     *            2. o修改Bean 名字@XXX(value="XXX") value 可省略, 變成 @XXX("XXX");
     *            3. Bean 用註解@Qualifier
     */
    @Autowired
    @Qualifier("simpleUserServiceImpl")
    UserService userServiceImpl;

    public void getUser(){
        userServiceImpl.getUser();
    }
}
