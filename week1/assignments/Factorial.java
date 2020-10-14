package week1.assignments;

public class Factorial {
	int num = 5;
	int factor = 1;
	/*
	 * public void factorialMath() { 
	 * for(int i=1;i<=num;i++) { 
	 * factor = factor*i; 
	 * }
	 * System.out.println("Factorial of given number: "+factor); 
	 * }
	 */
	
	public void factorialMath() {
		for (int i=num;i>=1;i--) {
			factor = factor*i;
		}
		System.out.println("Factorial of given number: "+factor);
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorialMath();
	}
}
