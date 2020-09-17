package com.icegone.day13;

/**
 * @program: architect
 * @description: 匿名内部类
 * @author: bjchen
 * @create: 2020-08-11
 **/
public class Person {
    public static void main(String[] args) {
        new Person(){
            public void eat() {
                System.out.println("我是匿名人");
            }
        }.eat();

    }
}
