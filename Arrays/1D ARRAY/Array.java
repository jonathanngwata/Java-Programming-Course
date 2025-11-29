//Java code to implement an array

public class Array{

	public static void main(String args[]){

		int [] numbers = {2,4,5,8};
		int sum = 0;

		for( int i = 0; i < numbers.length; i++){

			sum = sum + numbers[i];
			
		}
		System.out.println("Sum = " + sum);

	}


}

