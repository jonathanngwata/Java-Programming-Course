//Code that implements java do while loop
/*
 * code contains one main class which contains one main function
 * the main function contains 2 integer variables  start and stop, then do which implements a code and while loop which checks a condition on exit
 * the print line out puts numbers 0-4
 */

public class DoWhile{
	public static void main(String args[]){

		int start = 0;
		int stop = 4;

		do{

			System.out.println("Number on index " + start + " = " + start);
			
			start++;
		}while(start <= 4);


	}
}

