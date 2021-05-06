package com.just.ekao.sys.login.service;

import com.just.ekao.sys.login.dao.TUserMapper;
import com.just.ekao.sys.login.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private TUserMapper dao;
    @Override
    public boolean isUser(String userName,String Pwd) {
        TUser user = dao.findByUserNameAndPwd(userName,Pwd);
        if(user!=null && user.getUserId()!=null) return true;
        else return false;

    }
}
