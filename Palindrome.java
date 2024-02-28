/*package week2.Day2;

public class Palindrome {

	public static void main(String[] args) {
////////////SUM OF DIGITS/////////////////////		
		int num=423;
		int reminder;
		int sum=0;
		
		while (num>0) {
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}*/




////////////PROGRAM FOR PALINDROME////////////////
package week2.Day2;

public class Palindrome {

	public static void main(String[] args) {

		int num=423;
		int reminder;
		int sum=0;
		int temp=num;
		
		while (num>0) {
			reminder=num%10;
			sum=(sum*10)+reminder;
			//1 //sum=(0*10)+3  =3
			//2 //sum=(3*10)+2  =32
			//3 //sum=(32*10)+4 =324
			num=num/10;
			
		}
		if (temp==num) {
			System.out.println("The given number is palindrome");
			
		}else {
			System.out.println("The given number is not a palindrome");
		}
		System.out.println(sum);
	}

}