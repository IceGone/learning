package com.icegone.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorException {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("ccc");
        listIteratorExc(l);
        iteratorExc(l);
        System.out.println(l);
    }

    /***
     * @Description: ListIterator :增加一元素"CCC"
     * @Param: [l]
     * @return: void
     * @Author: bjchen
     * @Date: 2020/10/22
     */
    public static void listIteratorExc(ArrayList<String> l) {
        for (ListIterator<String> lIterator = l.listIterator(); lIterator.hasNext(); ) {
            if (lIterator.next().equals("ccc")) {
                //注意：此处使用的是迭代器里的add方法
                lIterator.add("CCC");
            }
        }
    }

    /***
     * @Description: Iterator:增加一元素"CCC"
     * @Param: [l]
     * @return: void
     * @Author: bjchen
     * @Date: 2020/10/22
     */
    public static void iteratorExc(List<String> l) {
        for (Iterator<String> iterator = l.iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals("ccc")) {
                l.add("CCC");
            }
        }
    }
}
