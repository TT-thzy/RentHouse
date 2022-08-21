package com.rent.test.DistricsMapper;

import com.rent.service.DistrictsService;
import com.rent.service.HouseInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 16:24
 **/
public class DistrictsServiceTest {

    private ApplicationContext context;
    private DistrictsService districtsService;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        districtsService = context.getBean(DistrictsService.class);
    }

    @Test
    public void queryAll() throws Exception{
        districtsService.findAll().stream().forEach(s-> System.out.println(s));
    }
}
