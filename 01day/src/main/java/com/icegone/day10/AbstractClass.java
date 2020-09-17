package com.icegone.day10;

/**
 * @program: architect
 * @description: 抽象类相关
 * @author: bjchen
 * @create: 2020-08-19
 **/
abstract class AbstractClass {

    //可以使用变量
    protected Integer integer;

    protected abstract Integer getInteger();

}

/**第一个实现类*/
class AbstractClassExtens extends AbstractClass{

    public Integer getInteger(){
        return 1;
    }

    public String getString(){
        return "Str1";
    }

}

/***
* @Description: 第二个实现类
* @Param:
* @return:
* @Author: bjchen
* @Date: 2020/8/20
*/
class AbstractClassExtenss extends AbstractClassExtens{
    public Integer getInteger(){
        return 2;
    }

    public String getString(){
        return "Str2";
    }
}

class AbstractClassExtensss extends AbstractClassExtenss{
    public static void main(String[] args) {
        //父左子右
        AbstractClassExtens abstractClassExtenss =new AbstractClassExtensss();
        System.out.println("AbstractClassExtens abstractClassExtenss =new AbstractClassExtensss() "+ abstractClassExtenss.getInteger());
        System.out.println("AbstractClassExtens abstractClassExtenss =new AbstractClassExtensss() "+ abstractClassExtenss.getString());

        //父左子右
        AbstractClassExtenss abstractClassExtensss =new AbstractClassExtensss();
        System.out.println("AbstractClassExtenss abstractClassExtensss =new AbstractClassExtensss() "+ abstractClassExtensss.getInteger());
        System.out.println("AbstractClassExtenss abstractClassExtensss =new AbstractClassExtensss() "+ abstractClassExtensss.getString());


    }

    public Integer getInteger(){
        return super.getInteger();
    }

    public String getString(){
        return "Str3";
    }
}
