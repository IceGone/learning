package com.icegone.day12;

/***
* @Description: 构造方法与一般方法可以同名
* @Param: 
* @return: 
* @Author: bjchen
* @Date: 2020/10/21
*/
class Person {
	public Person(){
		System.out.println("我是构造方法");
	}
			void Person() {
				System.out.println("我是成员方法");
			}
		}
		 
		class PersonDemo {
			public static void main(String[] args) {
				new Person().Person();
			}
		}


