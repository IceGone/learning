package com.icegone.day21;

/**
 * @program: architect
 * @description: 测试自定义异常
 * @author: bjchen
 * @create: 2020-06-14
 **/
public class MyExceptionTest {
    public static void main(String[] args) {
        String[] sexs = {"男性", "女性", "中性"};
        for (String sex : sexs) {
            try {
                if (sex.equals("中性")) {
                    throw new MyException("不存在中性的人");//需要捕捉异常并处理
                }else {
                    System.out.println(sex);
                }
            } catch (MyException e) {
                RuntimeException rte=new RuntimeException(e);//包装成RuntimeException
                throw rte;
            }
        }
    }
}
