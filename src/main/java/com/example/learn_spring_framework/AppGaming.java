package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
//import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGaming {

	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
