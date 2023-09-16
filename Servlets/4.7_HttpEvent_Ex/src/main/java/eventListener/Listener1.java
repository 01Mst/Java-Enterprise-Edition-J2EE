package eventListener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Listener1 implements HttpSessionListener {

    public Listener1() {
        // TODO Auto-generated constructor stub
    }
    int total;
    int current;
    ServletContext context=null;
	
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session object created with id: "+se.getSession().getId());
    	total++;
    	current++;
        context=se.getSession().getServletContext();
    	context.setAttribute("totalusers", total);
    	context.setAttribute("currentusers", current);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session object created with id: "+se.getSession().getId());
    	current--;
    	context.setAttribute("currentusers", current);
    	
    }
	
}
