package session_Ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayDervlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String umobile=request.getParameter("umobile");
		String uemail=request.getParameter("uemail");
		
		HttpSession session=request.getSession(false);
		 
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body bgcolor='yellow'>");
		out.println("<center><h1>");
		out.println("<br><br>");
		out.println("User Name: "+session.getAttribute("uname")+"<br><br>");
		out.println("Age: "+session.getAttribute("uage")+"<br><br>");
		out.println("Qualification: "+session.getAttribute("uqual")+"<br><br>");
		out.println("Designation: "+session.getAttribute("udesig")+"<br><br>");
		out.println("Mobile: "+umobile+"<br><br>");
		out.println("Email: "+uemail+"<br><br>");
		out.println("</h1></center>");
		out.println("</body>");
		out.println("</html>");
	}

}
