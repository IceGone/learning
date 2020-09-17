package com.icegone.cn.util;

import java.io.*;

/**
 * @program: architect
 * @description: 文件操作工具类
 * @author: bjchen
 * @create: 2020-07-26
 **/
public class FileUtil {

    /***
    * @Description: 将对象序列化到文件
    * @Param: [file, object]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/7/26
    */
    public static void serializable(File file,Object object){
        ObjectOutputStream oos =null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    /***
    * @Description: 反序列化：将文件读取为Object 对象
    * @Param: [file]
    * @return: java.lang.Object
    * @Author: bjchen
    * @Date: 2020/7/26
    */
    public static Object unserializable(File file){
        Object object =null;
        ObjectInputStream ois =null;
        try {
            ois= new ObjectInputStream( new FileInputStream(file));
            object=ois.readObject();
        }catch (Exception e){

        }
        return object;
    }

}
