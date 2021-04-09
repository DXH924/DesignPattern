package chapter09.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 规定显示次数
 * @date 2021-04-09 11:09
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();

    }
}