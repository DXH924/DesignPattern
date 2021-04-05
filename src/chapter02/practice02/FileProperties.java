package chapter02.practice02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 使用Adapter模式编写一个将属性集合保存至文件中的FileProperties类
 * @date 2021-04-05 12:54
 */
public class FileProperties extends Properties implements FileIO {
    // 写入键值对
    public FileProperties() {
        super();
    }
    @Override
    public void readFromFile(String filename) throws IOException {
        System.out.println("read from " + filename);
        // 将来自filename的键值对读入readMap
        FileInputStream fis = new FileInputStream(filename);
        load(fis);
        Set<String> keys = stringPropertyNames();
        for (String key : keys) {
            System.out.println("<key = " + key + ", value = " + getProperty(key) + ">");
        }

    }

    @Override
    public void writeToFile(String filename) throws IOException {
        // 将writeMap的键值对写入filename
        FileOutputStream fos = new FileOutputStream(filename);
        store(fos, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}