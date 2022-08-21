package com.rent.container;

import org.springframework.context.ApplicationContext;

import java.util.HashMap;

/**
 * @program: RentingHouse
 * @description: ApplicationContext容器
 * @author: Mr.Wang
 * @create: 2022-01-08 10:28
 **/
public class ApplicationContainer {

    private static HashMap<String, ApplicationContext> map = new HashMap();
    public static final String key="context";

    public static ApplicationContext getApplicationContext(String key) {
        if (key == null && key.trim().length() == 0) {
            return null;
        }
        return map.get(key);
    }

    public static void setApplicationContext(String key, ApplicationContext context) {
        if (key == null && key.trim().length() == 0) {
            return;
        }
        if (context == null) {
            return;
        }
        map.put(key, context);
    }
}
