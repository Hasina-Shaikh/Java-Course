import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletProgram extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	
	String pname = req.getParameter("value");
	
	pw.print("User choose : " +pname);	
	}
}
