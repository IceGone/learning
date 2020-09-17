package com.icegone.day17;

import org.junit.Test;

import java.math.BigInteger;

/**
 * @program: architect
 * @description: 大数据运算
 * @author: bjchen
 * @create: 2020-09-05
 **/
public class BigIntegerT {

    @Test
    public void test1(){
        //大数据封装为BigInteger对象
        BigInteger big1 = new BigInteger("12345678909876543210");
        BigInteger big2 = new BigInteger("98765432101234567890");
        //add实现加法运算
        BigInteger bigAdd = big1.add(big2);
        //subtract实现减法运算
        BigInteger bigSub = big1.subtract(big2);
        //multiply实现乘法运算
        BigInteger bigMul = big1.multiply(big2);
        //divide实现除法运算
        BigInteger bigDiv = big2.divide(big1);

    }
}
