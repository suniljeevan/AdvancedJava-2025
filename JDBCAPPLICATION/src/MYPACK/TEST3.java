package MYPACK;
import java.sql.*;
public class TEST3 {
	public static void main(String[] args) 
			throws Exception{
		//Step 1 - loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Ready");
		//Step 2 - get the Connection to MySql
		Connection c=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/UNIVERSITYDB",
				"root","root");
		System.out.println("Connection Established");
		//Step 3 - send request to create Student table 
		String sql="UPDATE STUDENT SET NAME='THRISHA', CGPA=8.5,ADDRESS='BANGALORE' WHERE ID=12";
		Statement s=c.createStatement();
		s.execute(sql);
		//Step 4- get the response
		System.out.println("Record Updated");
		//Step 5 - close the connection
		c.close();
		System.out.println("COnnection Closed");
	}

}
