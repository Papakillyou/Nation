package com.muc.dao;

import com.muc.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper {
    public void adduser(UserInfo user);//添加用户

    //根据用户名和密码查询用户

    //注解的两个参数会自动封装成map集合，括号内即为键
    public  void findUserByNameAndPwd(@Param("username")String name, @Param("password")String password);
}
