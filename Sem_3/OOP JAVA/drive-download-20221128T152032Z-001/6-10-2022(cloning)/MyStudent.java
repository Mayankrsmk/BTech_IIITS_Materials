package test;
class Program implements Cloneable{
	private String type;
	
	public Program(String type) {
	
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		return (this.type);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Student implements Cloneable{
	private int id = 5;
	private double marks;
	private Program p1;
		
	Student(int id, double marks, String type){
		this.id = id;
		this.marks = marks;
		p1 = new Program(type);
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void setProg(String type) {
		p1.setType(type);
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object o2) {
		Student s2 = (Student) o2;
		return this.id==s2.id;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		//s.p1 = new Program(this.p1.getType());
		s.p1 = (Program) this.p1.clone();
		return s;
	}
	public String toString() {
		return ("id: "+this.id+" marks: "+this.marks+ "Program"+this.p1);
	}

	
}
public class MyStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student (161, 90, "BTech");
//		Student s2 = new Student (161, 90, "BTech");
		System.out.println(s1);
		Student s2 = (Student) s1.clone();
		s2.setMarks(100);
		s2.setProg("MTech");
		System.out.println(s1+" "+s2);
		
		
	}
}

