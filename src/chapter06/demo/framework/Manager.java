package chapter06.demo.framework;

import java.util.HashMap;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-06 16:21
 */
public class Manager {
    private HashMap showcase = new HashMap<>();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}