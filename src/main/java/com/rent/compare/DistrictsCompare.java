package com.rent.compare;

import com.rent.pojo.Districts;

import java.util.Comparator;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 16:21
 **/
public class DistrictsCompare implements Comparator<Districts> {
    @Override
    public int compare(Districts o1, Districts o2) {
        return o1.getQxid()-o2.getQxid();
    }
}
