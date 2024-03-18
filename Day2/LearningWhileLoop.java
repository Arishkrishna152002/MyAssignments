/*
 package week2.Day2;

public class LearningWhileLoop {
	
	public int digit() {
		int n=324;
		  int sum = 0;
		  while(n!=0) {
			  sum=sum+n%10;
			  n=n/10;
		  }
		  return sum;
	}

	public static void main(String[] args) {
		
		LearningWhileLoop l = new LearningWhileLoop();
		System.out.println(l.digit());
	 
	  }

}*/
package week2.Day2;

public class LearningWhileLoop {
	
	public static void main(String[] args) {
		int num=324;
		int reminder;
		int sum=0;
		
		while(num>0) {
			reminder=num%10;   //324%10==4   //32%10==2  //3%10
			sum=sum+reminder; //4 +2 +3
			num=num/10; //32 , 3
		}
		System.out.println(sum);
	 
	  }

}
		
		
	 
	  

