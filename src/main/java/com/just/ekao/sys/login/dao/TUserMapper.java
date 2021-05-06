package com.just.ekao.sys.login.dao;

import com.just.ekao.sys.login.pojo.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TUserMapper {
    TUser findByUserNameAndPwd(@Param("userName")String userName,@Param("userPwd") String userPwd);

}

