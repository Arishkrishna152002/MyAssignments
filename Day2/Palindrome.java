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
/*package week2.Day2;

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

}*/


package week2.Day2;

public class Palindrome {

	public static void main(String[] args) {
		String name= "malayalam";
		String temp="";
		char[] charArray = name.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			temp=temp+charArray[i];
			
			
		}
		if(temp.equals(name)) {
			System.out.println("The given word is palindrome");
		}else {
			System.out.println("the given word is not palindrome");
		}
System.out.println(temp);
	}

}

