package chapter09.practice;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 负责显示功能
 * @date 2021-04-09 11:07
 */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}