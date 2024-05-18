package week2.Day2;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] num = {2,4,3,1,2,4};

		Arrays.sort(num);

		for (int i = 0; i <= num.length-1; i++) {

			for (int j = i + 1; j <= num.length-1; j++) {

				if (num[i]== num[j]) {
					System.out.println(num[i]);
				}
			}

		}

	}

}
