package com.rent.mapper;

import com.rent.dto.HouseInfoQueryDto;
import com.rent.pojo.HouseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
@Repository
public interface HouseInfoMapper {

    public List<HouseInfo> queryHouseInfo() throws Exception;

    public HouseInfo getHouseDetail(Integer id) throws Exception;

    public int deleteHouseInfoById(Integer id) throws Exception;

    public int saveHouseInfo(HouseInfo houseInfo) throws Exception;

    int updateHouseInfo(HouseInfo info);

    List<HouseInfo> queryHouseInfoByMultiCondition(HouseInfoQueryDto queryDto);
}
