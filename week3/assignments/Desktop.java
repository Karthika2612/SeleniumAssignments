package week3.assignments;

public class Desktop extends Computer{

	public void desktopSize() {

		System.out.println("Desktop size is 1200x600");
	}
	
	public static void main(String[] args) {
		
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}
}
