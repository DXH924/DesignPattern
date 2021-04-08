package chapter08.demo.factory;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-08 10:16
 */
public class Main {
    public static void main(String[] args) {
        args = new String[] {
                "chapter08.demo.listfactory.ListFactory"
        };
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main chapter08.demo.listfactory.ListFactory");
            System.out.println("Example 2: java Main chapter08.demo.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Page page = factory.createPage("LinkPage", "大娱乐家");
        page.add(traynews);
        page.output();
    }
}