package chapter18.demo.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-16 09:54
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {
            "apple", "grape", "banana", "orange"
    };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMomey() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("money increase");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("money decrease");
        } else if (dice == 6) {
            String f = getFruits();
            System.out.println("get fruit(" + f + ")");
        } else {
            System.out.println("nothing happened");
        }
    }
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("yummy")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {
        this.money = money;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    private String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "yummy";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}