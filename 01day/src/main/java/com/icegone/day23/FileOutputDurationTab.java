package com.icegone.day23;

import java.io.FileOutputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

/*
 * 		//文件的续写  FileOutputStream(File file, boolean append)
        //        创建文件输出流以写入由指定的 File对象表示的文件。
 */
public class FileOutputDurationTab {
    public static void main(String[] args) throws IOException {
        //创建文件输出流  跟着true表示 写入为续写
        FileOutputStream fos = new FileOutputStream(TEST_PATH + "IO.java", true);
        //往文件里续写 字节流
        fos.write("\rtrue".getBytes());
        /*在文件中，写入换行，符号换行 \r或者\n
         * 可以卸载上一行的末尾，也可以写在下一行的开头
         */
        fos.write("\nHello\r".getBytes());
        fos.write("World".getBytes());
        //关闭资源
        fos.close();
    }


}
