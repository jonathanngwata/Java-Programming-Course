//App that checks largest number given 3 numbers

import java.util.Scanner;

public class Largest{
	
	public static void main(String args[]){

		int first_number;
		int second_number;
		int third_number;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		first_number = sc.nextInt();
	
		System.out.print("Enter second number: ");
		second_number = sc.nextInt();

		System.out.print("Enter third number: ");
		third_number = sc.nextInt();

		if(first_number > second_number){
			if(second_number > third_number)
				System.out.print("Largest number is " + first_number);
			}
		else if(third_number > second_number){
			if(second_number > first_number)
				System.out.print("Largest number is " + third_number);
		}
			
		else
			System.out.print("Largest number is " + second_number);


		
	}


}

