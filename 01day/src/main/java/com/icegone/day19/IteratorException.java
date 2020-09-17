package com.icegone.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorException {
		public static void main(String[] args) {
			List<String> l=new ArrayList<String>();
			l.add("a");
			l.add("bb");
			l.add("ccc");
			l.add("dddd");
			IteratorExc(l);
		}
		//增加一元素"CCC" 
		public static void IteratorExc(List<String> l) {
			Iterator<String> i=l.iterator();
			while(i.hasNext()) {
				if(i.next().equals("ccc")) {
					l.add("CCC");
				}
			}
		}
	}
