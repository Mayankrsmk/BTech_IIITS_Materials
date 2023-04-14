abstract class Employee2{
	private String name;
	private int empId;
	public abstract double earnings();
	
	Employee2(String name, int empId){
		this.name= name;
		this.empId = empId;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
class SalaryEmp extends Employee2{
	private int salary;
	SalaryEmp(String name, int empId, int salary){
		super(name,empId);
		this.salary = salary;
	}
	public double earnings() {
		System.out.println("Earnings of Salary employee");
		return salary;
	}
	
}
class CommissionEmp extends Employee2{
	
	private int commission;
	private double sales;
	
	public CommissionEmp(String name, int empId, int commission, double sales) {
		super(name,empId);
		this.commission = commission;
		this.sales = sales;
	}
	
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double earnings() {
		System.out.println("Earnings of Commission employee");
		return sales*commission/100;
	}
	
	
}

class BaseCommissionEmp extends CommissionEmp{
	private double basic;
	BaseCommissionEmp(){
		super("",0,0,0);
		basic = 1000.0;
	}
	BaseCommissionEmp(String name, int empId, int commission, double sales, double basic){
		super(name,empId,commission,sales);
		this.basic = basic;
	}
	public void printBasic() {
		System.out.println("Basic"+basic);
	}
	@Override
	public double earnings() {
		System.out.println("Earnings of Base commission employee");
		return basic + (super.getSales()*super.getCommission()/100);
	}
	
}
class student{
	
}
public class SuperEmp {
	public static void main(String[] args) {
		Employee2 emp[] = new Employee2[5];
		emp[0] = new CommissionEmp("tom", 101, 5, 5000);
		emp[1] = new BaseCommissionEmp("tom", 102,5, 5000, 10000);
		emp[2] = new SalaryEmp("tom", 103,55000);
		emp[3] = new BaseCommissionEmp("tom", 104,5, 10000, 10000);
		emp[4] = new SalaryEmp("tom", 105,60000);
//		for(Employee1 e:emp) {
//			System.out.println(e.earnings());
//		}
			
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].earnings());
		}
		
	}

}


