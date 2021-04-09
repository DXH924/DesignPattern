package chapter09.practice;

import java.io.*;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-09 11:21
 */
public class TxtDisplayImpl extends DisplayImpl {
    private String filename;
    private InputStreamReader reader;
    private BufferedReader bufferedReader;
    private File file;

    public TxtDisplayImpl(String filename) {
        this.filename = filename;
        this.file = new File(filename);
    }


    @Override
    public void rawOpen() {
        System.out.println("opening file...");
        try {
            if (file.isFile() && file.exists()) {
                reader = new InputStreamReader(new FileInputStream(file), "GBK");
                bufferedReader = new BufferedReader(reader);
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("closing file...");
        try {
            bufferedReader.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}