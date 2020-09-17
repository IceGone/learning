package com.icegone.day13;

//成员内部类
class Body {//外部类，身体
    private boolean life = true; //生命状态

    public class Heart { //内部类，心脏
        public void jump() {
            System.out.println("心脏噗通噗通的跳");
            System.out.println("生命状态" + life); //访问外部类成员变量
        }
    }

    //访问内部类
    public static void main(String[] args) {
        //创建内部类对象
        Heart bh = new Body().new Heart();
        //调用内部类中的方法
        bh.jump();
    }
}
