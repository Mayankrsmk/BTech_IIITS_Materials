import java.io.*;
import java.util.*;

class MyEmp{
	String name;
	int eid;
	String dept;
	double salary;
	
	public MyEmp(String name, int eid, String dept, double salary) {
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MyEmp [name=" + name + ", eid=" + eid + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
public class FileExample {
  public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("file.txt");
	fw.write("Hello world.");
	fw.close();
	
	FileReader fr = new FileReader("file.txt");
	int i = fr.read();
	while(i!=-1) {
		System.out.printf("%c", i);
		i = fr.read();
	}
	
	Scanner sin = new Scanner(fr);
	while(sin.hasNext()) {
		System.out.println(sin.nextLine());
	}
	sin.close();
	
	FileReader fr1 = new FileReader("./EmployeeInput.csv");
  	Scanner ein = new Scanner(fr1);
  	String row;
  	while(ein.hasNext()) {
  		row = ein.nextLine();
  		String[] tokens = row.split(",");
  		MyEmp emp = new MyEmp(tokens[0], Integer.parseInt(tokens[1]), tokens[2], Double.parseDouble(tokens[3]));
  		System.out.println(emp);
  		
  	}
}
  	
}
  	


