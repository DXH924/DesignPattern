package chapter13.practice;

import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: Visitor的子类，显示文件和文件夹一览
 * @date 2021-04-12 10:06
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}