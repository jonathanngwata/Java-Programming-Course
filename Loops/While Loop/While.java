//while loop case in java

/*program starts with public main class While
 * inside main class there is main method for executing codes
 * inside the main method there are three integer variables start = for starting the iteration, end = for ending iteration and the print line followed by postfix increment
 * the code should print 6 lines from 0-5 vertically
 */
public class While{

	public static void main(String args[]){

	
		int start = 0;
		int end = 5;
		while(start <= end){

			System.out.println("Number on index " + start + " = " + start);
			start ++;
		}
	}
}
