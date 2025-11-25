//App to take user score and displayed their grades

import java.util.Scanner;
public class Grade{

	public static void main(String[] args){

		int score;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your score: ");

		score = sc.nextInt();

		if(score > 100){
			
			System.out.print("Score can not be greater than 100");
		}

		else if(score >= 70 && score <= 100){

			if(score >= 70 && score < 80)
				System.out.println("Your grade is B");
			else
				System.out.println("Your grade is A");
		}

		else if(score >= 50 && score < 70){

			if(score >= 50 && score < 60)
				System.out.print("Your grade is D");
			else
				System.out.print("Your grade is C");
		}
		else if(score >= 0 && score <50)
			System.out.print("Your score is F");

		else
			System.out.print("Enter score 0-100");




	}

}

