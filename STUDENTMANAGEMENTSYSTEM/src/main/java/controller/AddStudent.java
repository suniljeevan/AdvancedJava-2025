package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddStudent() {
        super();
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
        	String query="insert into student values(?,?,?,?)";
        	PreparedStatement p=c.prepareStatement(query);
        	p.setInt(1, id);
        	p.setString(2, name);
        	p.setDouble(3, cgpa);
        	p.setString(4, address);
        	int r=p.executeUpdate();
        	response.setContentType("text/html");
        	response.getWriter().print("<h2>"+"Record Inserted"+"</h2>");
        	// calling jsp from servlet
        	response.sendRedirect("show.jsp");
        	// or 
        	//request.getRequestDispatcher("show.jsp").forward(request, response);
        }catch(Exception e) {
        	System.out.println(e);
        }
}
}

	
	
	