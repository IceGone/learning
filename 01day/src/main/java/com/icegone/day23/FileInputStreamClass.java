package com.icegone.day23;

import com.icegone.cn.util.ProUtil;

import java.io.FileInputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/*
	 * FileInputStream 读取文件
	 * 构造方法 ：为这个流对象绑定数据源
	 * 参数
	 *  File 类型对象
	 *  String 对象
	 *  输入流读取文件的步骤
	 *  1.创建字节输入流的子类对象
	 *  2.调用读取方法read读取
	 *  3.关闭资源
	 *  注意：使用循环方式，读取文件
	 *  循环结束的条件  read()方法返回 -1
	 */
	public class FileInputStreamClass {
		public static void main(String[] args) throws IOException {
			// 创建输入流对象
			FileInputStream fis = new FileInputStream(TEST_PATH+"IO.java");
			// // 读取一个字节，调用方法 read() 从该输入流读取一个字节的数据,且执行一次，自动读取下一个字节
			// int i = fis.read();
			// // 输出字节 i:100 可强转为 char
			// System.out.println((char) i);
			// // 再继续读取一个字节
			// i = fis.read();
			// System.out.println((char) i);
			// // 再继续读取一个字节
			// i = fis.read();
			// System.out.println((char) i);
			// // 如果字节读完，再 read()输出为 -1 之后都为 -1
			// // 关闭资源
			// fis.close();
			// // 遍历方法 读文件
			funcRecursion(fis);
		}
	
		// 定义循环 遍历 文件内容
		public static void funcRecursion(FileInputStream fis) throws IOException {
			int len = 0;
			while ((len = fis.read()) != -1) {
				System.out.print((char) len);
			}
			fis.close();
		}
	}
