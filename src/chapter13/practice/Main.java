package chapter13.practice;

import chapter11.demo.FileTreatmentException;

import java.util.Iterator;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-12 10:08
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("dxh924.html", 300));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            hanako.add(new File("index.html", 350));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            FileFindVisitor ffv = new FileFindVisitor(".html");
            rootdir.accept(ffv);
            System.out.println("HTML files are:");
            Iterator it = ffv.getFoundFiles();
            while (it.hasNext()) {
                File file = (File)it.next();
                System.out.println(file);
            }
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

}