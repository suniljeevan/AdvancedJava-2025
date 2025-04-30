<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying Students</title>
</head>
<body bgcolor=pink>
<center>
<h2> Student Details </h2>
<%
try {
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitydb","root","root");
String query="select * from student";
Statement s=c.createStatement();
ResultSet res=s.executeQuery(query);
while(res.next()) {
	int id=res.getInt(1);
	String name=res.getString(2);
	double cgpa=res.getDouble(3);
	String address=res.getString(4);
	//displaying this in webpage
	%>
	<h2>
	<%=id+"\t" %><%=name+"\t" %><%=cgpa+"\t" %><%=address%>
	</h2>
	<br>
<%	
}
}catch(Exception e){}
%>
</center>
</body>
</html>




