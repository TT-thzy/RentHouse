package com.rent.test.DistricsMapper;

import com.rent.mapper.DistrictsMapper;
import com.rent.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 17:22
 **/
public class DistricsMapperTest {

    private ApplicationContext context;
    private DistrictsMapper districtsMapper;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        districtsMapper=context.getBean(DistrictsMapper.class);
    }

    @Test
    public void testQueryById() throws Exception{
        System.out.println(districtsMapper.queryDistrictsById(1));
    }

    @Test
    public void queryAll() throws Exception{
        districtsMapper.queryAllDistricts().stream().forEach(s-> System.out.println(s));
    }
}
