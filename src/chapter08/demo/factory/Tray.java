package chapter08.demo.factory;

import java.util.ArrayList;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 含有多个Link类和Tray类的容器
 * @date 2021-04-08 10:03
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}