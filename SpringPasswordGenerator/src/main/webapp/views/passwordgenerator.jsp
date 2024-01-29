<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PasswordGenerate</title>
</head>
<body>
	<form action="/passwordgenerator" method="post">
		<center>
			<label><h1>PasswordGenerate</h1></label>
		</center>
		<center>

			<div>
				<label for="unm">Create Username</label>&nbsp;&nbsp;<input type="text"
					id="unm" name="unm" placeholder="Username" required>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br> <br>
			<div>
				<input type="submit" value="Submit"/>
			</div>
		</center>
	</form>
</body>
</html>