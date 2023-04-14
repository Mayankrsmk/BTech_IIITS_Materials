//import java.util.Scanner;
public class GradeBookTest {
	public static void main(String[] args) {
		java.util.Scanner sin = new java.util.Scanner(System.in);
		String course = sin.nextLine();
		GradeBook gb = new GradeBook("Java", 101);
	
		gb.setCourse(course);
		System.out.println(gb.getCourse()+"course Id:"+gb.getCourseId());
		gb.displayMessage();
	}
}

