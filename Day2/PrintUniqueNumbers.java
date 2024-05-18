package week2.Day2;

import java.util.Arrays;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		int[] num = {2,3,5,6,4,1,2,4};
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]!=num[j]) {
					System.out.println(num[i]);
				}
			}
	
		}
 
	}

}
