package com.just.ekao.sys.pos.service;

import com.just.ekao.sys.pos.dao.TPositionMapper;
import com.just.ekao.sys.pos.pojo.TPosition;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TPositionServiceImpl implements TPositionService{
    @Resource
    private TPositionMapper dao;
    @Override
    public List<TPosition> findByDepId(String depId) {
        return dao.findBYDepId(depId);
    }
}
