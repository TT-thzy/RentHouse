package com.rent.mapper;

import com.rent.pojo.HouseType;
import com.rent.pojo.Street;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
@Repository
public interface HouseTypeMapper {

    public HouseType queryHouseTypeById(Integer id) throws Exception;

    public List<HouseType> queryAllHouseType() throws Exception;
}
