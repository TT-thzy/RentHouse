package com.rent.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-10 09:51
 **/
@Data
public class HouseInfoQueryDto {

    //标题
    private String title;
    //区县
    private String qxid;
    //街道
    private String jdid;
    //租金范围
    private String zjBegin;
    private String zjEnd;
    //户型
    private String shi;
    private String ting;
    //房屋类型
    /*
    * 0 地下室
    * 1 平方
    * 2 普通住宅
    * 3 公寓
    * 4 别墅
    * */
    private String[] fwlx;
    //发布日期
    /*
    * 0 不限
    * 1 当天
    * 2 近两天
    * 3 近三天
    * 7 近一周
    * 14 近两周
    * 30 近一个月
    * */
    private int date;
}
