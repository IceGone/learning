package com.icegone.day23;

import java.io.FileReader;
import java.io.FileWriter;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class RWCopy {
		public static void main(String[] args)  {
			FileReader fr=null;
			FileWriter fw =null;
			char[]buff=new char[1024];
			int bLen=0;
			try {
				fr=new FileReader(TEST_PATH+"variable.java");
				fw =new FileWriter(TEST_PATH+"variablenew.java",true);
				while ((bLen=fr.read(buff))!=-1){
					fw.write(new String(buff,0,bLen));
					//如果不执行flush，则不会保存成功
					fw.flush();
				}
			}catch (Exception e){
				e.printStackTrace();
			}


		}
	}
