<%@ page language="java"
		 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"
    	 import="java.util.Date"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clock</title>
</head>
<body>
	<%@ include file="/hello.jsp" %>
	<br>
	The time is : <%= new Date() %>
</body>
</html>