package com.icegone.cn.interview;


import org.junit.Test;

import java.io.File;

import static com.icegone.cn.util.FileUtil.serializable;
import static com.icegone.cn.util.FileUtil.unserializable;


/**
 * @program: architect
 * @description: Java关键字剖析
 * @author: bjchen
 * @create: 2020-07-26
 **/
public class KeyWorld {

    /** instanceof */
    @Test
    public void keyOfInstancesOf(){
        Person person =new Man();
        System.out.println("person instanceof Man --"+ (person instanceof Man));
        //System.out.println("person instanceof Man --"+ (manNot instanceof Man));
    }

    /**transient*/
    @Test
    public void keyOfTransient(){
        Person person = new Man();
        person.setAge(18);
        person.setName("icegone");
        File file =new File("C:\\Users\\SS238\\Desktop\\transient");
        //序列化：直接将对象写入到文件
        serializable(file,person);
        Man man=(Man)unserializable(file);
        System.out.println(man);
    }
}
