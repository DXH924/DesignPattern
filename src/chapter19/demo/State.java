package chapter19.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-18 19:46
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}