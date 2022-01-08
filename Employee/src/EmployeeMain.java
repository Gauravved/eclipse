import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeManager manage=new EmployeeManager();;
		System.out.println("How many employees are there in your office:");
		int emp=sc.nextInt();
		Employee1[] eobj=new Employee1[emp];
		for(int i=0;i<emp;i++) {
			eobj[i]=manage.Create(i,emp);
		}
		manage.display(eobj,emp);
		char c='Y';
		do {
			System.out.println("Do you want to update data of any employee[y/n]?:");
			String str=sc.next();
			char ch=str.charAt(0);
			if(ch=='y'||ch=='Y') {
				manage.update(eobj, emp);
			}
			c=ch;
		}while((c=='y')||(c=='Y'));
	}

}
