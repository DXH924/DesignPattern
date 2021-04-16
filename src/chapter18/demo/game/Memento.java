package chapter18.demo.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示Gamer（主人公）状态的类
 * @date 2021-04-16 09:52
 */
public class Memento {
    int money;
    ArrayList fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    List getFruits() {
        return (List)fruits.clone();
    }
}