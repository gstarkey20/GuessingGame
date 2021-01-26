/*
 * @author Garrett Starkey
 *
 * Java program that allows the user to guess a randomly generated number by the computer. Different messages will be displayed on the console 
 * depending on if the guessed number is higher or lower than the generated number.
*/

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
		int rightNumber;
			rightNumber = (int) (Math.random() * 999);
			System.out.println("The random number is: " + rightNumber); // debug statement to see if it prints num, remove later**
			
			// asking for user input
			Scanner input = new Scanner(System.in);
			int guess;

			// do while the guess is incorrect to keep looping
			do {
				System.out.println("Enter your best guess: ");
				guess = input.nextInt();
				System.out.println("Your guess is: " + guess);
			

				// checking for conditions
				if (guess == rightNumber) {
					System.out.println("That is the correct number!!!!");				
				} else if (guess < rightNumber) {
         			System.out.println("Your guess is to low. Try again!");
				} else if (guess > rightNumber) {
					System.out.println("Your guess is to high. Try again!");
				}
			
			} while (guess != rightNumber);
    }
}
