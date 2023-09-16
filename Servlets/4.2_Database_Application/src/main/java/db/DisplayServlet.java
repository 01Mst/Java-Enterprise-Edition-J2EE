package db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","58813");
			
			
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery("select * from customer");
		
		writer.println("<b><p>FirstName  LastName  Email  Mobile  Address</p></b><br>");
		while(rs.next()) {
			writer.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
			writer.println("<br>");
		}
		
		writer.println("<a href='Customer.html'>Click here to Add records.</a>");
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
