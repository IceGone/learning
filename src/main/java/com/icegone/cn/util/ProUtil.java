package com.icegone.cn.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/***
 * @Description: properties工具类
 * @Param:
 * @return:
 * @Author: bjchen
 * @Date: 2020/9/15
 */
public class ProUtil extends Properties {
    public static String TEST_PATH=getInstance("config").getPropertyAsString("testPath");

    private Properties properties = null;
    private ClassLoader oClassLoader = null;
    private static Map<String, ProUtil> instanceMap = null;
    private String propertyFileName;
    private static Log log = LogFactory.getLog(ProUtil.class);

    //定义私有构造方法（防止通过 new ProUtil()去实例化）
    private ProUtil(String propertyFileName) {
        this.propertyFileName = propertyFileName;
        loadProperties();
    }

    /**
     * 获取单例对象
     *
     * @param propertyFileName 文件名称
     * @return
     */
    public static ProUtil getInstance(String propertyFileName) {
        if (null==instanceMap){
            instanceMap=new HashMap<String, ProUtil>();
        } else if (instanceMap.get(propertyFileName) != null) {
            return instanceMap.get(propertyFileName);
        }
        //实例化
        ProUtil instance = new ProUtil(propertyFileName);
        instanceMap.put(propertyFileName, instance);

        return instance;
    }

    /**
     * 加载properties文件
     */
    private void loadProperties() {
        try {
            this.properties = new Properties();
            this.oClassLoader = Thread.currentThread().getContextClassLoader();

            InputStream is = oClassLoader.getResourceAsStream(this.propertyFileName + ".properties");
            if (is != null) {
                this.properties.load(is);
                is.close();
            }
            is = null;
        } catch (Exception e) {
            log.error("找不到指定的文件,查看文件名是否正确:" + propertyFileName + e.getMessage(), e);
        }
    }

    /**
     * 获取文件属性值
     *
     * @param propertyName 属性名
     * @param defaultValue 默认值
     * @return
     */
    public String getPropertyAsString(String propertyName, String defaultValue) {
        try {
            if (this.properties == null) {
                loadProperties();
            }
            return this.properties.getProperty(propertyName, defaultValue);
        } catch (Exception e) {
            log.error(propertyName + "属性文件读取错误" + e.getMessage(), e);
        }
        return defaultValue;
    }

    /**
     * 获取String类型的文件属性值
     *
     * @param propertyName
     * @return
     */
    public String getPropertyAsString(String propertyName) {
        return getPropertyAsString(propertyName, null);
    }

    /**
     * 获取Int类型的文件属性值
     *
     * @param propertyName
     * @param defaultValue 默认值
     * @return
     */
    public int getPropertyAsInt(String propertyName, int defaultValue) {
        try {
            if (this.properties == null) {
                loadProperties();
            }
            String sProperty = this.properties.getProperty(propertyName);

            return Integer.parseInt(sProperty);
        } catch (Exception e) {
            log.error(propertyName + "属性文件读取错误" + e.getMessage(), e);
        }
        return defaultValue;
    }

    /**
     * 获取Int类型的文件属性值
     *
     * @param propertyName
     * @return
     */
    public int getPropertyAsInt(String propertyName) {
        return getPropertyAsInt(propertyName, 0);
    }

    /**
     * 修改文件属性值
     *
     * @param propertyName  属性名
     * @param propertyValue 属性值
     */

    public void setPro(String propertyName, String propertyValue) {
        try {
            if (this.properties == null) {
                loadProperties();
            }
            String filePath = String.valueOf(this.oClassLoader.getResource("")) + this.propertyFileName + ".properties";
            filePath = filePath.replaceAll("file:/", "");
            filePath = filePath.replaceAll("%20", " ");
            if (filePath.indexOf(":") != 1) {
                filePath = File.separator + filePath;
            }
            OutputStream fos = new FileOutputStream(filePath);

            properties.setProperty(propertyName, propertyValue);
            properties.store(fos, "Update '" + propertyName + "' value");

            if (fos != null) {
                fos.close();
            }
            fos = null;
        } catch (Exception e) {
            log.error(propertyName + "属性文件更新错误" + e.getMessage(), e);
        }
    }

    /***
    * @Description: 往文件输入新的键值对
    * @Param: [propertyFileName, key, value]
    * @return: void
    * @Author: bjchen
    * @Date: 2020/7/22
    */
    public static void addPro(String propertyName,String key,String value){
        ProUtil proUtil = getInstance(propertyName);
        FileWriter out =null;
        try {
            proUtil.setProperty(key,value);
            //3，创建流
            out = new FileWriter(TEST_PATH+propertyName+".properties",true);
            proUtil.store(out,"add key=value");
        }catch (Exception e){
            log.debug(propertyName+"添加新键值对失败"+ e.getMessage(), e);
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

    public static void main(String[] args) {
        ProUtil config = getInstance("config");
        ProUtil application = getInstance("application");
        System.out.println(config.getPropertyAsString("dirPath"));
        application.setProperty("test","bad");
    }
}