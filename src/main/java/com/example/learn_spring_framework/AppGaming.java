package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGaming {

	public static void main(String[] args) {
//		var MarioGame = new MarioGame();
		var SuperContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(SuperContraGame);
		gameRunner.run();
	}

}
