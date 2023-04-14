class CommissionEmp{
	private String name;
	private int empId;
	private int commission;
	private double sales;
	
	public CommissionEmp() {
		
	}
	public CommissionEmp(String name, int empId, int commission, double sales) {
		this.name = name;
		this.empId = empId;
		this.commission = commission;
		this.sales = sales;
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
		return sales*commission/100;
	}
	
}

class SalaryEmpSub extends CommissionEmp{
	private double basic;
	SalaryEmpSub(){
		super("",0,0,0);
		basic = 1000.0;
	}
	SalaryEmpSub(String name, int empId, int commission, double sales, double basic){
		super(name,empId,commission,sales);
		this.basic = basic;
	}
	public void printBasic() {
		System.out.println("Basic"+basic);
	}
	@Override
	public double earnings() {
		
		return basic + (super.getSales()*super.getCommission()/100);
	}
	
}
class student{
	
}
public class SuperEmp {
	public static void main(String[] args) {
		CommissionEmp e1;
		e1 = new CommissionEmp("Ezra", 103, 5, 30000);
		CommissionEmp e2 = new CommissionEmp("krish",102,5,20000);
		SalaryEmpSub s1 = new SalaryEmpSub("Ezra", 103, 5, 30000, 5000);
		SalaryEmpSub s2 = new SalaryEmpSub("Divya", 104, 5, 40000, 6000);
//		System.out.println(e1.earnings());
////		System.out.println(e2.earnings());
////		System.out.println(s1.earnings());
//		e1 = new SalaryEmpSub("Ezra", 103, 5, 30000, 5000);
//		System.out.println(s1.earnings());
		
		CommissionEmp emp[] = new CommissionEmp[4];
		emp[0] = e1;  //dynamic binding or runtime polymorphism
		emp[1] = e2;
		emp[2] = s1;
		emp[3] = s2;
				
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].earnings());
		}
				
	}

}


