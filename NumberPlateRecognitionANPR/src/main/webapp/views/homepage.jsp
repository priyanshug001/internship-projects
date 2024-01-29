<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<%
String unm = (String) session.getAttribute("unm");
if (unm == null || unm.isBlank()) {
	response.sendRedirect("login");
}
%>
<meta charset="UTF-8">
<title>HomePage</title>
<link rel="stylesheet" href="css/buttoncss.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="button_container">
		<p class="description">HomePage and select your choice</p>

		<button class="btn">
			<span><a href="login" style="color: white">Login</a></span>
		</button>
		<br> <br>

		<button class="btn">
			<span><a href="registration" style="color: white">UserRegistration</a></span>
		</button>
		<br> <br>

		<button class="btn">
			<span><a href="carregistration" style="color: white">Car
					Registration</a></span>
		</button>
		<br> <br>

		<button class="btn">
			<span><a href="findcar" style="color: white">Get Car
					Details</a></span>
		</button>
		<br> <br>
	</div>
</body>
</html>