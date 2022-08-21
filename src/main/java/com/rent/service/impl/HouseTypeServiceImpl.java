package com.rent.service.impl;

import com.rent.compare.HouseTypeCompare;
import com.rent.mapper.HouseTypeMapper;
import com.rent.pojo.HouseType;
import com.rent.service.HouseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @program: RentingHouse
 * @description: \
 * @author: Mr.Wang
 * @create: 2022-01-07 20:11
 **/
@Service
public class HouseTypeServiceImpl implements HouseTypeService {

    @Autowired
    private HouseTypeMapper houseTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<HouseType> findAll() throws Exception {
        List<HouseType> houseTypes = houseTypeMapper.queryAllHouseType();
        HouseTypeCompare houseTypeCompare = new HouseTypeCompare();
        Collections.sort(houseTypes,houseTypeCompare);
        return houseTypes;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public HouseType findOne(Integer id) throws Exception {
        HouseType houseType = houseTypeMapper.queryHouseTypeById(id);
        return houseType;
    }
}
