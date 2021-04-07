package chapter07.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 使用Builder中声明的方法来编写文档
 * @date 2021-04-07 09:55
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
}