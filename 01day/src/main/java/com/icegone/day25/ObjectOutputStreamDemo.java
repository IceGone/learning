package com.icegone.day25;

import com.icegone.day25.bean.Person;

import java.io.*;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p =new Person("去冰", 18);
        writeObj(p);//对象的序列化。
        readObj();//对象的反序列化。
    }

    /***
     * @Description: 对象序列化
     * @Param: []
     * @return: void
     * @Author: bjchen
     * @Date: 2020/9/22
     */
    public static void writeObj(Object obj) throws IOException {
        //1,明确存储对象的文件。
        FileOutputStream fos = new FileOutputStream(TEST_PATH + "\\person.object");
        //2，给操作文件对象加入写入对象功能。
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //3，调用了写入对象的方法。
        oos.writeObject(obj);
        //关闭资源。
        oos.close();
    }
		

    /***
    * @Description: 对象反序列化
    * @Param: []
    * @return: void
    * @Author: bjchen
    * @Date: 2020/9/22
    */
    public static void readObj() throws IOException,ClassNotFoundException {
        //1,明确读取对象的文件。
        FileInputStream fis =new FileInputStream(TEST_PATH + "\\person.object");
        //2，给操作文件对象加入读取对象功能。
        ObjectInputStream ois =new ObjectInputStream(fis);
        //读取对象并强转
        Person p =(Person) ois.readObject();
        System.out.println(p.toString());
        //关闭资源。
        ois.close();
    }
}
