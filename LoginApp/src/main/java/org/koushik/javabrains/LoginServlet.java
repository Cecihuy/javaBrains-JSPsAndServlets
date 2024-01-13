package org.koushik.javabrains;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.koushik.javabrains.service.LoginService;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId, password;
		
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, password);
		if(result) {
			response.sendRedirect("success.jsp");
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
	}
}
