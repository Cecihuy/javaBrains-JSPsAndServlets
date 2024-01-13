<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="org.koushik.javabrains.dto.User"
%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h3>Login Successfull!!!</h3>
	<jsp:useBean id="user" class="org.koushik.javabrains.dto.User" scope="request">
		<jsp:setProperty property="userName" name="user" value="New User" />
	</jsp:useBean>
	Hello <jsp:getProperty property="userName" name="user"/>
</body>
</html>