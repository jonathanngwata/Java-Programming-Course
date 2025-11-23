//App that iterates through 1-20 and skips 13 and 15

public class Continu{

	public static void main(String args[]){

		for(int i = 1; i<=20;i++){

			if(i == 13 || i == 15)
				continue;
		
		System.out.print(i);
		}

	}


}

