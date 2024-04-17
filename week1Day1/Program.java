package week1Day1;

public class Program {
	
	public int square(int a){
		int area=a*a;
		return area;
	}
	
	
	@SuppressWarnings("unused")
	public double circle(int r) {
		double pie=3.14;
		double area= 3.14*(r*r);
		return area;
	}
	
	
		
	

	public static void main(String[] args) {
		Program obj1=new Program();
		System.out.println(obj1.square(4)-obj1.circle(7));
		
	}

}
