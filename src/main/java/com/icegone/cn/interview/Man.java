package com.icegone.cn.interview;

/**
 * @program: architect
 * @description: 男人
 * @author: bjchen
 * @create: 2020-07-26
 **/
public class Man extends Person {
    private transient String sex = "男";

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Man{" +
                "sex='" + sex + '\'' +
                "super.getAge()='" + super.getAge() + '\'' +
                "super.getName()='" + super.getName()+ '\'' +
                '}';
    }
}
