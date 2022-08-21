package com.rent.test.User;

import com.rent.mapper.UserMapper;
import com.rent.pojo.HouseInfo;
import com.rent.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 10:49
 **/
public class UserMapperTest {

    private ApplicationContext context;
    private UserMapper userMapper;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        userMapper=context.getBean(UserMapper.class);
    }

    @Test
    public void queryPasswordAndName() throws Exception{
        HashMap<String, String> map = new HashMap<>();
        map.put("uname","test");
        map.put("upass","test");
        User user = userMapper.queryByNameAndPassword(map);
        System.out.println(user);
    }

    @Test
    public void saveUser() throws Exception{
        User user = new User();
        user.setUname("haha");
        user.setUpass("haha");
        int i = userMapper.saveUser(user);
        System.out.println(i);
    }

    @Test
    public void queryUsername() throws Exception{
        String s="haha";
        User user= userMapper.queryUserByUsername(s);
        System.out.println(user);
    }

    @Test
    public void queryHouseInfoByUid() throws Exception{
        String id="54";
        User houseInfos = userMapper.queryHouseInfoByUid(id);
        System.out.println(houseInfos);
    }
}
