package com.rent.utils;

import com.rent.dto.HouseInfoDetailDto;
import com.rent.pojo.HouseInfo;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 21:11
 **/
public class HouseInfoToHouseInfoDetailDto {

    public static HouseInfoDetailDto toDto(HouseInfo houseInfo){
        if (houseInfo!=null){
            HouseInfoDetailDto dto = new HouseInfoDetailDto();
            dto.setTitle(houseInfo.getTitle());
            dto.setTelephone(houseInfo.getTelephone());
            dto.setLxr(houseInfo.getLxr());
            dto.setFwlx(houseInfo.getHouseType().getFwlx());
            String hx=houseInfo.getShi()+"室"+houseInfo.getTing()+"厅";
            dto.setHx(hx);
            dto.setZj(houseInfo.getZj());
            dto.setQx(houseInfo.getStreet().getDistricts().getQx());
            dto.setJd(houseInfo.getStreet().getJd());
            dto.setDate(DateUtil.dateToStringDetail(houseInfo.getDate()));
            dto.setFwxx(houseInfo.getFwxx());
            return dto;
        }
        return null;
    }
}
