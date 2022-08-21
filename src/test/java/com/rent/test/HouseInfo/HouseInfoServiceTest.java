package com.rent.test.HouseInfo;

import com.rent.dto.HouseInfoDto;
import com.rent.service.HouseInfoService;
import com.rent.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 16:41
 **/
public class HouseInfoServiceTest {

    private ApplicationContext context;
    private HouseInfoService houseInfoService;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        houseInfoService = context.getBean(HouseInfoService.class);
    }

    @Test
    public void testQueryHouseInfo() throws Exception {
        List<HouseInfoDto> houseInfoDto = houseInfoService.queryHouseInfo();
        houseInfoDto.stream().forEach(s-> System.out.println(s));
    }
}
