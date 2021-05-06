package com.just.ekao.sys.pub.dao;

import com.just.ekao.sys.pub.pojo.TDepartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TDepartmentMapper {
    List<TDepartment> findAll();
}
