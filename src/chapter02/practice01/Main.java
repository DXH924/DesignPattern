package chapter02.practice01;


/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 用PrintBanner类型的变量保存PrintBanner实例
 * @date 2021-04-05 11:37
 */
public class Main {
    public static void main(String[] args) {
        // Print p = new PrintBanner("Hello");
        PrintBanner p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}