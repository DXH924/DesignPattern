package chapter07.practice01;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 使用纯文本编写文档
 * @date 2021-04-07 09:58
 */
public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===========================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("@" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("    *" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===========================\n");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}