//Java code that implements a ternary operatory
//
import java.util.Scanner;
public class Ternary{
	public static void main(String args[]){


		int age;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age: ");

		age = sc.nextInt();

		String message = (age >= 16) ? "Your an adult": "Your a minor";

		System.out.println(message);
	}


}

