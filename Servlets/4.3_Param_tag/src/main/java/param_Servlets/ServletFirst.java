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
 * Servlet implementation class ServletFirst
 */
public class ServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFirst() {
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
		writer.println("First Servlet init param-1 "+config.getInitParameter("Processor"));
		writer.println("<br><br>");
		
	
		ServletContext context=request.getServletContext();
		writer.println("First Servlet context param-1 "+context.getInitParameter("Username"));
		writer.println("<br><br>");
		writer.println("Second Servlet context param-2 "+context.getInitParameter("Password"));
		writer.println("<br><br>");
	}
}
