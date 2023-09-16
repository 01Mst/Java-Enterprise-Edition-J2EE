package eventListener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("username");
		out.println("Welcome "+n);
		HttpSession session=request.getSession();
		
		ServletContext context=request.getServletContext();
		int t=(int) context.getAttribute("totalusers");
		int c=(int) context.getAttribute("currentusers");
		out.print("<br>Total Users   = "+t);
		out.print("<br>Current Users = "+c);
		
		out.print("<br><a href='LogoutServlet'>LogOut</a>");
		out.close();
	}

}
