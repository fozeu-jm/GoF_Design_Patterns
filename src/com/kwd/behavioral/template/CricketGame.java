package com.kwd.behavioral.template;

public class CricketGame extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game initialized ! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
