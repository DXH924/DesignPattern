package chapter04.practice02.idcard;

import chapter04.practice02.framework.Product;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 18:34
 */
public class IDCard extends Product {
    private int id;
    private String owner;
    IDCard(String owner, int id) {
        System.out.println("制作 " + owner + " 的ID卡，id = " + id);
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    public int getId() {
        return id;
    }
    public String getOwner() {
        return owner;
    }
}