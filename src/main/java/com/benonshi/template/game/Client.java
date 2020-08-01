package com.benonshi.template.game;

/**
 * @author BenOniShi
 * @date 2020/8/1 23:37
 */
public class Client {
    public static void main(String[] args) {
        BasketBallGame basketBallGame = new BasketBallGame();
        basketBallGame.template();
        FootBallGame footBallGame = new FootBallGame();
        footBallGame.template();
    }
}
