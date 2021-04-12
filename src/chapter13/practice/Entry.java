package chapter13.practice;

import chapter11.demo.FileTreatmentException;

import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: File和Directory的父类，是抽象类，实现 Element接口
 * @date 2021-04-12 09:47
 */
public abstract class Entry implements Element {
    public abstract String getName(); // 获取名字
    public abstract int getSize();   // 获取大小
    public Entry add(Entry entry) throws FileTreatmentException { // 增加目录条目
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException { // 生成Iterator
        throw new FileTreatmentException();
    }
    public String toString(){ // 显示字符串
        return getName() + "(" + getSize() + ")";
    }
}