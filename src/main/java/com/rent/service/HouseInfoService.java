package com.rent.service;

import com.rent.dto.HouseInfoDetailDto;
import com.rent.dto.HouseInfoDto;
import com.rent.dto.HouseInfoQueryDto;
import com.rent.pojo.HouseInfo;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
public interface HouseInfoService {

    public List<HouseInfoDto> queryHouseInfo() throws Exception;

    public HouseInfoDetailDto queryHouseInfoDetail(Integer id) throws Exception;

    public boolean deleteHouseInfoById(Integer id) throws Exception;

    public boolean saveHouseInfo(HouseInfo houseInfo) throws Exception;

    HouseInfo queryHouseInfoById(Integer id) throws Exception;

    boolean updateHouseInfo(HouseInfo info) throws Exception;

    List<HouseInfoDto> queryHouseInfoWithMultiCondition(HouseInfoQueryDto queryDto) throws Exception;
}
