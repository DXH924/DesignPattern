package chapter08.demo.factory;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 方便统一处理Link和Tray的类
 * @date 2021-04-08 09:59
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}