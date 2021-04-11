package chapter12.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-11 16:01
 */
public abstract class Border extends Display{
    protected Display display; // 表示被装饰物
    protected Border(Display display) { // 在生成实例时通过参数指定被装饰物
        this.display = display;
    }
}