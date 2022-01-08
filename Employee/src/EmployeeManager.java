import java.util.Scanner;

public class EmployeeManager {
	Scanner sc=new Scanner(System.in);
	public  Employee1 Create(int i,int emp) {
		System.out.println("Enter the Employee "+(i+1)+" Id:");
		int id=sc.nextInt();
		System.out.println("Enter the Employee "+(i+1)+" name:");
		String name=sc.next();
		char ch;
		int l=name.length();
		for(int j=l;j<=10;j++) {
			ch=' ';
			name=name.substring(0,l)+ch;
			l++;
		}
		System.out.println("Enter the Employee "+(i+1)+" salary:");
		double sal=sc.nextDouble();
		Employee1[] e1 = new Employee1[emp];
		e1[i]=new Employee1(id,name,sal);
		Employee1 e2=e1[i];
		return e2;
	}
	public void display(Employee1[] eobj,int emp) {
		System.out.println("Employee Id \t Employee Name \tSalary");
		for(int i=0;i<emp;i++) 
		{
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println(eobj[i].getEmpId()+"\t\t"+eobj[i].getEmpName()+"\t"+eobj[i].getEmpSal());
		}
	}
	public void update(Employee1[] eobj, int emp) {
		System.out.println("Enter the employee id to update its data:");
		int id=sc.nextInt();
		for(int i=0;i<emp;i++) {
			if(eobj[i].getEmpId() ==id) {
				System.out.println("\n\t 1> Change Employee Name \n\t 2> Update Employee Salary \nEnter your choice:");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter new name of the employee:");
					String str=sc.next();
					int l=str.length();
					char c;
					for(int j=l;j<=10;j++) {
						c=' ';
						str=str.substring(0,l)+c;
						l++;
					}
					eobj[i].setEmpName(str);
				break;
				case 2:
					System.out.println("Enter the updated salary of employee:");
					double sal=sc.nextDouble();
					eobj[i].setEmpSal(sal);
				break;
				default: System.exit(0);
				}
				display(eobj,emp);
				break;
			}
		}
	}
}
