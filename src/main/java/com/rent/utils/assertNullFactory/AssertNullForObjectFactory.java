package com.rent.utils.assertNullFactory;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-08 11:44
 **/
public class AssertNullForObjectFactory implements AssertNullFactory{
    @Override
    public AssertObject create() {
        return new AssertObjectProduct();
    }
}
