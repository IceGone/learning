package com.icegone.day20;

import java.util.LinkedHashMap;

public class LinkedHashSetProperties {
		public static void main(String[] args) {
			LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
			lhm.put("张一", "王一");
			lhm.put("张二", "王二");
			lhm.put("张三", "王三");
			lhm.put("张四", "王四");
			lhm.put("张四", "王四");
			//由于String已经重写过 hashcode 和equals方法，故滤重
			System.out.println("打印有序哈希表：LinkedHashMap：");
			System.out.println(lhm.toString());
		}
	}
