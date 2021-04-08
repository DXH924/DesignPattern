package chapter08.demo.factory;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 抽象地表示HTML超链接的类
 * @date 2021-04-08 10:01
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}