package com.rent.compare;

import com.rent.pojo.HouseType;

import java.util.Comparator;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 16:27
 **/
public class HouseTypeCompare implements Comparator<HouseType> {
    @Override
    public int compare(HouseType o1, HouseType o2) {
        return o1.getLxid()-o2.getLxid();
    }
}
