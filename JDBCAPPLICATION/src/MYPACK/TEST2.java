// insert - Static query
package MYPACK;
import java.sql.*;
public class TEST2 {
	public static void main(String[] args) throws Exception{
		//Step 1 - loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Ready");
		//Step 2 - get the Connection to MySql
		Connection c=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/UNIVERSITYDB",
				"root","root");
		System.out.println("Connection Established");
		//Step 3 - send request to insert student
	String sql="insert into student values(11,'LIKITH',7.5,'BANGALORE')";
	Statement s=c.createStatement();
	//Step 4 - Receiving the response
	int response=s.executeUpdate(sql);
	System.out.println(response+" record inserted");
	//step 5 - close the connection
	c.close();
	System.out.println("Connection Closed");
	}

}




