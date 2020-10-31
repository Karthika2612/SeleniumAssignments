package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		String text1 = "stops";
		String text2 = "potss";
		int count = 0;
		if (text1.length()==text2.length()) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for (int i = 0; i < ch1.length; i++) {
					if (ch1[i]==ch2[i]) {
						count++;
					}
				
			}
			
		}
		if (count == text2.length()) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not an anagram");
	}

}
