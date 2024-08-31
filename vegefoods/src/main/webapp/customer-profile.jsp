<%@page import="model.Seller"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@include file="includes/customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<section class="ftco-section contact-section bg-light">
		<div class="container">
			<%
			Customer s1 = null;
			if (session.getAttribute("data") != null) {
				s1 = (Customer) session.getAttribute("data");
			} else {
				response.sendRedirect("customer-login.jsp");
				return ;
			}
			%>
			<div class="row block-9">
				<div class="col-md-6 order-md-last d-flex">
					<form action="CustomerController" method="POST"
						class="bg-white p-5 contact-form">
						<h1>Seller Register</h1>
						<input type="hidden" value="<%=s1.getId()%>" name="id" />
						<div class="form-group">
							<input type="text" class="form-control" name="name"
								value="<%=s1.getName()%>" placeholder="Your Name">
						</div>
						<div class="form-group">
							<input type="email" class="form-control"
								value="<%=s1.getEmail()%>" placeholder="Your Email" name="email">
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								value="<%=s1.getAddress()%>" placeholder="Your Address"
								name="address">
						</div>
						<div class="form-group">
							<input type="number" name="contact" value="<%=s1.getContact()%>"
								class="form-control" placeholder="Your Contact" name="contact">
						</div>

						<div class="form-group">
							<input type="submit" value="updateProfile" name="action"
								class="btn btn-primary py-3 px-5">
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
<%@include file="includes/footer.jsp"%>
</body>
</html>