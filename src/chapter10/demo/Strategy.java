package chapter10.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 定义猜拳策略的抽象方法接口
 * @date 2021-04-10 18:53
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}