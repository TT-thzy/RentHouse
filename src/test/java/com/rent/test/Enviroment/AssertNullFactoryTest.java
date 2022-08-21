package com.rent.test.Enviroment;

import com.rent.enumerate.AssertNullType;
import com.rent.pojo.User;
import com.rent.utils.AssertNullOfTypeUtil;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:52
 **/
public class AssertNullFactoryTest {

    @Test
    public void test() throws Exception{
//        Integer i=0;
//        System.out.println(i.getClass()==Integer.class);
        String s="";
        System.out.println(s.trim().length());
        boolean b = AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, s);
//        TestCase.assertTrue(b);
        System.out.println(b);
    }

    @Test
    public void test2(){
        String username="uname";
        String password="upass";
        boolean b = AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, username) && AssertNullOfTypeUtil.doAssertNull(AssertNullType.StringType, password);
        System.out.println(b);

        User user =null;
        System.out.println(AssertNullOfTypeUtil.doAssertNull(AssertNullType.ObjectType,user));
    }
}
