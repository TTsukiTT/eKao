package com.just.ekao.sys.pos.service;

import com.just.ekao.sys.pos.pojo.TPosition;

import java.util.List;

public interface TPositionService {
    List<TPosition> findByDepId(String depId);
}
