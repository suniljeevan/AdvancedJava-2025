package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteStudent() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data
	int id=Integer.parseInt(request.getParameter("id"));
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitydb","root","root");
	String query="delete from student where id=?";
	PreparedStatement p=c.prepareStatement(query);
	p.setInt(1, id);
	int r=p.executeUpdate();
	response.setContentType("text/html");
	response.getWriter().print("<h2>"+"Record Deleted"+"</h2>");
	}catch(Exception e) {
	System.out.println(e);
	}	
	}

}
