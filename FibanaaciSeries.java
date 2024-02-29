package week2.Day2;

public class FibanaaciSeries {
	public int fibanaaci(int num) {
	
		for(int i=0;i<num;i++) {
			if(num<=1) {
			return num;	
			}else {
				return(fibanaaci(num-1) + fibanaaci(num-2));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		FibanaaciSeries obj1 =new FibanaaciSeries();
		
		int num=10;
		System.out.println(obj1.fibanaaci(num));
		 
	

	}

}
