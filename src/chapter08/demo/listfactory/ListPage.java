package chapter08.demo.listfactory;

import chapter08.demo.factory.Item;
import chapter08.demo.factory.Page;

import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-08 10:50
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}