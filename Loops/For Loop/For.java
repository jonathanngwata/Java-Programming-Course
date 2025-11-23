//Simple Java for Loop case

/*Program starts with main class For
 * inside main class there is main method to execute codes with integer variable stop
 * insed main method there is for Loop with integer variables start , condition and postfix decrement
 * the print line inside the for Loops prints numbers 5-0
 */

public class For{

	public static void main(String args[]){

		int stop = 0;

		for(int start = 5; start >= 0; start --){

			System.out.println("Number on index " + start + " = " + start ); 
		}

	}

}

