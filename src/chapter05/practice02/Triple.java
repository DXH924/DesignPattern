package chapter05.practice02;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-06 15:50
 */
public class Triple {
    private static Triple triple1 = new Triple();
    private static Triple triple2 = new Triple();
    private static Triple triple3 = new Triple();


    public static Triple getInstance(int i) {
        switch (i) {
            case 0:
                return triple1;
            case 1:
                return triple2;
            case 2:
                return triple3;
            default:
                return null;
        }
    }
}