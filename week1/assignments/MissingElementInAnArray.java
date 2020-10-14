package week1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,7,6,8};
		int j = 1;
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			if (j != arr1[i]) {
				System.out.println(j);
				break;
			}
			j++;
		}		
	}

}
