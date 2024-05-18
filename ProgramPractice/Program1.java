package ProgramPractice;

public class Program1 {

	public static void main(String[] args) {    //SUM OF DIGITS
		int num=423;
		int reminder;
		int sum=0;
		
		while(num>0) {
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		System.out.println(sum);
		

	}

}
