package com.rent.test.User;

import com.rent.dto.HouseInfoDto;
import com.rent.mapper.UserMapper;
import com.rent.pojo.User;
import com.rent.service.UserService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:13
 **/
public class UserServiceTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        userService=context.getBean(UserService.class);
    }

    @Test
    public void testLogin() throws Exception{
        HashMap<String, String> map = new HashMap<>();
        map.put("uname","test");
        map.put("upass","test");
//        boolean login = userService.login(map);
//        TestCase.assertTrue(login);
        User login = userService.login(map);
        System.out.println(login);
    }

    @Test
    public void queryHouseInfoById() throws Exception{
        List<HouseInfoDto> houseInfoDto = userService.queryHouseInfoByUid("54");
        houseInfoDto.stream().forEach(s-> System.out.println(s));
    }

}
