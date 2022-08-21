package com.rent.dto;

import lombok.Data;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 18:43
 **/
@Data
public class HouseInfoPostDto {

    //标题
    private String title;
    //区县
    private String qxid;
    //区县
    private String qx;
    //街道
    private String jdid;
    //街道
    private String jd;
    //租金
    private String zj;
    //户型
    private String shi;
    private String ting;
    //房屋类型
    private String fwlx;
    //联系电话
    private String telephone;
    //联系人
    private String lxr;
    //房屋信息
    private String fwxx;
    //发布时间
    private String date;
    //房屋类型
    private String lxid;
}
