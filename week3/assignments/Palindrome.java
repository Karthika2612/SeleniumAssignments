package week3.assignments;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam";
		String rev = "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			
			String rev1 = rev+""+str.charAt(i);
			rev=rev1;
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("It is a palindrome"); 
		}
		else
			System.out.println("Not a palindrome");
		
		
	}

}
