package com.rent.mapper;

import com.rent.pojo.HouseInfo;
import com.rent.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @program: mybatisTest
 * @description:
 * @author: Mr.Wang
 * @create: 2021-03-27 17:26
 **/
@Repository
public interface UserMapper {

    public User queryByNameAndPassword(HashMap<String,String> map) throws Exception;

    public int saveUser(User user) throws Exception;

    public User queryUserByUsername(String username) throws Exception;

    public User queryHouseInfoByUid(String uid) throws Exception;

}
