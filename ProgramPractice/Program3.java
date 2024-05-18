package ProgramPractice;

public class Program3 {

	public static void main(String[] args) {  //FIBONNACCI SERIES
		
		int num=5;
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=1;i<=num;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
		

	}

}
