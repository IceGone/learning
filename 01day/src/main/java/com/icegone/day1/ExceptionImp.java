package com.icegone.day1;

/**
 * @program: architect
 * @description: 自定义Thronable实现类
 * @author: bjchen
 * @create: 2020-08-09
 **/
public class ExceptionImp extends Throwable {
    public ExceptionImp(){
        super();
    }
    public ExceptionImp(String s) {
        super(s);
    }

    public static void main(String[] args) {
        ExceptionImp ei=new ExceptionImp("想哭");
        System.out.println(ei.getCause());
        System.out.println(ei.toString());
        System.out.println(ei.getStackTrace());
    }



}
