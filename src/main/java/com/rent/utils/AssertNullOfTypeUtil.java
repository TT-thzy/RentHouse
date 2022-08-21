package com.rent.utils;

import com.rent.enumerate.AssertNullType;
import com.rent.utils.assertNullFactory.AssertNullFactory;
import com.rent.utils.assertNullFactory.AssertNullForObjectFactory;
import com.rent.utils.assertNullFactory.AssertNullForStringFactory;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 12:07
 **/
public class AssertNullOfTypeUtil {

     private static AssertNullFactory factory=null;

    protected static void getAssertNullFactory(AssertNullType assertNullType){
        switch (assertNullType){
            case ObjectType:
                factory=new AssertNullForObjectFactory();
                break;
            case StringType:
                factory=new AssertNullForStringFactory();
                break;
        }
    }

    public static <T> boolean doAssertNull(AssertNullType assertNullType,T t){
         getAssertNullFactory(assertNullType);
        boolean b = factory.create().doAssert(t);
        return b;
    }
}
