package com.rent.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: RentingHouse
 * @description: 区县
 * @author: Mr.Wang
 * @create: 2022-01-07 19:24
 **/
@Data
public class Districts implements Serializable {
    private static final long serialVersionUID = -5295900512711018142L;

    //区县id
    private Integer qxid;
    //区县
    private String qx;
}
