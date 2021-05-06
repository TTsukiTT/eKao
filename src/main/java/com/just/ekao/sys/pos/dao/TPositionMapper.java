package com.just.ekao.sys.pos.dao;

import com.just.ekao.sys.pos.pojo.TPosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TPositionMapper {
    List<TPosition> findBYDepId(@Param("depId") String depId);
}
