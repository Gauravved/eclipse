
public class Developer extends Employee{
	private int hrs;

	public Developer(int empId, String name, double salary, int hrs) {
		super(empId, name, salary);
		this.hrs = hrs;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public String toString() {
		return getEmpId()+"\t"+getName()+"\t"+getSalary()+"\t"+getHrs();
	}
	
}
