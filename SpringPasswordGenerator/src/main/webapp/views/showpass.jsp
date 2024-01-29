<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
		String username = (String) session.getAttribute("unm");
		String password = (String) session.getAttribute("password");
		%>

		<h1>
			<%
			if (password != null) {
			%>
			Your Username is :
			<%=username%>
			& Your Generated Password is :
			<%=password%>
			<%
			}
			%>
		</h1>

	</center>
</body>
</html>