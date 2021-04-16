package chapter17.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: Subject表示观察对象，其中定义了注册观察者和删除观察者的方法
 * @date 2021-04-15 08:37
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer) {
        observers.add(observer); // 注册Observer
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() { // 向Observer发送通知
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o =(Observer)it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}