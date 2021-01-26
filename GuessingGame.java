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
	

    }
}
