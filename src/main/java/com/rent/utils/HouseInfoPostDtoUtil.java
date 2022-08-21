package com.rent.utils;

import com.rent.dto.HouseInfoPostDto;
import com.rent.pojo.Districts;
import com.rent.pojo.HouseType;
import com.rent.pojo.Street;
import com.rent.service.DistrictsService;
import com.rent.service.HouseTypeService;
import com.rent.service.StreetService;

import java.util.Date;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 19:53
 **/
public class HouseInfoPostDtoUtil {

    public static HouseInfoPostDto power(HouseInfoPostDto houseInfoPostDto, StreetService streetService, HouseTypeService houseTypeService) throws Exception {
        int one = ChangeType.parseInt(houseInfoPostDto.getLxid(), -1);
        if (one != -1) {
            HouseType houseType = houseTypeService.findOne(one);
            houseInfoPostDto.setFwlx(houseType.getFwlx());
        }
        int two = ChangeType.parseInt(houseInfoPostDto.getJdid(), -1);
        if (two != -1) {
            Street street = streetService.queryStreetById(two);
            houseInfoPostDto.setJd(street.getJd());
            houseInfoPostDto.setQx(street.getDistricts().getQx());
        }
        houseInfoPostDto.setDate(DateUtil.dateToStringDetail(new Date()));
        return houseInfoPostDto;
    }
}
