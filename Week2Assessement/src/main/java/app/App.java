package app;

import java.util.Scanner;

public class App {
	
	
	static void start() {
		int distanceTravelled = 0;
				
		boolean movesLeft = true;
		
		
		do{	
		
			
		Scanner chooseDirection = new Scanner(System.in);
		System.out.println("Which way do go you want to go (north, south, east, west?: )");
		String direction = chooseDirection.nextLine();
		
				
		if (direction.equals("north")) {
			
			Scanner moveNorth = new Scanner(System.in);
			System.out.println("How many metres?: ");
			int north = moveNorth.nextInt();
			
			System.out.println("You have moved " + north + " metres North.");		
		}
		
		else if (direction.equals("south")) {
			Scanner moveSouth = new Scanner(System.in);
			System.out.println("How many metres?: ");
			int south = moveSouth.nextInt();
			
			System.out.println("You have moved " + south + " metres South.");
		}
		
		else if (direction.equals("east")) {
			Scanner moveEast = new Scanner(System.in);
			System.out.println("How many metres?: ");
			int east = moveEast.nextInt();
		
			System.out.println("You have moved " + east + " metres East.");
		}
		
		else if (direction.equals("west")) {
			Scanner moveWest = new Scanner(System.in);
			System.out.println("How many metres?: ");
			int west = moveWest.nextInt();
			
			System.out.println("You have moved " + west + " metres West.");
		}
		
		else {
			System.out.println("I'm sorry, not a valid repsonse.");
			
			}
		
		if (distanceTravelled > 100)
			movesLeft = false;
	
		
		} while (movesLeft);
		
	}
		
		
		
		
		 
		 
		
							
		
		//System.out.print("You have travelled" + distanceTravelled + " so far.");
				

		

	

	
		






	static void quit() {
		System.out.println("Thanks for playing, goodbye.");
		
	}

}


