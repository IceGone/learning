package com.icegone.day15;

/**
 * @program: architect
 * @description: String类
 * @author: bjchen
 * @create: 2020-08-11
 **/
public class StringTest {
    public static void main(String[] args) {
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true,
        //因为String重写了equals方法，建立了字符串自己的判断相同的依据（通过字符串对象中的字符来判断）
    }
}
