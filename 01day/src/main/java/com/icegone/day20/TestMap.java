package com.icegone.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: architect
 * @description: 测试map的遍历性能
 * @author: bjchen
 * @create: 2020-09-14
 **/
public class TestMap {
    public static void main(String[] args) {
        testMap(10000000);
        testMap(1000000);
        testMap(100000);
    }

    /***
    * @Description:
    * @Param: [time]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/14
    */
    public static void testMap(int time){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$："+time +"次");
        // 初始化，10W次赋值
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < time; i++)
            map.put(i, i);

        /** 增强for循环，keySet迭代 */
        long start = System.currentTimeMillis();
        for (Integer key : map.keySet()) {
            map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("增强for循环，keySet迭代 -> " + (end - start) + " ms");

        /** 增强for循环，entrySet迭代 */
        start = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("增强for循环，entrySet迭代 -> " + (end - start) + " ms");

        /** 迭代器，keySet迭代 */
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = map.keySet().iterator();
        Integer key;
        while (iterator.hasNext()) {
            key = iterator.next();
            map.get(key);
        }
        end = System.currentTimeMillis();
        System.out.println("迭代器，keySet迭代 -> " + (end - start) + " ms");

        /** 迭代器，entrySet迭代 */
        start = System.currentTimeMillis();
        for (Iterator<Map.Entry<Integer, Integer>> iterator1 = map.entrySet().iterator();iterator1.hasNext();) {
            Map.Entry<Integer, Integer> entry= iterator1.next();
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();

        System.out.println("迭代器，entrySet迭代 -> " + (end - start) + " ms");
    }
}
