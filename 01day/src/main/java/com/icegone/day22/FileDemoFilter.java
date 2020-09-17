package com.icegone.day22;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class FileDemoFilter {
		public static void main(String[] args) {
			//获取扩展名为.java所有文件
			//创建File对象
			File file = new File("E:\\10_test");
			//获取指定扩展名的文件,由于要对所有文件进行扩展名筛选，因此调用方法需要传递过滤器
			File[] files = file.listFiles(new MyFileFilter());
			//遍历获取到的所有符合条件的文件
			for (File f : files) {
				System.out.println(f);
			}
		}
	}

//定义类实现文件名称FilenameFilter过滤器
class MyFileFilter implements FilenameFilter {
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}

