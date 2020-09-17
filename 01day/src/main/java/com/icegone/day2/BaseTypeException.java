package com.icegone.day2;

import org.junit.Test;

/**
 * @program: architect
 * @description: 基本数据类型相关
 * @author: bjchen
 * @create: 2020-08-09
 **/
public class BaseTypeException {
    @Test
    public void byteOverload(){
        System.out.println("未溢出 ((byte) (Math.pow(2,7)-3))"+((byte) (Math.pow(2,7)-3)));
        System.out.println("未溢出 ((byte) (Math.pow(2,7)-2))"+((byte) (Math.pow(2,7)-2)));
        System.out.println("未溢出 ((byte) (Math.pow(2,7)-1))"+((byte) (Math.pow(2,7)-1)));
        System.out.println("已溢出 (byte) Math.pow(2,7)"+(byte) Math.pow(2,7));
        System.out.println("未溢出 ((byte) (Math.pow(2,7)+1))"+((byte) (Math.pow(2,7)+1)));
        System.out.println("未溢出 ((byte) (Math.pow(2,7)+2))"+((byte) (Math.pow(2,7)+2)));
        System.out.println("未溢出 ((byte) (Math.pow(2,7)+3))"+((byte) (Math.pow(2,7)+3)));
    }

    @Test
    public void division(){
        int a=10;
        int b=20;
        float c=10.2F;
        float d=-20.2F;
        System.out.println(a+"%"+c +(a%c));
        System.out.println(a+"%"+d +(a%d));
    }
}
