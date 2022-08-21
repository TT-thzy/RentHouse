package com.rent.service;

import com.rent.pojo.Street;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
public interface StreetService {

    public List<Street> queryStreetByQxid(Integer id) throws Exception;

    public Street queryStreetById(Integer id) throws Exception;
}
