package org.koushik.javabrains;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String uName = request.getParameter("userName");
		printWriter.println("Hello from GET method! " + uName);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String uName = request.getParameter("userName");
		printWriter.println("Hello from POST method! " + uName);
	}
}
