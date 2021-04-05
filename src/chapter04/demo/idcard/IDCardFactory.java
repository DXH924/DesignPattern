package chapter04.demo.idcard;

import chapter04.demo.framework.Factory;
import chapter04.demo.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:36
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}