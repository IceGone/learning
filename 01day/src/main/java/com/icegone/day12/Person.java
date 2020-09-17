package com.icegone.day12;

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
