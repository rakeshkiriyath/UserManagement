package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperMarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		MarioGame game = new MarioGame();
		
		GameRunner runner = new GameRunner(game);
		
		runner.runGame();
		
		SuperMarioGame superGame = new SuperMarioGame();
		
		GameRunner runner1 = new GameRunner(superGame);
		
		runner.runGame();
		
		runner1.runSuperGame();
		
	}

}
