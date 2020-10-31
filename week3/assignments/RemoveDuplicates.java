package week3.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] wordsInSen = text.split(" ");
		for (int i = 0; i < wordsInSen.length; i++) {
			int count = 0;
			for (int j = 0; j < wordsInSen.length; j++) {
				if (wordsInSen[i].equals(wordsInSen[j])) {
					count++;
				}
			}			
			
			  if (count>1) {
			  
			  String newString = text.replace(wordsInSen[i], "");
			  System.out.println(newString);
			  break;
			  }
			
		}
		
	}
}
