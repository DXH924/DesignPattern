package chapter12.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-11 16:00
 */
public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }
    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}