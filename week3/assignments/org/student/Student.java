package week3.assignments.org.student;

import week3.assignments.org.department.Department;

public class Student extends Department {
	
	public void studentName() {

		System.out.println("Karthika");
	}
	
	public void studentDept() {

		System.out.println("Chemical - A");
	}
	
	public void studentId() {
		System.out.println("11279824");
	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		}
}
