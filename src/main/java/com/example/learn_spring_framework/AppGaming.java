package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.Pacman;
//import com.example.learn_spring_framework.game.MarioGame;
//import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGaming {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new Pacman();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
