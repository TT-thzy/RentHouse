package com.rent.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 20:54
 **/
@Data
public class HouseInfoDetailDto implements Serializable {
    private static final long serialVersionUID = 4855397725391547513L;

    //标题
    private String title;
    //联系电话
    private String telephone;
    //联系人
    private String lxr;
    //房屋类型
    private String fwlx;
    //户型
    private String hx;
    //租金
    private String zj;
    //区县
    private String qx;
    //街道
    private String jd;
    //发布时间
    private String date;
    //房屋信息
    private String fwxx;
}
