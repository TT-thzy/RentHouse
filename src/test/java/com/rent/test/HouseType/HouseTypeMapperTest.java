package com.rent.test.HouseType;

import com.rent.mapper.HouseInfoMapper;
import com.rent.mapper.HouseTypeMapper;
import com.rent.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 17:20
 **/
public class HouseTypeMapperTest {

    private ApplicationContext context;
    private HouseTypeMapper houseTypeMapper;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        houseTypeMapper=context.getBean(HouseTypeMapper.class);
    }

    @Test
    public void testQueryById() throws Exception{
        System.out.println(houseTypeMapper.queryHouseTypeById(1));
    }
}
