package com.icegone.day15;

import java.util.Arrays;

/**
 * @program: architect
 * @description: 写String的equals方法
 * @author: bjchen
 * @create: 2020-08-11
 **/
public class StringEquals extends Object {
    private final char[] value;

    StringEquals(String s){
       this.value=s.toCharArray();
    }


    public boolean startsWith(StringEquals prefix){
        return startsWith(prefix,0);
    }

    /***
    * @Description: 前缀，偏移量 是否以指定前缀开始
    * @Param: [prefix, tooffset]
    * @return: boolean
    * @Author: bjchen
    * @Date: 2020/8/12
    */
    public boolean startsWith(StringEquals prefix, int tooffset) {
        char[]thisStr =this.value;
        char[]otherStr =prefix.value;
        //本字符串长度
        int lenthis =thisStr.length;
        //其他字符串长度
        int lenother =otherStr.length;
        //本字符串后半段长度
        int lenthisback =lenthis -tooffset;
        //其他字符串下标每次从0开始
        int idxother =0;
        //判断是否越界:索引大于0||子串比other串长
        if(tooffset<0||lenthisback<lenother){
            throw new IndexOutOfBoundsException("越界异常");
        }
        //开始判断
        while(idxother<lenother){
            if(thisStr[tooffset++]!=otherStr[idxother++]){
                return false;
            }
        }
        return true;
    }


    public boolean equals(Object obj){
        //1.比较哈希吗的16进制值
        if(this == obj){
            return true;
        }
        //判断是否为String实例
        if(obj instanceof StringEquals){
            //强转
            StringEquals objString =(StringEquals) obj;
            int lenStr =this.value.length;
            //判断长度是否相等
            if(lenStr ==objString.value.length){
                //判断内容是否相等
                char []arr1 =this.value;
                char []arr2=objString.value;
                while (--lenStr>=0){
                    if(arr1[lenStr]!=arr2[lenStr]){
                        return false;
                    }
                }
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        StringEquals stringEqual1=new StringEquals("I am");
        StringEquals stringEqual2 =new StringEquals("I am");
        System.out.println(stringEqual1.equals(stringEqual2));

        StringEquals stringEquals3 =new StringEquals("中国我爱你");
        StringEquals stringEquals4 =new StringEquals("中国");
        System.out.println(stringEquals3.startsWith(stringEquals4));

        StringEquals stringEquals5 =new StringEquals("我爱");
        System.out.println(stringEquals3.startsWith(stringEquals5));

        System.out.println(stringEquals3.startsWith(stringEquals5,2));
        System.out.println(stringEquals3.startsWith(stringEquals5,3));

    }


}
