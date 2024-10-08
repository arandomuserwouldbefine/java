<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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
	User u = (User) request.getAttribute("data");
	%>
	<div class="container">

		<form action="UserController" method="POST">
			<input type="hidden" class="mt-1" name="id"
				value="<%=u != null ? u.getId() : ""%>" /><br> <input
				type="text" class="mt-1" name="name"
				value="<%=u != null ? u.getName() : ""%>" /><br> <input
				type="text" class="mt-1" name="email"
				value="<%=u != null ? u.getEmail() : ""%>" /><br> <input
				type="text" class="mt-1" name="password"
				value="<%=u != null ? u.getPassword() : ""%>" /><br>

			<%-- Make checkboxes --%>
			<%
			if (u.getGender().equalsIgnoreCase("male")) {
			%>
			<input type="radio" value="male" name="gender" checked="checked" />Male
			<input type="radio" value="female" name="gender" />FeMale

			<%
			} else if (u.getGender().equalsIgnoreCase("female")) {
			%>
			<input type="radio" value="male" name="gender" />Male <input
				type="radio" value="female" name="gender" checked />FeMale
			<%
			}
			%>

			<div class="mt-3">
				<%
				List<String> possibleHobbies = Arrays.asList("Reading", "Cycling", "Photography", "Writing");
				List<String> userHobbies = u.getHobbies();
				for (String hobby : possibleHobbies) {
					boolean isChecked = userHobbies.contains(hobby);
				%>
				<input type="checkbox" name="hobbies" value="<%=hobby%>"
					class="m-2" <%=isChecked ? "checked" : ""%> /><%=hobby%>
				<%
				}
				%>


			</div>
			<input type="submit" class="btn btn-primary btn-sm mt-1"
				name="action" value="update" />




		</form>

	</div>
</body>
</html>