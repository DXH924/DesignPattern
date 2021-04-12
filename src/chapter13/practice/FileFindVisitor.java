package chapter13.practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-12 11:06
 */
public class FileFindVisitor extends Visitor {
    private String suffix;
    ArrayList dir = new ArrayList<>();
    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    public Iterator getFoundFiles() {
        return dir.iterator();
    }


    @Override
    public void visit(File file) {
        String filename = file.getName();
        if (filename.endsWith(suffix)) {
            dir.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}