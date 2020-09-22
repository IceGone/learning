package com.icegone.day23;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class IOCopyExceptionDeal {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //对创建文件流和复制 tay catch
        try {
            //创建 源文件对象
            fis = new FileInputStream(TEST_PATH + "IO.java");
            //创建目的文件对象
            fos = new FileOutputStream(TEST_PATH + "IO_new.java", true);
            //创建一个 1KB的缓冲区
            byte[] b = new byte[1024];
            int length = 0;
            while ((length = fis.read(b)) != -1) {
                fos.write(b, 0, length);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("文件复制失败！");
        } finally {
            //对关闭 文件流进行异常处理
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException("fis文件不存在！");
            } finally {
                try {
                    if (fos != null)
                        fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    throw new RuntimeException("fos文件不存在！");
                }
            }
        }
    }
}
