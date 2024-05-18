package ProgramPractice;

import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {  //DUPLICATE NUMBERS
		int[] num= {2,5,6,3,2,7,8};
		Arrays.sort(num);
		
		for(int i=0;i<=num.length-1;i++) {
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}

	}

}
