<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="org.koushik.javabrains.dto.User" scope="request">
		<jsp:setProperty property="*" name="user" />
		Hello <jsp:getProperty property="userName" name="user" />
	</jsp:useBean>
</body>
</html>