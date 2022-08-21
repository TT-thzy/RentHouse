package com.rent.controller;

import com.rent.container.ApplicationContainer;
import com.rent.service.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:21
 **/
public class DistrictsServlet extends BaseServlet{

//    @Autowired
//    private DistrictsService districtsServiceAnnotation; //null (因为在监听器中)
    private DistrictsService districtsService;      //真实对象

    {
        districtsService= ApplicationContainer.getApplicationContext(ApplicationContainer.key).getBean(DistrictsService.class);

    }

    protected void test(HttpServletRequest req, HttpServletResponse resp) throws Exception{
//        System.out.println(districtsServiceAnnotation);
        System.out.println(districtsService);
    }
}
