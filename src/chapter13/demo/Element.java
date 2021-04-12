package chapter13.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示数据结构的接口，它接受访问者的访问
 * @date 2021-04-12 09:46
 */
public interface Element {
    public abstract void accept(Visitor v);
}