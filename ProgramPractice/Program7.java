package ProgramPractice;

public class Program7 {

	public static void main(String[] args) {  //OCCURANCE
		
	 String name="testleaf";
	 int count=0;
	 
	 for(int i=0;i<name.length();i++) {
		 char c=name.charAt(i);
		 if(c=='e') {
			 count++;
			 
		 }
		 
	 }
	 System.out.println(count);
			 
		

	}

}
