
public class GradeBook {

	private String course;
	private int courseId;
	
//	public GradeBook() {
//		course = null;
//		courseId = 0;
//	}
	
	public GradeBook(String courseName, int id){
		course=courseName;
		courseId = id;
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String c) {
		course = c;
	}
	public int getCourseId() {
		return courseId;
	}

	public void displayMessage() {
		System.out.println("Welcome to " + course);
	}
}
