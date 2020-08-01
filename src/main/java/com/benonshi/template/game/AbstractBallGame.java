package com.benonshi.template.game;

/**
 * @author BenOniShi
 * @date 2020/8/1 23:32
 */
public abstract class AbstractBallGame {

    protected void start() {
        System.out.println("开始");
    }

    private void end() {
        System.out.println("结束");
    }


    protected abstract void play();


    protected final void template() {
        this.start();
        this.play();
        this.end();
    }

}
