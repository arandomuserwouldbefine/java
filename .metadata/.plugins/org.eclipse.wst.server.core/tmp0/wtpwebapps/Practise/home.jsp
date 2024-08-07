<%@page import="java.util.List"%>
<%@page import="DAO.UserDAO"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	<h1>You are authenticated, I guess?</h1>

	<h4>
		<a href="logout.jsp">Logout</a>
	</h4>

	<div class="container mt-5">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>


<% List<User> users = UserDAO.AllUsers(); %>
		<%for(User u:users){ %>

							<tr>
				<th scope="row"><%=u.getId() %></th>
				<td><%=u.getName() %></td>
				<td><%=u.getEmail() %></td>
				<td>
					<form action ="UserController" method="post"> 
						<input type="hidden" name="id" value="<%=u.getId()%>">
						<input type="submit" class="btn btn-primary btn-sm" name="action" value="edit">
					</form>
				</td>
				<td>
					<form action ="UserController" method="post"> 
						<input type="hidden" name="id" value="<%=u.getId()%>">
						<input type="submit" class="btn btn-danger btn-sm" name="action" value="delete">
					</form>
			</tr>
<% } %>
			</tbody>
		</table>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</html>