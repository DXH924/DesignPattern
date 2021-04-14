package chapter16.demo;

import java.awt.*;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-14 09:33
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) { // 保存Mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) { // Mediator下达启用/禁用的指示
        setEnabled(enabled);
    }
}