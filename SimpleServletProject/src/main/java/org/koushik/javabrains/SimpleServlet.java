package org.koushik.javabrains;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "A simple servlet", urlPatterns = "/AdvancedServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String uName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(uName != "" && uName != null) {
			session.setAttribute("savedUserName", uName);
			context.setAttribute("savedUserName", uName);
		}		
		writer.println("Request parameter has username as " + uName + "<br>");
		writer.println("Session parameter has username as " + (String)session.getAttribute("savedUserName") + "<br>");
		writer.println("Context parameter has username as " + (String)context.getAttribute("savedUserName"));
	}
}