//Java code to implement multi level inheritance

class Animal{

	void eats(){

		System.out.println("eat plants and animals");
	}

}

class Dog extends Animal{
	
	Dog(){

		super();
	}
	void barks(){
	
		System.out.println("violently");
	}


}

class Shepard extends Dog{

	Shepard(){
		
		super();
	}
	void purpose(){

		System.out.println("Security dog");
	}

}


public class MultiLevel{

	public static void main(String args []){
		Shepard lion = new Shepard();
		
		lion.purpose();
		lion.barks();
		lion.eats();

		 
	}
}
