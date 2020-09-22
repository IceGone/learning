package com.icegone.day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/*
	 *  字符输入流读取文本  FileReader
	 *  作用：专门读取文本文件
	 *      方法： read()
	 *  构造方法：绑定数据源
	 *     参数：File 类型对象
	 */
	public class FileReaderMethod {
		public static void main(String[] args) throws IOException {
			FileReader fw =new FileReader(TEST_PATH+"variable.java");
			char[]buf =new char[2^10];
			int bLen=0;
			while((bLen=fw.read(buf))!=-1){
				System.out.println(new String(buf,0,bLen));
			}
			fw.close();
		}

	}
