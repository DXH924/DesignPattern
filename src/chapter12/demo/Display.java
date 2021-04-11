package chapter12.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 显示多行字符串的抽象类
 * @date 2021-04-11 15:56
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}