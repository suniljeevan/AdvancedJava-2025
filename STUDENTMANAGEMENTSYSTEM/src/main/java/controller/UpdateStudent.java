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


public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double cgpa=Double.parseDouble(request.getParameter("cgpa"));
		String address=request.getParameter("address");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitydb","root","root");
		String query="update student set name=?,cgpa=?,address=? where id=?";
		PreparedStatement p=c.prepareStatement(query);
		p.setInt(4, id);
		p.setString(1, name);
		p.setDouble(2, cgpa);
		p.setString(3, address);
		int r=p.executeUpdate();
		response.setContentType("text/html");
		response.getWriter().print("<h2>"+"Record Updated"+"</h2>");
		}catch(Exception e) {
		System.out.println(e);
		 }	
	}

}
