package com.icegone.day25;

import com.icegone.day23.FileInputStreamRead;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static com.icegone.cn.util.ProUtil.TEST_PATH;
import static com.icegone.cn.util.ProUtil.addPro;

/**
 * @program: learning
 * @description: 属性类练习
 * @author: bjchen
 * @create: 2020-09-22
 **/
public class PropertiesTest {

    /***
    * @Description: Properties集合，它是唯一一个能与IO流交互的集合
     * 需求：向Properties集合中添加元素，并遍历
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/22
    */
    public  void  proAdd(){
        //创建集合对象
        Properties prop = new Properties();
        //添加元素到集合
        //prop.put(key, value);
        prop.setProperty("周迅", "张学友");
        prop.setProperty("李小璐", "贾乃亮");
        prop.setProperty("杨幂", "刘恺威");

        //System.out.println(prop);//测试的使用
        //遍历集合
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            //通过键 找值
            //prop.get(key)
            String value = prop.getProperty(key);
            System.out.println(key+"==" +value);
        }
    }
    @Test
    public void proSet(){
        addPro("config","test","test");
        //1，创建Properties集合
        Properties prop = new Properties();
        FileWriter out =null;
        //2，添加元素到集合
        prop.setProperty("周迅", "张学友");
        prop.setProperty("李小璐", "贾乃亮");
        prop.setProperty("杨幂", "刘恺威");

        try {
            //3，创建流
            out = new FileWriter(TEST_PATH+"prop.properties",true);
            //4，把集合中的数据存储到流所对应的文件中
            prop.store(out, "save data");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //5，关闭流
            if (null!=out){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void getProes() throws Exception{
        //1，创建集合
        Properties prop = new Properties();
        //2，创建流对象
        InputStream in = new FileInputStream(TEST_PATH+"prop.properties");
        InputStreamReader fisr=new InputStreamReader(in,"utf-8");
        //FileReader in = new FileReader("prop.properties");
        //3,把流所对应文件中的数据 读取到集合中
        prop.load(fisr);
        new HashMap<String,String>().putAll((Map)prop);
        //4,关闭流
        in.close();
        //5,显示集合中的数据
        System.out.println(prop);

    }
}
