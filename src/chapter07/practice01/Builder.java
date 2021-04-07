package chapter07.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 声明编写文档的方法
 * @date 2021-04-07 09:54
 */
public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
    String getResult();
}