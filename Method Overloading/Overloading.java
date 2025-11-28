//Java code to implement method overloading

class MethodOverloading{
	
	int add(int a , int b){
		return a + b;
	}
	double add(double a, double b){

		return a + b;
	}
} 

public class Overloading{


	public static void main(String args []){

		MethodOverloading calculator = new MethodOverloading();

		System.out.println("Sum of integers = " + calculator.add(7,8)); //calls int method
		System.out.println("Sum of doubles  = " + calculator.add(4.6,7.9)); // calls double method



	}

}
