package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.Pacman;
//import com.example.learn_spring_framework.game.MarioGame;
//import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGaming01 {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new Pacman(); // 1. Object Creation
		var gameRunner = new GameRunner(game); //2. Object Creation and Wiring of Dependencies. Game is a dependency of Game runner class
		// here game as parameter is injected or wired in game runner class.
		gameRunner.run();
	}

}
