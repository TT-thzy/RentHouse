package com.rent.utils.assertNullFactory;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:31
 **/
public class AssertStringProduct implements AssertObject {
    @Override
    public <T> boolean doAssert(T t) {
        String s = String.valueOf(t);
        if (s == null || s.trim().length() == 0) {
            return false;
        }
        return true;
    }
}
