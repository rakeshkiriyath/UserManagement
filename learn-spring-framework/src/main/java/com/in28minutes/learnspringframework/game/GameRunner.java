package com.in28minutes.learnspringframework.game;

public class GameRunner {
	/*
	 * We don't required these, as we have an interface. We can define GammingConsole interface and create 
	 * object of its implementation class: Mario and SuperMario
	 * 
	 * private GamingConsole game; 
	 * 
	 * private SuperMarioGame superGame;
	 
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public GameRunner(SuperMarioGame superGame) {
		this.superGame = superGame;
	}
	*/
	
	private GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}

	public void runGame() {
		this.gamingConsole.up();
		this.gamingConsole.down();
		this.gamingConsole.right();
		this.gamingConsole.left();
	}


}
