package chapter16.demo;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description:
 * @date 2021-04-14 09:35
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) { // Mediator下达启用/禁用的指示
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) { // 当文字发生变化时通知Mediator
        mediator.colleagueChanged();
    }
}