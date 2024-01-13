<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Testing JSPs</h3>	
	<%
		int i = 1;
		int j = 2;
		int k;
		k = i + j;
		out.println("Value of k is " + k);
	%>
	<br>
	other way to print, value of k is : <%= k %>
	<br>
	<%!
		public int add (int a, int b){
			return a + b;
		}
	%>
	
	<%
		k = add(123, 234);
	%>
	
	The value of k now is: <%= k %>
	
</body>
</html>