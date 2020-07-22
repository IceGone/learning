package com.icegone.day24;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo01 {
		/**
		 * 写数据到文件的方法
		 * 1,创建流
		 * 2，写数据
		 * 3，关闭流
		 */
		private static void write() throws IOException {
			//创建基本的字节输出流
			FileOutputStream fileOut = new FileOutputStream("abc.txt");
			//使用高效的流，把基本的流进行封装，实现速度的提升
			BufferedOutputStream out = new BufferedOutputStream(fileOut);
			//2，写数据
			out.write("hello".getBytes());
			//3，关闭流
			out.close();
		}

	public static void main(String[] args) throws IOException {
		//写数据到文件的方法
		write();
	}
	}
