package com.rent.dto;

import lombok.Data;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 14:38
 **/
@Data
public class ResultDto {

    //操作是否成功
    private boolean isSuccess;

    //返回信息
    private String message;
}
