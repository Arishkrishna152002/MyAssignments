package week2.Day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=29;
		boolean flag=false;
		
		for(int i=2;i<num/2;++i) {
			if(i%2==1) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("not a prime number");
		}else {
			System.out.println("its a prime number");
			}
		}

	}


