package MYPACK;
import java.sql.*;
public class TEST4 {
	public static void main(String[] args) throws Exception{
		//Step 1 - loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Ready");
		//Step 2 - get the Connection to MySql
		Connection c=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/UNIVERSITYDB",
						"root","root");
		System.out.println("Connection Established");
		//Step 3 - send request to create Student table 
		String sql="DELETE FROM STUDENT WHERE ID=12";
		Statement s=c.createStatement();
		s.execute(sql);
		//Step 4- get the response
		System.out.println("Record Deleted");
		//Step 5 - close the connection
		c.close();
		System.out.println("Connection Closed");
	}

}
