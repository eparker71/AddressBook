package addressbook;


import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddressBookServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.getWriter().println("Servlet lives!");
	}

	
}
