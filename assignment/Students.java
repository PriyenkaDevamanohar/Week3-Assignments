package week3.assignment;

public class Students {
	private void studentInfo(int id) {
System.out.println("Student Id");
	}
	private void studentInfo(int id,String name) {
System.out.println("Student id,name");
	}
	private void studentInfo(String email, long phonenumber) {
System.out.println("Email and Phonenumber");
	}

	public static void main(String[] args) {
Students stud = new Students();
stud.studentInfo(20);
stud.studentInfo(10, "Priyenka");
stud.studentInfo("pri@gmail.com", 978769087);
System.out.println("This is Method Overloading");
	}

}
