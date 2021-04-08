package chapter08.demo.listfactory;

import chapter08.demo.factory.Factory;
import chapter08.demo.factory.Link;
import chapter08.demo.factory.Page;
import chapter08.demo.factory.Tray;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-08 10:23
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}