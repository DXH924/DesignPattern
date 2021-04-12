package chapter13.practice;

import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-12 11:23
 */
public class SizeVisitor extends Visitor {
    private int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}