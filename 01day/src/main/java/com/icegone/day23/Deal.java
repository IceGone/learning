package com.icegone.day23;

import com.icegone.cn.util.ProUtil;

import java.io.FileOutputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class Deal {
		public static void main(String[] args) {
			// try外面声明变量，try里面建立对象 提升作用范围
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(TEST_PATH+"IO.java",true);
				fos.write(100);
				// colse 必须放在 finally 里，必然执行
			} catch (IOException ex) {
				ex.printStackTrace();
				//如果文件写入失败，比如内存满了，抛出异常
				throw new RuntimeException("文件写入失败,请重试！");
			} finally {
				// 由于 fos.close()也会报异常，故也来try catch
				try {
					//判断对象是否建立成功，成功才需要关闭资源
					if(fos!=null)
					fos.close();
				} catch (IOException ex) {
					ex.printStackTrace();
					throw new RuntimeException("关闭资源失败！");
				}
			}
		}
	}
