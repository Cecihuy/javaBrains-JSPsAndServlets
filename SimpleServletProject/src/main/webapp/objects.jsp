<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = request.getParameter("name");
		if(userName != null){
			session.setAttribute("sessionUserName", userName);
			application.setAttribute("applicationUserName", userName);
			pageContext.setAttribute("pageContextUserName", userName);
// 			pageContext.setAttribute("applicationUserName", userName, pageContext.APPLICATION_SCOPE);
// 			pageContext.findAttribute("name");
		}
	%>
	The user name in the request object is : <%= userName %>
	<br>
	The user name in the session object is : <%= session.getAttribute("sessionUserName") %>
	<br>
	The user name in the application context object is : <%= application.getAttribute("applicationUserName") %>
	
</body>
</html>