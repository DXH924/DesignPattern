package chapter02.demo01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 适配器
 * @date 2021-04-05 11:35
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}