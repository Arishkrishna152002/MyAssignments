package week2.Day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 232;
		int reminder;
		int sum=0;
		int temp = num;
		
		while(num>0) {
			reminder=num%10;
			sum=(int) (sum +Math.pow(reminder,3));
			num=num/10;
			
		}
		
		if(temp==num) {
			System.out.println("The given number is Amstrong Number");
		}else {
			System.out.println("The given number is not a Amstrong Number");
		}
		System.out.println(sum);
				

	}

}
