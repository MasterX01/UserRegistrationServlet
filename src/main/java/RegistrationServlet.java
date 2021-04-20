

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns = { "/RegistrationServlet" }
)
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String pno = request.getParameter("pno");
		String user = request.getParameter("user");
		String pwd = request.getParameter("password");
		Validation validObj = new Validation();
		if(validObj.validateName(name) && 
				validObj.validateEmail(mail) && 
				validObj.validateMobNum(pno) && 
				validObj.validateName(user) && 
				validObj.validatePassword(pwd)) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("RegistrationSucess.jsp").forward(request, response);
		}else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/UserRegistration.html");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Either username or password is incorrect.</font>");
			rd.include(request, response);
		}
	}

}
