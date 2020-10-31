package week3.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {


		String text = "Tes12Le79af65";
		int sum = 0;
		char[] ch = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				int num = Character.getNumericValue(ch[i]);
				sum = sum + num;
			}
		}
		
		System.out.println(sum);
		

	}

}
