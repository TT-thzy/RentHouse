package com.rent.service;

import com.rent.dto.HouseInfoDto;
import com.rent.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
public interface UserService {

    public User login(HashMap<String,String> map) throws Exception;

    public boolean saveUser(User user) throws Exception;

    public boolean queryUserByUsername(String name) throws Exception;

    public List<HouseInfoDto> queryHouseInfoByUid(String uid) throws Exception;

}
