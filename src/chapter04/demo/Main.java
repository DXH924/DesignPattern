package chapter04.demo;

import chapter04.demo.framework.Factory;
import chapter04.demo.framework.Product;
import chapter04.demo.idcard.IDCardFactory;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:38
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Alice");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Cindy");
        card1.use();
        card2.use();
        card3.use();
    }
}