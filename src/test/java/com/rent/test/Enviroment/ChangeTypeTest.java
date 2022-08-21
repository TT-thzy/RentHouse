package com.rent.test.Enviroment;

import com.rent.pojo.Districts;
import com.rent.utils.ChangeType;
import org.junit.Test;

import java.util.HashMap;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-09 14:18
 **/
public class ChangeTypeTest {

    @Test
    public void test(){
        HashMap<String, String> map = new HashMap<>();
        map.put("qxid","11");
        map.put("qx","安徽");
        Districts districts = ChangeType.copyParamToBean(map, new Districts());
        System.out.println(districts);
    }

    @Test
    public void test2(){
        System.out.println(ChangeType.parseInt("null",-1));
    }

}
