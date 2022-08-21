package com.rent.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @program: qq_client
 * @description:
 * @author: Mr.Wang
 * @create: 2021-09-10 09:40
 **/
public class MD5Util {

    private static MessageDigest md5 = null;

//    普通加密
    public static String encode(String password) {
        String str = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            byte[] bytes = md5.digest();
            str = HexStringWithByteTransUtil.byteToHexString(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return str;
    }
}
