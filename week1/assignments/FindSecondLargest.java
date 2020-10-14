package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};
		Arrays.sort(arr1);
		System.out.println(arr1[arr1.length-2]);

	}

}
