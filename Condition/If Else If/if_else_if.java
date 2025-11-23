//Java if Else If implementation

/*Simple java code for checking user input and display appropriate message accordingly
 * Main class Condition with main method
 * inside main method declaration of one integer variable age
 * user input to check the input against several conditions
 * printline output the appropriate message accordingly
 */

import java.util.Scanner;
public class if_else_if{

	public static void main(String args[]){

		int user_age;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");

		user_age = sc.nextInt();

		if(user_age >= 18){

			if(user_age > 60){
			
				System.out.println("You have exceeded the retirement age");
			}
			else{
				System.out.println("You have not reeched retirement age");
			}
			


		}
		else
			System.out.println("You have not reached the legal employement age");



	}


}

