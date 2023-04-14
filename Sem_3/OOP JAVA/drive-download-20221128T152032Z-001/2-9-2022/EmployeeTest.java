class Date{
	private int day;
	private int month;
	private int year;
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return String.format("%d:%d:%d", day,month,year);
	}
}
class Employee1{
	private String name;
	private Date birthd;
	private Date joind;
	public Employee1(){
		
	}
	public Employee1(String name, Date d1, Date d2){
		this.name = name;
		birthd = d1;
		joind = d2;
	}
	public Employee1(String name, int d1, int d2, int d3, int e1, int e2, int e3) {
		this.name = name;
		birthd = new Date(d1,d2,d3);
		joind = new Date(e1,e2,e3);
	}
		
	public String toString(){
		return String.format("Name:%s, DOB: %s, joinDate: %s",name, birthd, joind);
	}
	
}


public class EmployeeTest{
	public static void main(String[] args){
		Date d = new Date(2,9,2004);
		Date d1 = new Date(10,5,2025);
		Employee1 e1 = new Employee1("Rayudu",d,d1);
	
		
//		
//		Employee1 e1 = new Employee1("Rayudu",2,9,2004,10,5,2025);
		System.out.println(e1);
		
	}
	
}