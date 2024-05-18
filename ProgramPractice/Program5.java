package ProgramPractice;

public class Program5 {

	public static void main(String[] args) {  //PALINDROME(words)
		
		String name="malayalam";
		String temp="";
		
		char[] charArray =name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			temp=temp+charArray[i];
		}
		
		if(temp.equals(name)){
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		System.out.println(temp);
		
		

	}

}
