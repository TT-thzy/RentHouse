package com.rent.service;

import com.rent.pojo.HouseType;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
public interface HouseTypeService {

    public List<HouseType> findAll() throws Exception;

    public HouseType findOne(Integer id) throws Exception;
}
