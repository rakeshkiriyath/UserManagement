package com.in28minutes.learnspringframework.game;

public class GameRunner {

	private MarioGame game;
	
	private SuperMarioGame superGame;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public GameRunner(SuperMarioGame superGame) {
		this.superGame = superGame;
	}

	public void runGame() {
		this.game.up();
		this.game.down();
		this.game.right();
		this.game.left();
	}

	public void runSuperGame() {
		this.superGame.up();
		this.superGame.down();
		this.superGame.right();
		this.superGame.left();
	}

}
