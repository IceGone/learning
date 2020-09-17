package com.icegone.day4;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: architect
 * @description: 数组复制
 * @author: bjchen
 * @create: 2020-08-17
 **/
public class ArrayTest {
    /***
    * @Description: 一维数组赋值
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/8/17
    */
    @Test
    public void testArrCopy1(){
        int[] a = new int[]{1,2};
        int[] b = a;
        b [1] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    /***
    * @Description: 数组b引用a，改变b的同时会改变a
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/8/17
    */
    @Test
    public void testArrCopy2(){
        int[][] a = new int[2][];
        a[0]=new int[]{1,2};
        a[1]=new int[]{3,4,5};
        int[][] b = a;
        b[0][1] = 6;
        //查看toString实现：方法内对数组1.判null；2.判空；3.遍历和组装
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(a[0])+" "+Arrays.toString(a[1]));
        System.out.println(Arrays.toString(b)+" "+Arrays.toString(b[0])+" "+Arrays.toString(b[1]));
    }


}
