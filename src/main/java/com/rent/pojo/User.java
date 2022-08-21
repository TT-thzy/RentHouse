package com.rent.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @program: RentingHouse
 * @description: 用户类(房东)
 * @author: Mr.Wang
 * @create: 2022-01-07 19:15
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -4788503753006066580L;

    //用户id
    Integer uid;
    //账号
    String uname;
    //密码
    String upass;

    //房屋信息
    private List<HouseInfo> houseInfos;
}
