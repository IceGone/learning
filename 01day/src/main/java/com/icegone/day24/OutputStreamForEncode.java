package com.icegone.day24;

import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class OutputStreamForEncode {
		public static void main(String[] args)throws IOException {
			//创建字节输出流 封装对象 
			FileInputStream fis=new FileInputStream(TEST_PATH+"variable.java");
			//将字节输出流 与字节转换流  isr 绑定，且指定编码格式
			InputStreamReader isw=new InputStreamReader(fis,"GBK");
			//创建字符输出流 封装对象 fos
			FileOutputStream fos=new FileOutputStream(TEST_PATH+"variable_copy.java",true);
			//将字符输出流与 字符转字节流  osw绑定，且指定编码格式
			OutputStreamWriter osw =new OutputStreamWriter(fos,"UTF-8");
			//设定缓冲区大小
			char[]b= new char[1024];
			//设置每次缓冲区里 索引的变化长度
			int length=0;
			//将缓冲区里的字符流 转换为字节流  且写入文件D
			while((length=isw.read(b))!=-1) {
				osw.write(b,0,length);
			}
			osw.write("你好\n");
			fis.close();
			osw.close();
		}
	}
