package chapter07.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 声明编写文档的方法
 * @date 2021-04-07 09:54
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}