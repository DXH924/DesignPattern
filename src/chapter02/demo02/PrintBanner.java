package chapter02.demo02;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-05 11:41
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}