package chapter13.practice;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示文件的类
 * @date 2021-04-12 09:53
 */
public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}