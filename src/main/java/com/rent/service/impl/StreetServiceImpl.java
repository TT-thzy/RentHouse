package com.rent.service.impl;

import com.rent.mapper.StreetMapper;
import com.rent.pojo.Street;
import com.rent.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:10
 **/
@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetMapper streetMapper;

    @Override
    public List<Street> queryStreetByQxid(Integer id) throws Exception {
        return streetMapper.queryStreetByQxid(id);
    }

    @Override
    public Street queryStreetById(Integer id) throws Exception {
        return streetMapper.queryStreetById(id);
    }
}
