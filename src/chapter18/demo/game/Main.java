package chapter18.demo.game;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-16 10:01
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("current: " + gamer);
            gamer.bet();
            System.out.println("have money: " + gamer.getMomey());
            if (gamer.getMomey() > memento.getMoney()) {
                System.out.println("money increase, save memento");
                memento = gamer.createMemento();
            } else if (gamer.getMomey() < memento.getMoney() / 2) {
                System.out.println("money decrease, restore memento");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}