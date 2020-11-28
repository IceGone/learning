package com.icegone.day9;

/**
 * @program: learning
 * @description: 类加载过程及其顺序
 * @author: bjchen
 * @create: 2020-10-21
 **/
public class ClassLoadSequence {
    public static void main(String[] args) {
        Son son =null;
        for (int i=0;i<10;++i){
            son=new Son();
            System.out.println("-------------------------------------------");
        }

    }

}

class Son extends Father{
    private int i;
    private long ssj=2L;
    static int sj=3;

    {
        System.out.println("1son codeBlock ！");
    }

    static {
        System.out.println("2son staticCodeBlock！");
    }

    Son(){
        ii=1;
        System.out.println("3son constructor！");
    }




}

class Father{
    static int ii;
    static int fsj =4;
    //有大文章
    static Son son =new Son();

    {
        System.out.println("4father codeBlock ！");
    }

    static {
        System.out.println("5father staticCodeBlock！");
    }


    Father(){
        ii=1;
        System.out.println("6father constructor！");
    }


}


