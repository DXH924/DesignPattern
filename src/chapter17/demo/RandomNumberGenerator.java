package chapter17.demo;

import java.util.Random;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示具体的被观察对象，当自身状态发生改变后，会通知所有已经注册的Observer对象
 * @date 2021-04-15 08:40
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}