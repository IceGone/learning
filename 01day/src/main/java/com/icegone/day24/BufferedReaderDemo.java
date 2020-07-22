package com.icegone.day24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/*
	 * BufferedReader 字符缓冲输入流
	 * 
	 * 方法：
	 * 	String readLine() 
	 * 需求：从文件中读取数据，并显示数据
	 */
	public class BufferedReaderDemo {
		public static void main(String[] args) throws IOException {
			//1,创建流
			BufferedReader in = new BufferedReader(new FileReader(TEST_PATH+"IO.java"));
			//2，读数据
			//一次一个字符
			//一次一个字符数组
			//一次读取文本中一行的字符串内容
			String line = null;
			while( (line = in.readLine()) != null ){
				System.out.println(line);
			}
			
			//3,关闭流
			in.close();
		}
	}
