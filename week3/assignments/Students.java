package week3.assignments;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("This is the student info based on id");
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("This is the student info based on id & name");
	}

	public void getStudentInfo(String emailId, long phoneNumber) {
		System.out.println("This is the student info based on emailid & phonenumber");
	}

	public static void main(String[] args) {

		Students std = new Students();
		std.getStudentInfo(11279844);
		std.getStudentInfo(11279844, "Karthika");
		std.getStudentInfo("karthika.pichandi.26", 8220540591L);
	}

}
