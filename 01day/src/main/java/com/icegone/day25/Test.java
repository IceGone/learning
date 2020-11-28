package com.icegone.day25;

import cn.hutool.system.*;
import cn.hutool.system.oshi.OshiUtil;
import com.alibaba.fastjson.JSON;

/**
 * @program: learning
 * @description: 测试 hutool工具包
 * @author: bjchen
 * @create: 2020-07-22
 **/
public class Test {
    public static void main(String[] args) {
        //System.out.println(OshiUtil.getCpuInfo().toString());
        System.out.println(new HostInfo().toString());
        System.out.println(new JavaInfo().toString());
        System.out.println(new JavaRuntimeInfo().toString());
        System.out.println(new JvmSpecInfo().toString());
    }
}
