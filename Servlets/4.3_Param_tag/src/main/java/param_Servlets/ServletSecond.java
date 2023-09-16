package param_Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSecond
 */
public class ServletSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSecond() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		ServletConfig config=this.getServletConfig();
		writer.println("Second Servlet config param tag-1 "+config.getInitParameter("VCS"));
		writer.println("<br><br>");
		
		
		ServletContext context=this.getServletContext();
		writer.println("Second Servlet context param tag-1"+context.getInitParameter("Username"));
		writer.println("<br><br>");
		writer.println("Second Servlet context param tag-2 "+context.getInitParameter("Password"));
		writer.println("<br><br>");
	}

}
