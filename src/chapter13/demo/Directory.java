package chapter13.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示文件夹的类
 * @date 2021-04-12 09:58
 */
public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
       int size = 0;
       Iterator it = dir.iterator();
       while (it.hasNext()) {
           Entry entry = (Entry)it.next();
           size += entry.getSize();
       }
       return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}