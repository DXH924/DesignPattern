package chapter09.practice;

import java.util.Random;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-09 11:18
 */
public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        int count = new Random().nextInt(times);
        for (int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}