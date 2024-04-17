package oops;

public class MethodOverRiding extends MethodOverloading {
	
	public  int max(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		MethodOverRiding obj2= new MethodOverRiding();
		System.out.println(obj2.max(3, 13));
		
		
	}

}
