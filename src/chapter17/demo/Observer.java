package chapter17.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示观察者的接口，负责接收来自Subject角色的状态变化的通知
 * @date 2021-04-15 08:36
 */
public interface Observer {
    void update(NumberGenerator generator);
}