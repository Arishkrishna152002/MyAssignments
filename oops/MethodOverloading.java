package oops;

public class MethodOverloading {
	
	public  int max(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	
	public static double max(double a,double b) {
		return a>b?a:b;
	}
	
	public static char max(char a,char b) {
		return a>b?a:b;
	}
	
	
	public static void main(String[] args) {
	//	System.out.println(max(2, 4));     /// if we did'nt put static in method means we want create object to call that method.
		MethodOverloading obj1 =new MethodOverloading();
		System.out.println(max(4.5,5.5));
		System.out.println(max('a','z'));
		System.out.println(obj1.max(2, 4));
		
		
		
		
		
	}

}



/*package oops;
public class MethodOverloading {
	
	public static int max(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	
	public static int max(int a,int b, int c) {
		int sum;
		sum=a+b+c;
		return sum;
	}
	
	public static double max(double a,double b) {
		double sum;
		sum=a*b;
		return sum;
	}
	
	public static float max(float a,float b) {
		float sum;
		sum=a*b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(max(2, 4));
		System.out.println(max(2,4,6));
		System.out.println(max(2.4f,4.2f));
		System.out.println(max(2.2,4.4));
		
		
	}

}*/





