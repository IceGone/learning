package com.icegone.main;

import org.junit.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * @program: architect
 * @description: 测试
 * @author: bjchen
 * @create: 2020-01-21
 **/
public class RebotTest {
    /***
    * @Description: 自动合成卡片 需要传入自动合成的次数 cardNum
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/29
    */
    @Test
    public void autoCombineCard(){
        int cardNum=210;
        for(int i=0;i<cardNum;++i){
            if(i%12==0){
                //定期将卡片放入仓库
                inWarehouse();
            }
            autoCard();
        }
    }


    /***
    * @Description: 自动升级卡片 默认第四排  需要传入升级多少种cardNum 升级总次数 increNum
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/2/3
    */
    @Test
    public void autoCardIncreaseDegree(){
        //卡片升级栏位个数 第四排
        int cardNum=3;
        //计划升级次数
        int increNum=90;
        // 卡片坐标
        int x=489;
        int y=369;
        for(int i=0;i<increNum;i++){
            if(i%cardNum==0){
                //重置坐标x轴
                x=489;
            }else {
                x+=30;
            }
            //清除升级栏可能有的卡片
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,263,260);
            onclickMouse("left");
            //选择要升级的卡片
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,381,480);
            onclickMouse("left");
            // 要升级的卡片坐标
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,x,y);
            onclickMouse("left");
            //胚子 坐标
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,484,393);
            onclickMouse("left");
            // 升级
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,260,510);
            onclickMouse("left");
            try{
                Thread.sleep(1000+new Double(new Random().nextDouble()*200).intValue());
            }catch (Exception e){
                e.printStackTrace();
            }
            //确定
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,320,400);
            onclickMouse("left");
        }
    }


    /***
     * @Description: 自动生成宝珠 需传入（修改）生成宝珠的次数 cardCount 默认第一排开始
     * @Param: []
     * @return: void
     * @Author: bjchen
     * @Date: 2020/1/29
     */
    @Test
    public void autoGenerateBean(){
        //卡片生成宝珠的个数
        int cardCount =11;
        //行列
        int row =0;
        int col=0;
        //先打开生成宝珠窗口
        keyboard("ESC");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,223,181);
        onclickMouse("left");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,337,250);
        onclickMouse("left");
        for(int i=0;i<cardCount;++i){
            row =i%8;
            col=i/8;
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            System.out.println(486+row*30);
            System.out.println(276+col*30);
            System.out.println("-----------------------");
            mouseMoveRelative0AndAbsoultive1(1,486+row*30,276+col*30);
            //(351,283) 拖拽卡片
            onclickMousePull(-135+row*-30,-10+col*-30);

            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,348,340);
            onclickMouse("left");
            //确定生成宝珠
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,368,473);
            onclickMouse("left");
            //确定数量
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,368,473);
            onclickMouse("left");
            try{
                Thread.sleep(4500+new Double(new Random().nextDouble()*200).intValue());
            }catch (Exception e){
                e.printStackTrace();
            }
            mouseMoveRelative0AndAbsoultive1(0,0,0);
            mouseMoveRelative0AndAbsoultive1(1,398,337);
            onclickMouse("left");
        }



    }

    /***
    * @Description: 自动合成卡片
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/28
    */
    public static void autoCard(){
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,134,576);
        onclickMouse("right");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,381,475);
        onclickMouse("left");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,482,389);
        onclickMouse("left");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,482,389);
        onclickMouse("left");
/*
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,514,389);
        onclickMouse("left");
*/
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,255,510);
        onclickMouse("left");
        //延缓 合成的卡片信息消失时间
        try{
            Thread.sleep(700+new Double(new Random().nextDouble()*2500).intValue());
        }catch (Exception e){
            e.printStackTrace();
        }
        //合成成功之后 点击确定
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,320,408);
        onclickMouse("left");

        try{
            Thread.sleep(new Double(new Random().nextDouble()*1200).intValue());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    

    /***
    * @Description: 避免卡片过多 放人仓库
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/28
    */
    public static void inWarehouse(){
        keyboard("ESC");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,235,362);
        onclickMouse("left");
        //切换账号金库
//        mouseMoveRelative0AndAbsoultive1(0,0,0);
//        mouseMoveRelative0AndAbsoultive1(1,279,125);
//        onclickMouse("left");

        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,286,452);
        onclickMouse("left");
        mouseMoveRelative0AndAbsoultive1(0,0,0);
        mouseMoveRelative0AndAbsoultive1(1,354,344);
        onclickMouse("left");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        keyboard("ESC");
    }

    /***
    * @Description: 鼠标移动：type 为0 代表 相对屏幕坐标0点 移动x ，y
     *                        type 非0 代表 相对鼠标当前位置 移动x，y
    * @Param: [type, x, y]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/21
    */
    public static void mouseMoveRelative0AndAbsoultive1(int type, int x, int y){
        Point p = MouseInfo.getPointerInfo().getLocation();
        int width = (int) p.getX() + x;
        int heigh = (int) p.getY() + y;
        if(type == 0) {
            width = x;
            heigh = y;
        }
        Robot robot;
        try {
            robot = new Robot();
                robot.mouseMove(width, heigh);
                robot.delay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /***
    * @Description: 模拟鼠标左键右键
    * @Param: [lr]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/21
    */
    public static void onclickMouse(String lr){
        Robot robot = null;
        try {
            robot = new Robot();
            //设置Robot产生一个动作后的休眠时间,否则执行过快
            robot.setAutoDelay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        if(lr.equals("right")) {
            robot.mousePress(InputEvent.BUTTON3_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON3_MASK);
        } else {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }
    /***
    * @Description: 鼠标拖拽
    * @Param: [lr]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/29
    */
    public static void onclickMousePull(int x,int y){
        Robot robot = null;
        try {
            robot = new Robot();
            //设置Robot产生一个动作后的休眠时间,否则执行过快
            robot.setAutoDelay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //按下键
        robot.mousePress(InputEvent.BUTTON1_MASK);
        //鼠标拖拽 到目标窗口
        mouseMoveRelative0AndAbsoultive1(1,x,y);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    /***
    * @Description: 模拟键盘按键  需传入对应的键 字符串
    * @Param: [key]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/1/28
    */
    public static void keyboard(String key){
        Robot robot = null;
        try {
            robot = new Robot();
            //设置Robot产生一个动作后的休眠时间,否则执行过快
            robot.setAutoDelay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
}
