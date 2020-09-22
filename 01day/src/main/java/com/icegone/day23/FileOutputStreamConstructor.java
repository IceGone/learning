package com.icegone.day23;

import com.icegone.cn.util.ProUtil;

import java.io.FileOutputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/*
	 * 写入数据文件
	 * 继承父类方法，使用子类对象
	 * 子类中构造方法：
	 *  作用：绑定数据的输出目的
	 *  使用步骤：
	 *     1.创建流的子类对象，用构造器绑定数据目的   ：文件不存在，则自动创建
	 *                                  文件存在，则直接覆盖
	 *     2.调用流对象的方法 write写
	 *     3.close 释放资源
	 *  
	 */
	public class FileOutputStreamConstructor {
		public static void main(String[] args)throws IOException {
			//创建输出流 封装对象                                      //绑定目的文件
			//如果文件不存在，则创建
			FileOutputStream fos=new FileOutputStream(TEST_PATH+"IO.java");
			//调用流对象的方法write 写 1 字节     write(int b)
			fos.write(100);
			//调用流对象的方法write 写字节数组 write(byte[] b) 
			byte[] bytes= {65,66,67,68};
			fos.write(bytes);
			//write(byte[] b, int off, int len) 
			//将 len字节从位于偏移量 off的指定字节数组写入此文件输出流
			fos.write(bytes, 2, 2);
			//写入字符串  通过String 的getBytes()方法
			fos.write(" I Love You !".getBytes());
			//关闭资源
			fos.close();
		}
	
	}
