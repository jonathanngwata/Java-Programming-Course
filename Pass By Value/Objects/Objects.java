//This java code demonstrate pass by value in objects

class Object{
	int value;
	public Object(int value){

		this.value = value;
	}
}

public class Objects{

	public static void main(String args []){


		Object obj = new Object(10);

		System.out.println("Original object value: " + obj.value);

		modifyObject(obj);

		System.out.println("After modifying the object: " +obj.value);
	}

	public static void modifyObject(Object obj){

		obj.value = 15; //affects original object value
		System.out.println("Inside the modifyObject function: " +obj.value);
	}
}
