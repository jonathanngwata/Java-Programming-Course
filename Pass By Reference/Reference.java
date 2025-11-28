// Java code to demonstrate pass by reference using objects (arrays)
 

public class Reference{

	public static void main(String args []){
	
		int [] numbers = {1,2,3};

		System.out.println("Original array = " + java.util.Arrays.toString(numbers));

		modifyArray(numbers);
		System.out.println("After modifying array: " + java.util.Arrays.toString(numbers));



	}

	public static void modifyArray(int [] arr){

		arr[0] = 99; // This affects original array

		System.out.println("Inside modfiyArray: " + java.util.Arrays.toString(arr));
	}
}
