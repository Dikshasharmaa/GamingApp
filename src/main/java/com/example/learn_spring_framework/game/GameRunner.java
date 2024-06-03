package com.example.learn_spring_framework.game;

public class GameRunner {
//	MarioGame game;
	SuperContraGame game1;
	public GameRunner(SuperContraGame game1) {
		this.game1 = game1;
	}

	public void run() {
		System.out.println("Running game"+ game1);
		game1.up();
		game1.down();
		game1.left();
		game1.right();
	}

}
