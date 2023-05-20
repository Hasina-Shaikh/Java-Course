import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	int access = 0;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String user = req.getParameter("username");
		String pass = req.getParameter("password");

		if (user.equals("java4s") && pass.equals("java4s")) {
			// pw.println("Login Success...!");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, res);
		} else {
			pw.println("Login Failed...!");
			pw.close();
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get method called");
	}

}
