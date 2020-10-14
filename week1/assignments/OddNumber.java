package week1.assignments;

public class OddNumber {

	public static void main(String[] args) {
		int num = 20;
		System.out.println("Odd Numbers within " + num + " Range:");
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(i+",");
		}
		}
	}

}
