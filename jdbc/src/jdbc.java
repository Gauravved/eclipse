import java.sql.*;
import java.util.*;
public class jdbc {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Gaurav:1521:XE", "system", "admin123");
			int ch=1;
			do {
				System.out.println("1> Insert Data \n2> Display Data \n3> Delete data \n4> Update data \n5> Exit \nEnter your choice:");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter employee id:");
					int empid=sc.nextInt();
					System.out.println("Enter employee Name:");
					String name=sc.next();
					System.out.println("Enter employee Surname:");
					String lname=sc.next();
					System.out.println("Enter employee Salary:");
					double salary=sc.nextDouble();
					PreparedStatement ps=con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
					ps.setInt(1, empid);
					ps.setString(2, name);
					ps.setString(3, lname);
					ps.setDouble(4, salary);
					int i=ps.executeUpdate();
					if(i>0) {
						System.out.println("Record  successfully inserted");
					}
					else {
						System.out.println("Failed to insert");
					}
					break;
				case 2:
					PreparedStatement p2=con.prepareStatement("SELECT * FROM employee");
					ResultSet rs=p2.executeQuery();
					if(rs.equals(null)) {
						System.out.println("No records entered");
					}
					else {
						while(rs.next()) {
							System.out.println(rs.getInt("empid")+"\t"+rs.getString("name")+"\t"+rs.getString("lname")+"\t"+rs.getFloat("salary"));
						}
					}
					break;
				case 3:
					PreparedStatement del=con.prepareStatement("delete employee where empid=?");
					System.out.println("Enter the employee id to remove the employee:");
					int e=sc.nextInt();
					p2=con.prepareStatement("SELECT * FROM employee where empid=?");
					p2.setInt(1, e);
					i=p2.executeUpdate();
					if(i>0) {
						del.setInt(1, e);
						rs=del.executeQuery();
						System.out.println("Record Deleted");
					}
					else {
						System.out.println("No such emplyee works here");
					}
				}
			}while(ch!=5);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
