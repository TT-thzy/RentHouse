package com.rent.utils.assertNullFactory;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:39
 **/
public class AssertObjectProduct implements AssertObject {
    @Override
    public <T> boolean doAssert(T t) {
        if (t == null) {
            return false;
        }
        return true;
    }
}
