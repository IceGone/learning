package com.icegone.day25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/**
 * 分析：
 * 1，创建流
 * 2，写数据
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建流
        PrintWriter out = new PrintWriter(new FileWriter(TEST_PATH+"printFile.txt"), true);
        //2，写数据
        for (int i = 0; i < 5; i++) {
            out.println("helloWorld");
        }
        //3,关闭流
        out.close();
    }
}
