//Jave code that implements a switch by taking user input number 1-12 and display the equivalent month name
/*Progran starts with Switch main class which contains one main method 
 * one integer variable to take number 1-12 and prints apropriate month name
 */

import java.util.Scanner;

public class Switch{

	public static void main(String args[]){


		int month;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number from 1-12: ");
		
		month = sc.nextInt();


		switch(month){

			case 1:
				if(month == 1)
					System.out.println("Month is January");
				break;

			case 2:

				if(month == 2)
					System.out.println("Month is February");
				break;

			case 3:
				if(month == 3)
					System.out.println("Month is March");
				break;

			case 4: 
				if(month == 4)
					System.out.println("Month is April");
				break;

			case 5: 
				if(month == 5)
					System.out.println("Month is May");
				break;

			case 6:
				if(month == 6)
					System.out.println("Month is June");
				break;

			case 7:
				if(month == 7)
					System.out.println("MOnth is July");
				break;
			
			case 8: 
				if(month == 8)
					System.out.println("Month is August");
				break;

			case 9:
				if(month == 9)
					System.out.println("Month is September");
				break;

			case 10:
				if(month == 10)
					System.out.println("Month is October");
				break;

			case 11:
				if(month == 11)
					System.out.println("Month is November");
				break;

			case 12:
				if(month == 12)
					System.out.println("Month is December");
				break;

			default:
				System.out.println("Enter numbers 1-12");
				break;

		}

	}

}

