//2D array implementation with java


public class Array{

	public static void main(String args[]){

		int [][] numbers = {
			{1,2,3,4},
			{5,6,7,8}
		};

		for(int row = 0; row < numbers.length; row ++){

			for(int col = 0; col < numbers[row].length; col++){

				System.out.println(numbers[row][col]);
			}
		}
	}
}
