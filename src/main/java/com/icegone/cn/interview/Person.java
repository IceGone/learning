package com.icegone.cn.interview;

import java.io.Serializable;

/**
 * @program: architect
 * @description: 人类
 * @author: bjchen
 * @create: 2020-07-26
 **/
public class Person implements Serializable {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
