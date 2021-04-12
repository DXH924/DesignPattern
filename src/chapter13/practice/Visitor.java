package chapter13.practice;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示访问者的抽象类，它访问文件和文件夹
 * @date 2021-04-12 09:45
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}