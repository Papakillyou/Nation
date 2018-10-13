package com.muc.service;

import com.muc.pojo.UserInfo;

public interface UserService {
    //用户注册
    void regist(UserInfo user);

    //用户登录

    void login(String name, String password);
}
