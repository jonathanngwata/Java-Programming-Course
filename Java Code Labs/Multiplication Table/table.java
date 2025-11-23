//App that calculates multiplication table of 2
import java.util.Scanner;

public class table{

	public static void main(String args[]){
		int number;
		int multiplication;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number a positive integer ");

		number = sc.nextInt();

		for(int i = 1; i<=12; i++){
			multiplication = i * number;
			System.out.println(i+ "X" + number + " = " + multiplication);
			
			
		}



		
	}


}

