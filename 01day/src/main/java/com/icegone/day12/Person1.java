package com.icegone.day12;

/**
 * @program: architect
 * @description: 构造方法
 * @author: bjchen
 * @create: 2020-08-20
 **/
public class Person1 {
    private int age;
    private String name;

    // 给姓名和年龄初始化的构造方法
    Person1(String name, int age) {
        // 当需要访问成员变量是，只需要在成员变量前面加上this.即可
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("name=" + this.name + ",age=" + this.age);
    }
}
class PersonDemo1 {
    public static void main(String[] args) {
        Person1 p = new Person1("张三", 23);
        p.speak();
    }
}

