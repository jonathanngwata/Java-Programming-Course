//Java code to implement pass by value

public class Value{

	public static void value(int original_value){

		original_value = 34;

		System.out.println("Original Value = " + original_value);
	}

	public static void main(String args[]){

		int test_value = 33;

		System.out.println("Before method call, test value " + test_value);

		value(test_value);

		System.out.println("After method call, test value =" + test_value);



	}



}

