package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] num= {4,5,6,7,2,1,5,10};
		
		int len=num.length;
		System.out.println("Length"+len);
		Arrays.sort(num);
		System.out.println(num[0]);
		System.out.println("Array length"+len);
		for (int i =0; i< len; i++) {
			System.out.println(num[i]);
		}

	}

}
