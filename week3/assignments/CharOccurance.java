package week3.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		char oc = 'e';
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]==oc) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}
}
