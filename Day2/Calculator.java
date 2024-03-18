package week2.Day2;

public class Calculator {
	
	public int add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
		
	}
	
	private int sub(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
		return sub;
		
	}
	
	protected int multiplication(int a, int b) {
		int mul_total = a*b;
		System.out.println(mul_total);
		return mul_total;
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(9, 7);
		cal.sub(10, 5);
		cal.multiplication(97,9);
		
	}

}
