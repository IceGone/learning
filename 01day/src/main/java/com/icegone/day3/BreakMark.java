package com.icegone.day3;

import org.junit.Test;

/**
 * @program: architect
 * @description: break 标记跳出
 * @author: bjchen
 * @create: 2020-08-09
 **/
public class BreakMark {
    /***
    * @Description: 作用 ：从多重嵌套循环break或continue
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/8/9
    */
    @Test
    public void breakMark(){
        int i, j; // 定义两个循环变量
        itcast: for (i = 1; i <= 9; i++) { // 外层循环
            for (j = 1; j <= i; j++) { // 内层循环
                if (i > 4) { // 判断i的值是否大于4
                    break itcast; // 跳出外层循环
                }
                System.out.print("*"); // 打印*
            }
            System.out.print("\n"); // 换行
        }
    }
}
