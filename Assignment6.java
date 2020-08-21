// This code will create a command line calculator

package clicalc;

import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
		
		char chosenOp = 'a';
		while (chosenOp != 'e'){
			
			Scanner input = new Scanner(System.in);
			int answer = 0;
			
			System.out.println("Welcome to the CLI Calculator");
			System.out.println("Operations:");
			System.out.println("a: Addition");
			System.out.println("s: Subtraction");
			System.out.println("m: Multiplication");
			System.out.println("d: Division");
			System.out.println("e: Exit");
			System.out.println();
			System.out.println("Choose your operation: ");
			
			chosenOp = input.next().charAt(0);
			chosenOp = Character.toLowerCase(chosenOp)
			
			if (chosenOp == 'a'){
				System.out.println("First Number: ");
				int num1 = input.nextInt();
				System.out.println("Second Number: ");
				int num2 = input.nextInt();
				answer = num1 + num2;
				System.out.println("Result: " + answer);
			}
			else if (chosenOp == 's'){
				System.out.println("First Number: ");
				int num1 = input.nextInt();
				System.out.println("Second Number: ");
				int num2 = input.nextInt();
				answer = num1 - num2;
				System.out.println("Result: " + answer);
					}
			else if (chosenOp == 'm'){
				System.out.println("First Number: ");
				int num1 = input.nextInt();
				System.out.println("Second Number: ");
				int num2 = input.nextInt();
				answer = num1 * num2;
				System.out.println("Result: " + answer);
			}
			else if (chosenOp == 'd'){	
				System.out.println("First Number: ");
				int num1 = input.nextInt();
				System.out.println("Second Number: ");
				int num2 = input.nextInt();
				if (num2 == 0){
					System.out.println("Result: Cannot divide by 0.");
				}
				else{
					double num2div = num2; // convert num2 to double in order to get decimal values for double
					double answerDiv = num1 / num2div;
					// display answer to division problem with 2 decimals		
				    System.out.println("Result: "); 
				    System.out.printf("%.2f", answerDiv); 
				    System.out.println();
				}
			}	
			else if (chosenOp == 'e'){
				System.out.println("Goodbye!");
			}
			else{
				System.out.println("You did not enter a valid operation. Please try again");
			}
			System.out.println("--------------------------------");
			System.out.println();
		}
	}
}