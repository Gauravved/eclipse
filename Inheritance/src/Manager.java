
public class Manager extends Employee {
	private int bonus;

	public Manager(int empId, String name, double salary, int bonus) {
		super(empId, name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String toString() {
		return getEmpId()+"\t"+getName()+"\t"+getSalary()+"\t"+getBonus();
	}
	@Override
	public boolean equals(Object obj) {
        Manager mobj=(Manager)obj;
        if(this.getEmpId()==mobj.getEmpId() && this.getBonus()==mobj.getBonus()) {
        	return true;
        }
        return false;
     }

	@Override
	protected void finalize() throws Throwable {
		System.out.println("The file is closed");
	}
	
}
