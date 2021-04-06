package chapter05.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-06 15:48
 */
public class Main {
    public static void main(String[] args) {
        TicketMaker tm1 = TicketMaker.getInstance();
        TicketMaker tm2 = TicketMaker.getInstance();
        System.out.println(tm1 == tm2);
        System.out.println(tm1.getNextTicketNumber());
        System.out.println(tm2.getNextTicketNumber());
    }
}