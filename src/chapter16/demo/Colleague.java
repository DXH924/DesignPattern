package chapter16.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示向仲裁者进行报告的组员的接口
 * @date 2021-04-14 09:29
 */
public interface Colleague {
    void setMediator(Mediator mediator); // 告知组员“我是仲裁者，有事请报告我”
    void setColleagueEnabled(boolean enabled); // 告知组员仲裁者所下达的指示
}
