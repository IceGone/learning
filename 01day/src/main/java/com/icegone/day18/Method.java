package com.icegone.day18;

import java.util.ArrayList;
import java.util.Collection;

/**
	 * Collection接口中的方法：即实现类对接口方法的重写
	 * 是接口中所有实现类必须拥有的方法
	 * 使用Collection 接口的实现类，进行程序练习
	 *  ArrayList implements List extends Collection
	 */
	public class Method {
		public static void main(String[] args) {
			//清空集合中的所有元素   clear()  ：注意 清除的是元素 集合依然存在
			MethodAdd();
			/*判断 如果此集合包含指定的元素，则返回 true  集合.contains(Object o)
			 * 区分大小写，区分类型  比如 String 类型的集合.contains(int i) 结果为false
			 */
			MethodContains();
			//返回此集合中的元素数     集合.size()
			MethodSize();
			/*返回一个包含此集合中所有元素的数组        集合.toArray();
			 * 作用： io 获取文件夹下的文件名，不让改文件名？？？
			 */
			MethodToArray();
			//从该集合中删除指定元素的单个实例（如果存在） 返回 boolean值   集合.remove(); 
			MethodRemove();
		}
		//清空集合中的所有元素   clear()  ：注意 清除的是元素 集合依然存在
		public static void MethodAdd() {
			//使用接口的多态性 创建集合对象
			Collection<String> c=new ArrayList<String>();
			c.add("a"); //往集合中添加字符串
			c.add("bb");
			c.add("ccc");
			//打印 集合中的元素
			System.out.println("打印 集合中的元素"+c);
			c.clear();//清除集合中的元素：
			System.out.println("清理后打印集合中的元素"+c);
		}
		
		//判断 如果此集合包含指定的元素，则返回 true  集合.contains(Object o)
		public static void MethodContains() {
			//使用接口的多态性 创建集合对象
			Collection<String> c=new ArrayList<String>();
			c.add("a"); //往集合中添加字符串
			c.add("bb");
			c.add("ccc");
			c.add("123");
			
			//打印 集合中的元素
			System.out.println("此集合是否包含指定的元素 :bb :"+c.contains("bb"));
			System.out.println("此字符串集合是否包含指定的整型 ：123 :"+c.contains(123));
		}
		//返回此集合中的元素数     集合.size()
		public static void MethodSize() {
			//使用接口的多态性 创建集合对象
			Collection<String> c=new ArrayList<String>();
			c.add("a"); //往集合中添加字符串
			c.add("bb");
			c.add("ccc");
			c.add("123");
			
			//打印 集合中的元素个数
			System.out.println("此集合包含的元素个数为 :"+c.size());
		}
		//返回一个包含此集合中所有元素的数组        集合.toArray();
		public static void MethodToArray() {
			//使用接口的多态性 创建集合对象
			Collection<String> c=new ArrayList<String>();
			c.add("a"); //往集合中添加字符串
			c.add("bb");
			c.add("ccc");
			c.add("123");
			//将返回的数组赋值给新数组
			Object[]str=c.toArray();
			System.out.println("将返回的数组赋值给新数组且遍历：");
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i]+" ");
			}
			System.out.println();
		}
		// 从该集合中删除指定元素的单个实例（如果存在） 返回 boolean值   集合.remove(); 
		public static void MethodRemove() {
			//使用接口的多态性 创建集合对象
			Collection<String> c=new ArrayList<String>();
			c.add("a"); //往集合中添加字符串
			c.add("bb");
			c.add("ccc");
			c.add("123");
			System.out.println("删除 bbb 成功吗？："+c.remove("bbb"));
			System.out.println("删除 ccc 成功吗？："+c.remove("ccc"));
			System.out.println("删除后的集合元素："+c);
		}
}