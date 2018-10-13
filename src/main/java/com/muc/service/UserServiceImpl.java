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
        // TODO Auto-generated method stub

        usermapper.adduser(user);
    }

    @Override
    public void login(String name, String password) {
// TODO Auto-generated method stub

        usermapper.findUserByNameAndPwd(name,password);
    }
}
