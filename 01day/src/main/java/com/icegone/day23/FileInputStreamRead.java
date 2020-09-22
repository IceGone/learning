package com.icegone.day23;

import com.icegone.cn.util.ProUtil;

import java.io.FileInputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

//数组作用：缓冲，提高效率
	public class FileInputStreamRead {
		//read(byte[] b) 从该输入流读取最多 b.length个字节的数据为字节数组  返回值：读取到的有效字节数
		public static void main(String[] args)throws IOException {
			FileInputStream fis=new FileInputStream(TEST_PATH+"IO.java");
			//一般字节数 取 1KB=1024=2^10
			byte []b=new byte[1024];
			int length =0;
			//读取字节到数组b中，且将读取的字节数 返回给 length 最大为2
			while((length=fis.read(b))!=-1) {
				//遍历打印字节（转为字符串）
				System.out.print(new String(b,0,length));
			}
	//		int length=fis.read(b);
	//		//将字节数组 转字符串
	//		System.out.println(new String(b));
	//		//打印文件读取长度
	//		System.out.println(length);
	//		
	//		length=fis.read(b);
	//		//将字节数组 转字符串
	//		System.out.println(new String(b));
	//		//打印文件读取长度
	//		System.out.println(length);
	//		
	//		length=fis.read(b);
	//		//将字节数组 转字符串
	//		System.out.println(new String(b));
	//		//打印文件读取长度
	//		System.out.println(length);
	//		
	//		length=fis.read(b);
	//		//将字节数组 转字符串
	//		System.out.println(new String(b));
	//		//打印文件读取长度
	//		System.out.println(length);
	//		
	//		length=fis.read(b);
	//		//将字节数组 转字符串
	//		System.out.println(new String(b));
	//		//打印文件读取长度
	//		System.out.println(length);
			fis.close();
		}
	}
