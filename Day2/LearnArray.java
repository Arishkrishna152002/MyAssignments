/*package week2.Day2;


public class LearnArray {

	public static void main(String[] args) {
		
		// syntax for array--->  dataType variableName[] ={1,2,3,4,5};
		// eg: int mark[]={1,2,3,4,5};
		
		int[] mark= {11,12,13,14,15};
		
		System.out.println(mark[0]);
		System.out.println(mark[1]);
		System.out.println(mark[2]);
		System.out.println(mark[3]);
		System.out.println(mark[4]);
		

	}

}*/

/*package week2.Day2;

public class LearnArray {

	public static void main(String[] args) {

		// syntax for array---> dataType variableName[] ={1,2,3,4,5};
		// eg: int mark[]={1,2,3,4,5};
//Array using for loop//
		int[] mark = { 11, 12, 13, 14, 15 };

		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);

		}
	}
}*/

package week2.Day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		// syntax for array---> dataType variableName[] ={1,2,3,4,5};
		// eg: int mark[]={1,2,3,4,5};
//Array using for loop//
		int[] mark = { 2,4,6,4,1,3 };
		
		Arrays.sort(mark);///{1,2,3,4,4,6}
		for (int i = 0; i < mark.length; i++) {
			for(int j=i+1; j<mark.length; j++) {
				if(mark[i]==mark[j]) {
					System.out.println(mark[i]);
					
				}
			}
			
			

		}
	}
}








