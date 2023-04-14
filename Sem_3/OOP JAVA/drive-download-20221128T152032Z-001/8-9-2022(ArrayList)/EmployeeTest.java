import java.util.*;

class Date{
	private int day;
	public int month;
	private int year;
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return this.year;
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
	public void update() {
		this.joind.month =5; // possible only if month is public
		this.joind.setMonth(5); //joind is a member of this object. SetMonth is a member of joind
		
	}
		
	public String toString(){
		return String.format("Name:%s, DOB: %s, joinDate: %s",name, birthd, joind);
	}
	
}


public class EmployeeTest{
	public static void main(String[] args){
//		Date d = new Date(2,9,2004);
//		Date d1 = new Date(10,5,2025);
//		Employee1 e1 = new Employee1("Rayudu",d,d1);
//		java.util.Scanner sin = new java.util.Scanner(System.in);
//		
////		
////		Employee1 e1 = new Employee1("Rayudu",2,9,2004,10,5,2025);
//		System.out.println(e1);
		
		
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i*10;
		}
		
		for(int i:arr) {
			System.out.println(i);		}
		
		Employee1[] emp = new Employee1[3];
//		for(int i=0;i<emp.length;i++) {
//			emp[i]=new Employee1();
//		}
		emp[0] = new Employee1("Shyam",new Date(10,10,2004),new Date(10,12,2020));
		emp[1] = new Employee1("Vikas",new Date(4,5,2004),new Date(11,12,2020));
		emp[2] = new Employee1("Gagan",new Date(3,9,2004),new Date(12,12,2020));
		
//		int index = Arrays.binarySearch(arr, 20);
//		System.out.printf("20 is found at:%d",index);
//		arr[0]=100;
//		
//		for(int i:arr) {
//			System.out.println(i);		}
//		Arrays.sort(arr);
//		index = Arrays.binarySearch(arr, 100);
//		System.out.printf("\n100 is found at:%d",index);
//		Arrays.sort(arr);
//		System.out.println("AFter sorting");
//		for(int i:arr) {
//			System.out.println(i);		}
//		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(30);
//		al.add(20);
//		al.add(0,50);
//		
//		for(int i:al) {
//			System.out.print(i+",");
//		}
//		System.out.println(al);
		
		
		ArrayList<Employee1> el = new ArrayList<Employee1>();
		el.add(new Employee1("krish",new Date(10,10,2003), new Date(1,10,2019)));
		el.add(emp[0]);
		el.add(emp[1]);
		el.add(emp[2]);
		
		el.remove(0);
		System.out.println(el);
	}
	
}