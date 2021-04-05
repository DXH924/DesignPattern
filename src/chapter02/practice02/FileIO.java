package chapter02.practice02;

import java.io.IOException;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: Targer角色，声明将属性集合保存至文件的方法
 * @date 2021-04-05 12:55
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
