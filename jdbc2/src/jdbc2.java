
import java.util.*;
import java.sql.*;
public class jdbc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Gaurav:1521:xe","system","admin123");
			System.out.println("Enter number:");
			int n=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("Insert into test values(?)");
			ps.setInt(1, n);
			ps.executeUpdate();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
