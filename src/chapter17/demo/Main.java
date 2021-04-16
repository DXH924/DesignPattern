package chapter17.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-15 08:46
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}