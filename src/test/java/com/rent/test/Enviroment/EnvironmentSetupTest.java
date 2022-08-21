package com.rent.test.Enviroment;

import com.rent.mapper.TestMapper;
import com.rent.service.UserService;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 19:07
 **/
public class EnvironmentSetupTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testDataSource(){
        DataSource dataSource = (DataSource)context.getBean("dataSource");
//        System.out.println(dataSource);
        TestCase.assertNotNull(dataSource);
    }

    @Test
    public void testSqlSessionFactoryBean(){
        SqlSessionFactory sqlSessionFactory=(SqlSessionFactory)context.getBean("sqlSessionFactory");
//        System.out.println(sqlSessionFactory);
        TestCase.assertNotNull(sqlSessionFactory);
    }

    @Test
    public void testMapperScannerConfigurer(){
        TestMapper mapper = context.getBean(TestMapper.class);
//        System.out.println(mapper);
        TestCase.assertNotNull(mapper);
    }
    @Test
    public void testGetService(){
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
        TestCase.assertNotNull(userService);
    }


}
