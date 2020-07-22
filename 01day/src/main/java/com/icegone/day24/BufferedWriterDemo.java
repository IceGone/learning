package com.icegone.day24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/**
 * BufferedWriter 字符缓冲输出流
 * 方法
 * public void newLine()写入一个行分隔符
 * <p>
 * 需求： 通过缓冲输出流写入数据到文件
 * 分析：
 * 1，创建流对象
 * 2，写数据
 * 3，关闭流
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建流
        //基本字符输出流
        FileWriter fileOut = new FileWriter(TEST_PATH+"IO.java");
        //把基本的流进行包装
        BufferedWriter out = new BufferedWriter(fileOut);
        //2，写数据
        for (int i = 0; i < 5; i++) {
            out.write("hello");
            out.newLine();
        }
        //3,关闭流
        out.close();
    }
}
