package chapter04.practice02.idcard;

import chapter04.practice02.framework.Factory;
import chapter04.practice02.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:36
 */
public class IDCardFactory extends Factory {
    private static int id = 1;
    private Map<Integer, IDCard> owners = new HashMap<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, id++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.put(idCard.getId(), idCard);
    }

    public Map getOwners() {
        return owners;
    }
}