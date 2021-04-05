package chapter04.demo.idcard;

import chapter04.demo.framework.Product;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:34
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("制作 " + owner + " 的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}