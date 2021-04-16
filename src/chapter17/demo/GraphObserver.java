package chapter17.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-15 08:44
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}