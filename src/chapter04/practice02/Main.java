package chapter04.practice02;

import chapter04.practice02.framework.Factory;
import chapter04.practice02.framework.Product;
import chapter04.practice02.idcard.IDCard;
import chapter04.practice02.idcard.IDCardFactory;

import java.security.acl.Owner;
import java.util.Map;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:38
 */
public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("Alice");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Cindy");
        card1.use();
        card2.use();
        card3.use();
        Map<Integer, IDCard> owners = factory.getOwners();
        for (Integer id : owners.keySet()) {
            System.out.println("id = " + id + ", owner = " + owners.get(id).getOwner());
        }
    }
}