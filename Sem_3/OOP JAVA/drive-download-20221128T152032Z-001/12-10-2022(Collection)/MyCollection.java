import java.util.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee e) { //Provides Natural order
		
		return (int)(this.salary - e.salary);
	}
	
}

class EmployeeCompareId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) { 
		
		return o1.id-o2.id;
	}
	
}
public class MyCollection {
	public static void main(String[] args) {
				
		Employee e1 = new Employee(101,"sha", 10000);
		Employee e2 = new Employee(102,"son", 20000);
		Employee e3 = new Employee(103,"mon", 30000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(1,e3);
		al.remove(1);
		
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e1);
		al2.add(e3);
		al.addAll(1,al2); //bulk operation
		
		
//		System.out.println(al);
		Iterator<Employee> it = al.iterator();
		System.out.println(al);
		
		System.out.println(al);
		
		while(it.hasNext()) {
			if(it.next().salary>10000) {
				it.remove();
			}
				
			
		}
		
		
		System.out.println(al);
		Employee[] earr = al.toArray(new Employee[al.size()]);
		
		List<Employee> v = Arrays.asList(earr); 
		v.set(0, e3);
		//v.remove(1); //NOT ALLOWED
		
		Collections.sort(al); //Will sort based on natural ordering provided by compareTo Method
		
		Collections.sort(al, Collections.reverseOrder()); //Will reverse sort based on compareTo method
		Collections.sort(al, new EmployeeCompareId()); //Will sort based on the compare method given in EmployeeCompareId class
		System.out.println(al);
		
		
	}
	
	
	
}
 