package com.rent.utils.assertNullFactory;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:42
 **/
public class AssertNullForStringFactory implements AssertNullFactory{
    @Override
    public AssertObject create() {
        return new AssertStringProduct();
    }
}
