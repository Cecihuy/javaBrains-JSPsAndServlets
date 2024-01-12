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
		String fName = request.getParameter("fullName");
		printWriter.println("Hello from POST method! " + uName);
		printWriter.println("<br>" + "Your full name is " + fName);
		String prof = request.getParameter("profession");
		printWriter.println("<br>" + "You are a " + prof);
		//String loc = request.getParameter("location");
		String[] loc = request.getParameterValues("location");
		printWriter.println("<br>" + "You are at " + loc.length + " places ");
		for(int i = 0; i<loc.length; i++) {
			printWriter.println(loc[i]);
		}
	}
}
