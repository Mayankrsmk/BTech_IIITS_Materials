class Student {
    int rollNum;
    double CGPA;
}


public class StudentProc{

	
public static Student addStudent(){
    	Student s = new Student();
	return s;
}
public static void setDetails(Student s, int rollNum, double CGPA){
    	s.rollNum = rollNum;
	s.CGPA = CGPA;
}

public static void getDetails(Student s){
    System.out.printf("%d\n%g\n",s.rollNum, s.CGPA);
}
	public static void main(String[] args)
	{
		Student s1 = addStudent();
		setDetails(s1, 101, 9.2);
		getDetails(s1);
		
		Student s2 = addStudent();
		setDetails(s2, 102, 7.4);
		getDetails(s2);
		

	}
}