package chapter16.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示仲裁者的接口
 * @date 2021-04-14 09:27
 */
public interface Mediator {
    void createColleagues(); // 用于生成Mediator要管理的组员，例如生成在对话框的按钮和输入文本框等组件
    void colleagueChanged(); //  被各个Colleague组员调用，向仲裁者进行报告
}
