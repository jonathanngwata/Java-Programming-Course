// Java code to implement single inheritance


class Animal{

	void eat(){

	
		System.out.println("eats food");
	}
}
class Dog extends Animal{
	Dog(){
	
		super();
	}

	
	void bark(){

		System.out.println("barks");
	}

}

public class Single{

	public static void main(String args []){

		Dog lala = new Dog();

		lala.bark();
		lala.eat();
	}
}

