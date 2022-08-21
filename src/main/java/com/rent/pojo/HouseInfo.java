package com.rent.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: RentingHouse
 * @description: 房屋信息
 * @author: Mr.Wang
 * @create: 2022-01-07 19:32
 **/
@Data
public class HouseInfo implements Serializable {
    private static final long serialVersionUID = 1256707125341346461L;

    //房屋信息id
    private Integer fwid;
    //用户id
    private Integer uid;
    //街道id
    private Integer jdid;
    //类型id
    private Integer lxid;
    //几室
    private Integer shi;
    //几厅
    private Integer ting;
    //房屋信息
    private String fwxx;
    //月租金
    private String zj;
    //标题
    private String title;
    //信息发布时间
    private Date date;
    //联系电话
    private String telephone;
    //联系人
    private String lxr;
    //用户
    private User user;
    //街道
    private Street street;
    //房屋类型
    private HouseType houseType;
}
