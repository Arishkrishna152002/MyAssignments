/*package week2.Day2;

import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
		Scanner val= new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int a= val.nextInt();
		
		if(a>=18) {
			System.out.println("eligible to vote");
			
		}else {
			System.out.println("not eligible to vote");
		}
		

	}

}*/
/*package week2.Day2;
public class SelectionStatements {

	public static void main(String[] args) {
		int num1=20;
		int num2=-34;
		
		
		if(num1>0 || num2>0) {
			System.out.println("Number is positive");
			
		}else if(num1<0 || num2<0) {
			System.out.println("Number is negative");
		}
		
		

	}

}*/
/*package week2.Day2;
public class SelectionStatements {
	int num1=20;
	int num2=-34;
	
	public void positiveOrNegative() {
		if (num1 > 0) {
			System.out.println("the number is positive");
			
		} else {
			System.out.println("the number is negative");

		}
	}
		
	public void negativeOrPositive() {	
		if (num2<0) {
			System.out.println("the number is negative");
			
		} else {
			System.out.println("the number is positive");

		} 
			
		
	}

	public static void main(String[] args) {
		SelectionStatements obj1= new SelectionStatements();
		obj1.positiveOrNegative();
		obj1.negativeOrPositive();
		
		

	}

}*/
/////////////IF ELSE IF CONDITION////////////////
package week2.Day2;

public class SelectionStatements {

	public static void main(String[] args) {
		int num = 80;

		if (num >= 90) {
			System.out.println("Grade O");

		} else if (num > 80) {
			System.out.println("Grade A+");

		} else if (num > 70) {
			System.out.println("Grade A");
		} else if (num > 60) {
			System.out.println("Grade B+");
		} else if (num > 50) {
			System.out.println("Grade B");
		} else if (num > 40) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
	}

}
