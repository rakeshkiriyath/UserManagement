package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperMarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		MarioGame marioGame = new MarioGame();
		
		SuperMarioGame superMarioGame = new SuperMarioGame();
		/*
		 * GameRunner constructor can take marioGame or superMarioGame
		 */
		GameRunner runner = new GameRunner(superMarioGame);
		
		runner.runGame();
	}

}
