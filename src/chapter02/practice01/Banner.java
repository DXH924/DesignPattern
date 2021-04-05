package chapter02.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 实际情况
 * @date 2021-04-05 11:32
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}