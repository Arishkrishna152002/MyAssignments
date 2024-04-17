package oops;

public class Child extends Parent {
	
	public void name() {
		System.out.println("My name is Arish Krishna");
	}
	
	public void age() {
		System.out.println("My age is 21");
	}
	
	public void education() {
		System.out.println("I am a ECE Graduate Person");
	}

	public static void main(String[] args) {
		Child obj2= new Child();
		obj2.name();
		obj2.age();
		obj2.education();
		obj2.bike();
		obj2.car();

	}

}

       