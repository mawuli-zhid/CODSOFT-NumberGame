
import java.util.Scanner;
public class NumbersGame {

	public static void main(String[] args) {
		
	 		
		double random = Math.round((Math.random()*100)); // generate random number
		int count = 0; // this is the attempt counter
		boolean gameOver = false; // this will be used to keep the game repeating until a win or loss
		int tries = 10; // number of attempts limited
		int min = 0; // minimum number to guess
		int max = 100; // max number to guess
		
	
		
	 do {
		 
		Scanner obj = new Scanner(System.in); //scope of the do this will be used to receive input
		System.out.println("Please guess a number between " + min + "-" + max); //prompts and gives instruction to a good user
		int guess = obj.nextInt(); // reads keyboard input, hopefully an integer
		
		
		if (guess > random) {
			System.out.println("Guess is too high");
			count++;
			System.out.println((tries- count) + " attempts remaining");
			
		} if (guess < random) {
			System.out.println("Guess is too low"); 
			count++;
			System.out.println((tries- count) + " attempts remaining");
		} else if (guess == random) {
			System.out.println("Congratulation you win!");
			
			double score = ( 100 - ((double) count/tries)* 100); //convert count into double to calculate score
			System.out.println("Score: " + score + "%");
			gameOver = true;
			
			
		}
			
	
		if(count ==10) {
			System.out.println("Too many attempts you lose!");
			gameOver = true;
		}
	
		
	} while (!gameOver);
		

	}

}



/*
 * No exception handling 
 */
