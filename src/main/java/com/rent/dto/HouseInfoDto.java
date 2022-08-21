package com.rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 16:33
 **/
@Data
@AllArgsConstructor
public class HouseInfoDto implements Serializable {
    private static final long serialVersionUID = -3544299114181148978L;

    //房屋信息id
    private Integer fwid;
    //标题
    private String title;
    //月租金
    private String zj;
    //信息发布时间
    private String date;
}
