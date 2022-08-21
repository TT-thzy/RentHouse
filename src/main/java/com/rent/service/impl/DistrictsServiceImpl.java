package com.rent.service.impl;

import com.rent.compare.DistrictsCompare;
import com.rent.mapper.DistrictsMapper;
import com.rent.pojo.Districts;
import com.rent.service.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:12
 **/
@Service
public class DistrictsServiceImpl implements DistrictsService {

    @Autowired
    private DistrictsMapper districtsMapper;


    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Districts> findAll() throws Exception {
        List<Districts> districts = districtsMapper.queryAllDistricts();
        DistrictsCompare districtsCompare = new DistrictsCompare();
        Collections.sort(districts,districtsCompare);
        return districts;
    }

    @Override
    public Districts findOne(Integer id) throws Exception {
        return districtsMapper.queryDistrictsById(id);
    }
}
