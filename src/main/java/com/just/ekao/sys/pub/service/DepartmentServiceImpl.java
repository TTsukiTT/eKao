package com.just.ekao.sys.pub.service;

import com.just.ekao.sys.pub.dao.TDepartmentMapper;
import com.just.ekao.sys.pub.pojo.TDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepartmentServiceImpl implements TDepartmentService{
    @Resource
    private TDepartmentMapper dao;
    @Override
    public List<TDepartment> findAll() {
        System.out.println(dao.findAll());
        return dao.findAll();
    }
}
