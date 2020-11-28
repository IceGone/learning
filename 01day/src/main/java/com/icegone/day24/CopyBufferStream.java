package com.icegone.day24;

import java.io.*;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/**
 * 需求：将d:\\test.avi文件进行复制
 * 采用4种方式复制
 * 方式1： 采用基本的流，一次一个字节的方式复制	共耗时 224613毫秒
 * 方式2： 采用基本的流，一个多个字节的方式赋值	共耗时     327毫秒
 * 方式3： 采用高效的流，一次一个字节的方式复制	共耗时    2047毫秒
 * 方式4： 采用高效的流，一个多个字节的方式赋值	共耗时      96毫秒
 * <p>
 * 数据源： d:\\test.avi
 * 目的地1: d:\\copy1.avi
 * 目的地2: d:\\copy2.avi
 * 目的地3: d:\\copy3.avi
 * 目的地4: d:\\copy4.avi
 * <p>
 * 实现的步骤：
 * 1，指定数据源
 * 2，指定目的地
 * 3，读数据
 * 4，写数据
 * 5，关闭流
 */
public class CopyBufferStream {
    public static void main(String[] args) throws IOException {
        //开始计时
        long start = System.currentTimeMillis();
        //方式1： 采用基本的流，一次一个字节的方式复制
        //method1(TEST_PATH+"test.mp4", TEST_PATH+"test1.mp4");
        //System.out.println("共耗时 " + (System.currentTimeMillis() - start) + "毫秒");

        //方式2： 采用基本的流，一个多个字节的方式赋值
        method2(TEST_PATH+"test.mp4", TEST_PATH+"test2.mp4");
        System.out.println("共耗时 " + (System.currentTimeMillis() - start) + "毫秒");

        //方式3： 采用高效的流，一次一个字节的方式复制
        method3(TEST_PATH+"test.mp4", TEST_PATH+"test3.mp4");
        System.out.println("共耗时 " + (System.currentTimeMillis() - start) + "毫秒");

        //方式4： 采用高效的流，一个多个字节的方式赋值
        method4(TEST_PATH+"test.mp4", TEST_PATH+"test4.mp4");
        System.out.println("共耗时 " + (System.currentTimeMillis() - start) + "毫秒");
    }

    //方式4： 采用高效的流，一个多个字节的方式赋值
    public static void method4(String src, String dest) throws IOException {
        //1，指定数据源
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        //2，指定目的地
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        //3，读数据
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            //4,写数据
            out.write(buffer, 0, len);
        }
        //5，关闭流
        in.close();
        out.close();
    }

    //方式3： 采用高效的流，一次一个字节的方式复制
    public static void method3(String src, String dest) throws IOException {
        //1，指定数据源
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        //2，指定目的地
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        //3，读数据
        int ch = -1;
        while ((ch = in.read()) != -1) {
            //4，写数据
            out.write(ch);
        }
        //5，关闭流
        in.close();
        out.close();
    }

    //方式2： 采用基本的流，一个多个字节的方式赋值
    public static void method2(String src, String dest) throws IOException {
        //1，指定数据源
        FileInputStream in = new FileInputStream(src);
        //2，指定目的地
        FileOutputStream out = new FileOutputStream(dest);
        //3，读数据
        byte[] buffer = new byte[1024];
        int len = -1;
        //读写都添加缓冲区
        while ((len = in.read(buffer)) != -1) {
            //4，写数据
            out.write(buffer, 0, len);
        }
        //5，关闭流
        in.close();
        out.close();
    }

    //方式1： 采用基本的流，一次一个字节的方式复制
    public static void method1(String src, String dest) throws IOException {
        //1，指定数据源
        FileInputStream in = new FileInputStream(src);
        //2，指定目的地
        FileOutputStream out = new FileOutputStream(dest);
        //3，读数据
        int ch = -1;
        while ((ch = in.read()) != -1) {
            //4，写数据
            out.write(ch);
        }
        //5，关闭流
        in.close();
        out.close();
    }
}
