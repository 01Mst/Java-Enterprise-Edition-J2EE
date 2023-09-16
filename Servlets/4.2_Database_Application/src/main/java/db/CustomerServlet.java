package db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerServlet() {
    	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		PrintWriter writer=response.getWriter();
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		String[] address=request.getParameterValues("t1");
		
		StringBuffer buffer=new StringBuffer();
		for(String data:address) {
			buffer.append(data+",");
		}
		
		String saddr=buffer.toString();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		
			PreparedStatement ps=conn.prepareStatement("insert into customer values(?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.setString(5, saddr);
			
		   int a= ps.executeUpdate();
		   if(a==1) {
			
				writer.println("Data inserted successfully! <br><br>");
				writer.println("<a href='DisplayServlet'>Click here to display all records.</a>");
				
		   }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
