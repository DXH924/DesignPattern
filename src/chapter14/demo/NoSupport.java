package chapter14.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-13 19:25
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}