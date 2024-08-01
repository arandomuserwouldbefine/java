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


			<div class="row block-9">
				<div class="col-md-6 order-md-last d-flex">

					<form action="SellerController" method="POST"
						class="bg-white p-5 contact-form">
						<h1>Change Password</h1>
						<input type="hidden" name="id" value="<%=s.getId() %>" />
						<div class="form-group">
							<input type="password" class="form-control" placeholder="Old password"
								name="old_password">
						</div>
						
						<div class="form-group">
							<input type="password" class="form-control"
								placeholder="New Password" name="password">
						</div>
						<div class="form-group">
							<input type="submit" value="updatePassword" name="action"
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