package ProgramPractice;

public class Program2 {

	public static void main(String[] args) {   //PALINDROME(numbers)
		
		
		int num=423;
		int reminder;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			reminder=num%10;
			sum=(sum*10)+reminder;
			num=num/10;
		}
		
		if(temp==num) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		System.out.println(sum);
 
	}

}
