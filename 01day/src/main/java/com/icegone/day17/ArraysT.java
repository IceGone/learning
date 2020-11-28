package com.icegone.day17;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: architect
 * @description: 包含用来操作数组（比如排序和搜索）的各种方法
 * @author: bjchen
 * @create: 2020-09-05
 **/
public class ArraysT {

    @Test
    public void test1(){
        //源arr数组元素{1,5,9,3,7}, 进行排序后arr数组元素为{1,3,5,7,9}
        int[] arr = {1,5,9,3,7};
        Arrays.sort( arr );
        //toString方法，用来返回指定数组元素内容的字符串形式
        String str = Arrays.toString(arr); // str的值为[1, 3, 5, 7, 9]
        System.out.println(str);
        //binarySearch方法，在指定数组中，查找给定元素值出现的位置。若没有查询到，返回位置为-1。要求该数组必须是个有序的数组。
        int[] arr2 = {1,3,4,5,6};
        int index = Arrays.binarySearch(arr2, 4); //index的值为2
        int index2= Arrays.binarySearch(arr2, 2); //index2的值为-1
        //将数组arr的部分元素复制到arr2，替换掉arr2
        System.arraycopy(arr,1,arr2,2,3);
        System.out.println();


    }
}
