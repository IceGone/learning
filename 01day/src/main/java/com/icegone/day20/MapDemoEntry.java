package com.icegone.day20;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemoEntry {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> map = new HashMap<String, String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        //获取Map中的所有key与value的对应关系
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历Set集合
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            //得到每一对对应关系
            Map.Entry<String, String> entry = it.next();
            //通过每一对对应关系获取对应的key
            String key = entry.getKey();
            //通过每一对对应关系获取对应的value
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void testEntry() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "2");
        map.put("2", "3");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void testEntryShort() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "2");
        map.put("2", "3");
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "--"+entry.getValue());
        }
    }
}
