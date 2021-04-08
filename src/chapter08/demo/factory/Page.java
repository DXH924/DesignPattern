package chapter08.demo.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 抽象地表示HTML页面的类
 * 如果将Link和Tray比喻成抽象的零件，那么Page类就是抽象的产品
 * @date 2021-04-08 10:05
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList<>();
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}