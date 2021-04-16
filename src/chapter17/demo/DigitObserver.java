package chapter17.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 以数字形式显示观察到的数值
 * @date 2021-04-15 08:42
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObservers: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}