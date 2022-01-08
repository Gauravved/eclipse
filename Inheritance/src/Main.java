
public class Main {

	public static void main(String[] args) {
		Manager mg=new Manager(101, "Gaurav", 80000, 2000);
		Manager mg1=new Manager(101, "Gaurav", 80000, 2000); 
		Manager mg2=mg1;
		if(mg1.equals(mg)) {
			System.out.println("Two objects are same");
		}
		else {
			System.out.println("Two objects are not same");
		}
		System.out.println("with == operator");
		if(mg1==mg) {
			System.out.println("Two objects are same");
		}
		else {
			System.out.println("Two objects are not same");
		}
		mg=null;
		mg1=null;
		mg2=null;
		System.gc();
	}
	public static void display(Employee eobj) {
		System.out.print(eobj.getEmpId()+"\t"+eobj.getName()+"\t"+eobj.getSalary()+'\t');
		if(eobj instanceof Manager) {
			Manager m=(Manager)eobj;
			System.out.println(m.getBonus());
		}
		if(eobj instanceof Developer) {
			Developer d=(Developer)eobj;
			System.out.println(d.getHrs());
		}
		System.out.println("toString method!!");
		System.out.println(eobj);
	}
}
