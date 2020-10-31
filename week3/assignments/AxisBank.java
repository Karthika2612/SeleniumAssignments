package week3.assignments;

public class AxisBank extends BankInfo{
	
	public void deposit() {

		System.out.println("Child Deposit - 20000");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}
}
