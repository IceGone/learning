package com.icegone.day17;

import org.junit.Test;

import java.util.Random;

/**
 * @program: architect
 * @description: 系统工具类
 * @author: bjchen
 * @create: 2020-09-04
 **/
public class SystemUtil {

    /***
    * @Description: 循环生成100-999之间的的三位数并进行打印该数，当该数能被10整除时，结束运行的程序
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/4
    */
    @Test
    public void systemTest(){
        Random random = new Random();
        while(true){
            int number = random.nextInt(900)+100; //0-899 + 100
            if (number % 10 == 0) {
                System.exit(0);
            }
        }
    }

    /***
    * @Description: 程序所在系统，提供了对应的一些系统属性信息，和系统操作。
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/4
    */
    @Test
    public void systemProperties(){
        System.out.println("java.home:"+System.getProperty("java.home"));
        System.out.println("java.vm.name:"+System.getProperty("java.vm.name"));
        System.out.println("java.compiler:"+System.getProperty("java.compiler"));
        System.out.println("user.home:"+System.getProperty("user.home"));
        System.out.println("user.name:"+System.getProperty("user.name"));
        System.out.println("user.dir:"+System.getProperty("user.dir"));
    }
}
