package session_Ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uqual=request.getParameter("uqual");
		String udesig=request.getParameter("udesig");
		
		HttpSession session=request.getSession(false);
		 
		session.setAttribute("uqual", uqual);
		session.setAttribute("udesig", udesig);
		
		request.getRequestDispatcher("Form3.html").forward(request, response);
		
	}

}
