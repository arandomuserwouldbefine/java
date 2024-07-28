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
	String msg = (String) request.getAttribute("msg");
	%>
	<%
	if (msg != null) {
	%>
	<%
	out.print(msg);
	%>
	<%
	}
	%>
	<a href="login.jsp">Login</a>
	<h1>Register Here</h1>

	<form action="register"  method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" />
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" />
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea name="address"></textarea>
			</tr>
			<tr>
				<td>Contact:</td>
				<td><input type="number" name="contact" />
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" />
			</tr>

			<tr>
				<td><input name="action" type="submit" value="register" /></td>
			</tr>
		</table>
	</form>


</body>
</html>