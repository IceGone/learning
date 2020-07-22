package com.icegone.day24;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class BufferedInputStreamDemo01{
		/**
		 * 从文件中读取数据
		 * 1,创建缓冲流对象
		 * 2，读数据，打印
		 * 3，关闭
		 */
		private static void read() throws IOException {
			//1,创建缓冲--流--对象
			FileInputStream fileIn = new FileInputStream(TEST_PATH+"IO.java");
			//把基本的流包装成高效的流
			BufferedInputStream in = new BufferedInputStream(fileIn);
			//2，读数据
			int ch = -1;
			while ( (ch = in.read()) != -1 ) {
				//打印
				System.out.print((char)ch);
			}
			//3，关闭
			in.close();
		}

	public static void main(String[] args) throws Exception {
		read();
	}
	}
