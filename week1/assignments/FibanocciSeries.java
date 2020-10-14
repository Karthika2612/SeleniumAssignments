package week1.assignments;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		
		int range = 8;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Fibanocci series of "+range+" is ");
		System.out.print(num1+","+num2); 
		for (int i = 1; i < range-1; i++) {
			int sum = num1+num2;
			System.out.print(","+sum);
			num1 = num2;
			num2 = sum;
		}
		
	}
	
}
