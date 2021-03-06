package com.icegone.day22;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter {
    public static void main(String[] args) {
        //获取扩展名为.java所有文件
        //创建File对象
        File file = new File("E:\\code\\day11_code");
        //获取指定目录下的文件夹
        File[] files = file.listFiles(new FileFileterByDir());
        //遍历获取到的所有符合条件的文件
        for (File f : files) {
            System.out.println(f);
        }
    }
}

//文件过滤器
class FileFileterByDir implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }
}
