package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PrimeCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PrimeCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int number=Integer.parseInt(request.getParameter("n"));
		int c=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0)
				c++;
		}
		if(c>1)
			response.getWriter().print("no. is not prime");
		else
			response.getWriter().print("no. is  prime");
	}

}
