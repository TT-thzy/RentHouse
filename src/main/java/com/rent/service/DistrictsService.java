package com.rent.service;

import com.rent.pojo.Districts;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
public interface DistrictsService {

    public List<Districts> findAll() throws Exception;

    public Districts findOne(Integer id) throws Exception;

}
