package com.rent.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: RentingHouse
 * @description: 房屋类型
 * @author: Mr.Wang
 * @create: 2022-01-07 19:36
 **/
@Data
public class HouseType implements Serializable {

    private static final long serialVersionUID = -3482880533350276259L;

    //类型id
    private int lxid;
    //房屋类型
    private String fwlx;
    //房屋信息
    private List<HouseInfo> houseInfos;
}
