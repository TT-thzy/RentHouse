package com.rent.test.Street;

import com.rent.mapper.StreetMapper;
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
public class StreetMapperTest {

    private ApplicationContext context;
    private StreetMapper streetMapper;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        streetMapper=context.getBean(StreetMapper.class);
    }

    @Test
    public void testQueryById() throws Exception{
        System.out.println(streetMapper.queryStreetById(1));
    }

    @Test
    public void testQueryByQxId() throws Exception{
        System.out.println(streetMapper.queryStreetByQxid(1));
    }
}
