package interface1;

import java.util.Arrays;

interface Payable{
	double getPayment();
	
	static void printDetails(Payable p){
		Invoice i = null;
		SalaryEmp e = null;
		if(p instanceof Invoice) {
			i = (Invoice) p;
			i.getItemPrice();
		}
		else if (p instanceof SalaryEmp) {
			e = (SalaryEmp) p;
			e.getSalary();
		}
//		p.getPayment();
	}
}
interface MonthlyPayable extends Payable{

	
}
class Invoice implements MonthlyPayable{
	private int invNum;
	private int itemCount;
	private int itemPrice;
	
	public Invoice(int invNum, int itemCount, int itemPrice) {
		this.invNum = invNum;
		this.itemCount = itemCount;
		this.itemPrice =  itemPrice;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	
	public double getPayment() {
		return itemCount*itemPrice;
	}
	
}

abstract class Employee implements Payable, Comparable{
	
}

class SalaryEmp extends Employee{
	private double salary;
	SalaryEmp(double salary){
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public double getPayment() {
		return salary;
	}
	public int compareTo(Object o2) {
		SalaryEmp s2= (SalaryEmp)(o2);
//		if(this.salary<s2.getSalary())
//			return -1;
//		else if(this.salary>s2.getSalary())
//			return 1;
//		return 0;
		return (int) s2.salary- (int) this.salary;
	}
}

public class PayableTest {
 public static void main(String[] args) {
	 Payable pay[] = new Payable[3];
	 pay[0] = new Invoice(100,5,1000);
	 pay[1] =  new SalaryEmp(50000);
	 pay[2] = new SalaryEmp(60000);
	 for(Payable p:pay) {
		 System.out.println(p.getPayment());
	 }
	 Employee e[] = new Employee[3];
	 e[0] = (Employee) pay[2];
	 e[1] = (Employee) pay[1];
	 e[2] = new SalaryEmp(10000);
	 Arrays.sort(e);
	 for(Employee ee:e) {
		 System.out.println(ee.getPayment());
	 }
 	 
 }
}
