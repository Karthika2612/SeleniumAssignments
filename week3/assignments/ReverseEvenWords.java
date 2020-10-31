package week3.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester"; 
		String[] wordsOfArray = test.split(" ");
		for (int i = 0; i < wordsOfArray.length; i++) {
			
			if (!(i%2==0)) {
				char[] ch = wordsOfArray[i].toCharArray();
				for (int j =ch.length-1; j >=0 ; j--) {
					System.out.print(ch[j]);
				}
				System.out.print(" ");
			}
			else
				System.out.print(wordsOfArray[i]+" ");
		}
	}

}
