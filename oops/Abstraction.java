package oops;

abstract class AbstractionMethod {
	abstract void animal();
}

class Dog extends AbstractionMethod {
	public void animal() {
		System.out.println("Dog sounds like woof");
	}
}

class Cat extends AbstractionMethod {
	public void animal() {
		System.out.println("Cat sounds like meow ");
	}
}

public class Abstraction {
	public static void main(String[] args) {

		Dog obj1 = new Dog();
		Cat obj2 = new Cat();
		obj1.animal();
		obj2.animal();

	}
}
