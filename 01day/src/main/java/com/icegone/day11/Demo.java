package com.icegone.day11;

interface Demo { ///定义一个名称为Demo的接口。
			public static final int NUM = 1;// NUM的值不能改变
			int NUM_TEST =2;
			public abstract void show1();
			public abstract void show2();
			public abstract void show3();
		}

//定义子类去覆盖接口中的方法。类与接口之间的关系是 实现。通过 关键字 implements
class DemoImpl implements Demo { //子类实现Demo接口。

	public static void main(String[] args) {
		DemoImpl demo =new DemoImpl();
		demo.show1();
		demo.show2();
		demo.show3();
		System.out.println();
	}

	private static int NUM_SON=3;
	//重写接口中的方法。
	@Override
	public void show1(){
		System.out.println(NUM);
	}
	@Override
	public void show2(){
		System.out.println(NUM_SON+NUM);
	}
	@Override
	public void show3(){
		System.out.println(NUM_SON+NUM+NUM_TEST);
	}

}
		 

