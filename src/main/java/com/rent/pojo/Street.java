package com.rent.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: RentingHouse
 * @description: 街道
 * @author: Mr.Wang
 * @create: 2022-01-07 19:30
 **/
@Data
public class Street implements Serializable {
    private static final long serialVersionUID = 1979886390213974417L;

    //街道id
    private Integer jdid;
    //街道
    private String jd;
    //区县id
    private Integer qxid;
    //区县
    private Districts districts;
    //房屋信息
    private List<HouseInfo> houseInfos;
}
