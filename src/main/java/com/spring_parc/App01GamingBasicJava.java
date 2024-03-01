package com.spring_parc;

import com.spring_parc.game.GameRunner;
import com.spring_parc.game.PackManGame;

public class App01GamingBasicJava {
    public static void main(String[] args){
//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        PackManGame game = new PackManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
