import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	

	public void doPost(HttpServletResponse res, HttpServletRequest req) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		int fnum = Integer.parseInt(req.getParameter("fnum"));
		int snum = Integer.parseInt(req.getParameter("snum"));

		int c = fnum + snum;
		System.out.println(c);
		pw.close();

	}
}
