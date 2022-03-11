package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("StudentName-Student");
	}

	public void studentDepartment() {
		System.out.println("StudentDepartment-Student");
	}

	public void studentId() {
		System.out.println("StudentId-student");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.CollegeCode();
		stud.CollegeName();
		stud.CollegeRank();
		stud.departmentName();
		stud.studentName();
		stud.studentDepartment();
		stud.studentId();

	}

}
