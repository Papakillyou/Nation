package com.muc.service;

import com.muc.dao.UserMapper;
import com.muc.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper usermapper;

    @Override
    public void regist(UserInfo user) {
        usermapper.addUser(user);
    }

    @Override
    public void login(String name, String password) {
        usermapper.findUserByNameAndPwd(name,password);
    }
}
