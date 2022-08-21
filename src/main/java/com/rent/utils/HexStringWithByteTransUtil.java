package com.rent.utils;

import java.util.Arrays;

/**
 * @program: HomeWork
 * @description:
 * @author: Mr.Wang
 * @create: 2021-07-12 20:08
 **/
public class HexStringWithByteTransUtil {

    private static final char[] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final String HEXSTR = "0123456789abcdef";

    //字节数组转字符串
    public static String byteToHexString(byte[] arr) {
        char[] ch = new char[arr.length * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int lowNum = arr[i] & 0xf;
            int highNum = arr[i] >>> 4 & 0xf;
            ch[j++] = CHARS[highNum];
            ch[j++] = CHARS[lowNum];
        }
        return new String(ch);
    }

    //字符串转字节数组
    public static byte[] HexStringToByte(String str){
        char[] cc = str.toCharArray();
        byte[] brr = new byte[cc.length / 2];
        int index = 0;
        for (int i = 0; i < cc.length; i++) {
            int highBit = HEXSTR.indexOf(cc[i]);
            int lowBit = HEXSTR.indexOf(cc[++i]);
            brr[index] = (byte) (highBit << 4 | lowBit);
            index++;
        }
        return brr;
    }
    public static void main(String[] args) throws Exception {
        byte[] arr = {-128, -6, 11, 124, 67, 122, 34};
        String s = byteToHexString(arr);
        System.out.println(s);
        byte[] bytes = HexStringToByte(s);
        System.out.println(Arrays.toString(bytes));
    }
}
