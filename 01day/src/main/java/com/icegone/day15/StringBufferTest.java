package com.icegone.day15;

/**
 * @program: architect
 * @description: StringBuffer使用
 * @author: bjchen
 * @create: 2020-08-25
 **/
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        ////添加字符串:超过初始容量，查看添加方法
        sb.append("icegone i love you forever !");
        sb.insert(2, "it");//在指定位置插入
        sb.delete(1, 4);//删除
        sb.replace(1, 4, "cast");//替换指定范围内的内容
        System.out.println(sb.toString());
    }
}
