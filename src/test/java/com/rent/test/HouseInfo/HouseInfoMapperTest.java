package com.rent.test.HouseInfo;

import com.rent.dto.HouseInfoDto;
import com.rent.dto.HouseInfoQueryDto;
import com.rent.mapper.HouseInfoMapper;
import com.rent.mapper.UserMapper;
import com.rent.pojo.HouseInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 16:29
 **/
public class HouseInfoMapperTest {

    private ApplicationContext context;
    private HouseInfoMapper houseInfoMapper;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        houseInfoMapper=context.getBean(HouseInfoMapper.class);
    }

    @Test
    public void testQueryHouseInfo() throws Exception{
        List<HouseInfo> houseInfos = houseInfoMapper.queryHouseInfo();
        houseInfos.stream().forEach(s-> System.out.println(s));
    }

    @Test
    public void testQueryDetail() throws Exception{
        HouseInfo houseDetail = houseInfoMapper.getHouseDetail(102);
        System.out.println(houseDetail);
    }

    @Test
    public void deleteHouseInfo() throws Exception{
        int i = houseInfoMapper.deleteHouseInfoById(103);
        System.out.println(i);
    }

    @Test
    public void save() throws Exception{
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setUid(45);
        houseInfo.setJdid(2);
        houseInfo.setLxid(3);
        houseInfo.setShi(1);
        houseInfo.setTing(2);
        houseInfo.setFwxx("sssssssss");
        houseInfo.setZj("1000");
        houseInfo.setTitle("sdsadsadsadsa");
        houseInfo.setDate(new Date());
        houseInfo.setTelephone("12321321321");
        houseInfo.setLxr("牛市");
        int i = houseInfoMapper.saveHouseInfo(houseInfo);
        System.out.println(i);
    }

    @Test
    public void testQueryHouseInfoByMultiCondition(){
        HouseInfoQueryDto dto = new HouseInfoQueryDto();
        dto.setTitle("");
        dto.setQxid("0");
        dto.setJdid("0");
        dto.setZjBegin("1000");
        dto.setZjEnd("20000");
        dto.setShi("");
        dto.setTing("0");
        String[] ls={"1","2"};
        dto.setFwlx(null);
        dto.setDate(0);
        List<HouseInfo> houseInfos = houseInfoMapper.queryHouseInfoByMultiCondition(dto);
        houseInfos.stream().forEach(s-> System.out.println(s));
    }
}
