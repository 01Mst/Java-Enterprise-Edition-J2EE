package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInServlet
 */
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		if(username.equalsIgnoreCase("Thulasimani")&&password.equals("58813")) {
			writer.println("This is Success");
			writer.println("That is Success");
			RequestDispatcher dispatcher=request.getRequestDispatcher("SuccessServlet");
		    dispatcher.forward(request, response);
		}else {
			writer.println("This is Fail<br><br>");
			writer.println("That is Fail<br><br>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("LogIN.html");
			writer.println("That is Fail<br><br>");
		    dispatcher.include(request, response);
		    writer.println("Enter Valid Data...");
		}}
		
		
		/*if(username.equalsIgnoreCase("Thulasimani")&&password.equals("58813")) {
			response.sendRedirect("https://www.google.com/search?client=firefox-b-d&q=forward+and+backward+slash");
		}else {
			//writer.println("LogIn Failed. Try with valid data...");
			response.sendError(808,"LogIn Failed!");
		}
	}*/
	/*	if(username.equalsIgnoreCase("Thulasimani")&&password.equals("58813")) {
		RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
		dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Fail.html");
			dispatcher.forward(request, response);
			}
		}*/
		/*if(username.equalsIgnoreCase("Thulasimani")&&password.equals("58813")) {
			writer.println("<a href='http://www.instagram.com'>Click here to get the instagram!</a>");
			}else {
				writer.println("<a href='FailedServlet'>Click here to get the Failed infomation!</a>");
				}}*/
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
