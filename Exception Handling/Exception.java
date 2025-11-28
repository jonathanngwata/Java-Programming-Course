/**
 * This java code demonstrate how to handle exceptions
 * Exception handling has try(code causing exception),catch(code handling exception), finally(code which runs regardless) 
 */

import java.util.Scanner;

public class Exception{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number? ");


		try{

			int number = sc.nextInt();
			int result = 10 / number; // this may throw an exception

			System.out.println("Result " + result);
		} catch (ArithmeticException e) {

			System.out.println("Error: cannot divide by 0");
		} catch (java.util.InputMismatchException e) {

			System.out.println("Errot: enter a valid integer");
		} finally {

			sc.close(); //runs regardless of exception
			System.out.println("Scanner closed");
		}


	}


}

