package com.icegone.day12;

public class Test {
			public static void main(String[] args) {
				new Zi();
			}
			
		}
		class Fu{

			int num ;
			{
				System.out.println("Fu代码块"+num);
			}
			static {

				System.out.println("Fu静态代码块");
			}
			Fu(){
				num =1;
				System.out.println("Fu构造方法"+num);
			}
		}
		class Zi extends Fu{
			{
				num =2;
				System.out.println("Zi代码块"+num);
			}
			static {
				System.out.println("Zi静态代码块");
			}
			Zi(){
		         //super(); 子类构造方法中有一句super(),调用父类空参数构造方法 。
				num =3;
				System.out.println("Zi构造方法"+num);
			}
		}
