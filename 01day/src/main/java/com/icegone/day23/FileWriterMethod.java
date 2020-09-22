package com.icegone.day23;

import java.io.FileWriter;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/**
 * Writer类的子类对象FileWriter
 *  构造方法：写入的数据 目的
 *   File 类型对象
 *   String 文件名
 *   字符输出流写数据的时候，必须要运行一个功能：刷新功能    flush()
 */
public class FileWriterMethod {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter(TEST_PATH+"variable.java",true);
		
		//写一个字符
		fw.write(100);
		fw.write('\n');
		//刷新功能
		fw.flush();
		
		//写1个字符数组  
		char []c= {'a','b','c','d','\n'};
		fw.write(c);
		//建议写一次 刷新一次
		fw.flush();
		
		//写字符数组一部分  源字符数组  索引 长度
		fw.write(c,0,5);
		fw.flush();
		
		//写入字符串
		fw.write("写入字符串\n");
		
		fw.close();
	}
}
