package com.rent.test.Enviroment;

import com.rent.pojo.User;
import org.junit.Test;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 19:22
 **/
public class LombockTest {

    @Test
    public void test(){
        User user = new User();
        user.setUid(1);
        user.setUname("nihao");
        System.out.println(user.getUid());
        System.out.println(user.toString());
    }
}
