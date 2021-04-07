package chapter07.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-07 10:07
 */
public class Main {
    public static void main(String[] args) {
        args = new String[] {
                "html"
        };
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + " file has been built");
        }
    }

    public static void usage() {
        System.out.println("Usage : java Main plain to make text file");
        System.out.println("Usage : java Main html to make html file");
    }
}