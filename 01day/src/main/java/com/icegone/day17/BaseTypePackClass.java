package com.icegone.day17;

import org.junit.Test;

/**
 * @program: architect
 * @description: 基本类型包装类
 * @author: bjchen
 * @create: 2020-09-04
 **/
public class BaseTypePackClass {

    @Test
    public void IntegerTest(){
        Integer integer =Integer.parseInt("-15");
        String string =Integer.toString(-15);

        System.out.println(integer);
    }

}
