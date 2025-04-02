// insert - Dynamic query
package MYPACK;
import java.sql.*;
import java.util.Scanner;
public class TEST3 {
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
	String sql="insert into student values(?,?,?,?)";
	PreparedStatement s=c.prepareStatement(sql);
	int id;
	String name;
	double cgpa;
	String address;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID Name cgpa address");
	id=sc.nextInt();
	name=sc.next();
	cgpa=sc.nextDouble();
	address=sc.next();
	s.setInt(1,id);
	s.setString(2, name);
	s.setDouble(3, cgpa);
	s.setString(4, address);
	//Step 4 - Receiving the response
	int response=s.executeUpdate();
	System.out.println(response+" record inserted");
	//step 5 - close the connection
	c.close();
	System.out.println("Connection Closed");
	}

}




