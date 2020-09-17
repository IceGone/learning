package com.icegone.day21;

/**
 * @program: architect
 * @description: 异常处理
 * @author: bjchen
 * @create: 2020-06-14
 **/
public class TryCatch {
    public static void main(String[] args) {
        test2();
    }

    /***
    * @Description: 其实更合理的做法是，既不在try block内部中使用return语句，也不在finally内部使用 return语句，而应该在 finally 语句之后使用return来表示函数的结束和返回
    * @Param: []
    * @return: int
    * @Author: bjchen
    * @Date: 2020/6/15
    */
    public static int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常抛出了！！");
            //return result = 999;
        } finally {
            System.out.println("这是finally，哈哈哈！！");
            System.out.println("result的值为：" + result);
            //return result;//编译器警告
        }
        return result;
    }


}
