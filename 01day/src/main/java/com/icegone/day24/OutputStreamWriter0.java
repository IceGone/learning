package com.icegone.day24;

import java.io.*;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/**
 * @program: learning
 * @description: 转换流
 * @author: bjchen
 * @create: 2020-09-22
 **/
public class OutputStreamWriter0 {

    /***
    * @Description: 写
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/22
    */
    public static void writeExchange() throws Exception {
        //创建与文件关联的字节输出流对象
        FileOutputStream fos = new FileOutputStream(TEST_PATH+"IO.java");
        //创建可以把字符转成字节的转换流对象，并指定编码
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        //调用转换流，把文字写出去，其实是写到转换流的缓冲区中
        osw.write("你好");//写入缓冲区。
        osw.close();
    }

    /***
    * @Description: 读
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/22
    */
    public static void readExchange() throws IOException {
        //创建读取文件的字节流对象
        InputStream in = new FileInputStream(TEST_PATH+"IO.java");
        //创建转换流对象
        //InputStreamReader isr = new InputStreamReader(in);这样创建对象，会用本地默认码表读取，将会发生错误解码的错误
        InputStreamReader isr = new InputStreamReader(in,"utf-8");
        //使用转换流去读字节流中的字节
        int ch = 0;
        while((ch = isr.read())!=-1){
            System.out.println((char)ch);
        }
        //关闭流
        isr.close();
}


    public static void main(String[] args)throws Exception {
        writeExchange();
    }

}
