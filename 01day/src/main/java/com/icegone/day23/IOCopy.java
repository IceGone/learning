package com.icegone.day23;

import com.icegone.cn.util.ProUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.icegone.cn.util.ProUtil.TEST_PATH;

public class IOCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(TEST_PATH + "IO.java");
        FileOutputStream fos = new FileOutputStream(TEST_PATH + "IO_new.java");
        byte[] buffer = new byte[1024];
        int bLen = 0;
        while ((bLen = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bLen);
        }
        fis.close();
        fos.close();
    }
}
