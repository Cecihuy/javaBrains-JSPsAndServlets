<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
</head>
<body>
	<form action="process.jsp" method="post">
		<br>User ID: <input type="text" name="userId" />
		<br>User Name: <input type="text" name="userName" />
		<br>Address Line 1: <input type="text" name="addressl" />
		<br>Address Line 2: <input type="text" name="address2" />
		<br>City: <input type="text" name="city" />
		<br>State= <input type="text" name="state" />
		<br>Pincode: <input type="text" name="pincode" />
		<br><input type="submit" />
	</form>
</body>
</html>