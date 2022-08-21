package com.rent.service.impl;

import com.rent.dto.HouseInfoDetailDto;
import com.rent.dto.HouseInfoDto;
import com.rent.dto.HouseInfoQueryDto;
import com.rent.enumerate.AssertNullType;
import com.rent.mapper.HouseInfoMapper;
import com.rent.mapper.UserMapper;
import com.rent.pojo.HouseInfo;
import com.rent.service.HouseInfoService;
import com.rent.utils.AssertNullOfTypeUtil;
import com.rent.utils.DateUtil;
import com.rent.utils.HouseInfoToHouseInfoDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:11
 **/
@Service
public class HouseInfoServiceImpl implements HouseInfoService {

    @Autowired
    private HouseInfoMapper houseInfoMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<HouseInfoDto> queryHouseInfo() throws Exception {
        List<HouseInfo> houseInfos = houseInfoMapper.queryHouseInfo();
        ArrayList<HouseInfoDto> houseInfoDto = new ArrayList<>();
        for (HouseInfo houseInfo : houseInfos) {
            HouseInfoDto infoDto = new HouseInfoDto(houseInfo.getFwid(), houseInfo.getTitle(), houseInfo.getZj(), DateUtil.dateToString(houseInfo.getDate()));
            houseInfoDto.add(infoDto);
        }
        return houseInfoDto;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public HouseInfoDetailDto queryHouseInfoDetail(Integer id) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, id) && id != -1) {
            HouseInfo houseDetail = houseInfoMapper.getHouseDetail(id);
            if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, houseDetail)) {
                HouseInfoDetailDto houseInfoDetailDto = HouseInfoToHouseInfoDetailDto.toDto(houseDetail);
                if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, houseInfoDetailDto)) {
                    return houseInfoDetailDto;
                }
            }
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteHouseInfoById(Integer id) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, id) && id != -1) {
            int i = houseInfoMapper.deleteHouseInfoById(id);
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveHouseInfo(HouseInfo houseInfo) throws Exception {
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, houseInfo)) {
            int i = houseInfoMapper.saveHouseInfo(houseInfo);
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public HouseInfo queryHouseInfoById(Integer id) throws Exception {
        return houseInfoMapper.getHouseDetail(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean updateHouseInfo(HouseInfo info) throws Exception{
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType, info)){
            int i = houseInfoMapper.updateHouseInfo(info);
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<HouseInfoDto> queryHouseInfoWithMultiCondition(HouseInfoQueryDto queryDto) throws Exception{
        if (AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType,queryDto)){
            List<HouseInfo> houseInfos= houseInfoMapper.queryHouseInfoByMultiCondition(queryDto);
            ArrayList<HouseInfoDto> houseInfoDto = new ArrayList<>();
            for (HouseInfo houseInfo : houseInfos) {
                HouseInfoDto infoDto = new HouseInfoDto(houseInfo.getFwid(), houseInfo.getTitle(), houseInfo.getZj(), DateUtil.dateToString(houseInfo.getDate()));
                houseInfoDto.add(infoDto);
            }
            return houseInfoDto;
        }
        return null;
    }
}
