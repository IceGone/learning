package com.icegone.day16;

import org.junit.Test;

import java.util.Calendar;

/**
 * @program: architect
 * @description: 日期相关类练习
 * @author: bjchen
 * @create: 2020-09-04
 **/
public class CalendarTest {

    /***
    * @Description: 5.1求出自己已经出生多少天
     * 	思路：
     * 	    1.获取当前时间对应的天数
     * 		2.获取自己出生日期对应的天数
     * 		3.两个时间相减（当前时间天数 – 出生日期天数）
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/4
    */
    @Test
    public void test1(){
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置出生年月日 1995-05-10
        my.set(Calendar.YEAR, 1995);
        my.set(Calendar.MONTH, 4);
        my.set(Calendar.DAY_OF_MONTH, 10);
        //获取时间中的天数
        int day = c.get(Calendar.DATE);
        int myDay = my.get(Calendar.DATE);
        System.out.println(day - myDay);

    }
    
    /***
    * @Description: 5.2求出今天距离2020年1月1日还有多少天
     * 	思路：
     * 	    1.获取当前时间对应的天数
     * 		2.获取2020年1月1日对应的天数
     * 		3.两个时间相减（2020年1月1日的天数 –当前时间天数）
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/4
    */
    @Test
    public void test2(){
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置年月日 2020-01-01
        my.set(Calendar.YEAR, 2020);
        my.set(Calendar.MONTH, 0);
        my.set(Calendar.DAY_OF_MONTH, 1);
        //获取时间中的天数
        int day = c.get(Calendar.DATE);
        int myDay = my.get(Calendar.DATE);
        System.out.println(myDay - day);

    }
}
