package com.rent.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @program: RentingHouse
 * @description:
 * @author: Mr.Wang
 * @create: 2022-01-07 20:06
 **/
public class ChangeType {

    /**
     * 将字符串转换成为int类型的数据
     * @param strInt
     * @param defaultValue
     * @return
     */
    public static int parseInt(String strInt,int defaultValue) {
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    /**
     * 把Map中的值注入到对应的JavaBean属性中。
     * @param value
     * @param bean
     */
    public static <T> T copyParamToBean(Map value , T bean ){
        try {
//            System.out.println("注入之前：" + bean);
            /**
             * 把所有请求的参数都注入到pojo中 前提参数名字和pojo中的属性一致
             */
            BeanUtils.populate(bean, value);
//            System.out.println("注入之后：" + bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }


}
