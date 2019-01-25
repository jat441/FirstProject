package app;

import java.util.Scanner;

public abstract class Adventure {
	
	
	public static void main(String[] args) {
		System.out.println("You are in an abyss of dark foggy clouds of the swamp that obstruct your vision.");
		
		Scanner swampWalker = new Scanner(System.in);
		
		System.out.println("What is your name...?: ");
		String name = swampWalker.nextLine();
		
		System.out.println("Welcome " + name + " Do you want to play a game...(y/n)?");
		String startGame = swampWalker.nextLine();
		
		if (startGame.equals("y")) {
			
			App.start();
		}
		else {
			App.quit();
		}
		
			
	}
}


