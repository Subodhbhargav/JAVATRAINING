package mavenDemo;

public class Employee {
	Name n;
	Address a;
	Contact c;
	private String empID;
	private String empStatus;
	public Employee(Name n, Address a, Contact c, String empID, String empStatus) {
		super();
		this.n = n;
		this.a = a;
		this.c = c;
		this.empID = empID;
		this.empStatus = empStatus;
	}
	public Name getN() {
		return n;
	}
	public void setN(Name n) {
		this.n = n;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	public Contact getC() {
		return c;
	}
	public void setC(Contact c) {
		this.c = c;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	
	
	
	
		
	
	
	
	

}
