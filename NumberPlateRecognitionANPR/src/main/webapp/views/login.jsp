<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" href="css/allcss.css">
</head>
<body>
	<div class="wrapper"></br>
	<center><a href="homepage" style="color: black">Home</a></br></br></center>
		<div class="title">Login Form</div>
		<form action="/login" method="post">

			<div class="field">
				<input type="text" id="unm" name="unm" required>
				<label>Username</label>
			</div>
			<div class="field">
				<input type="password" id="pass" name="pass" required> <label>Password</label>
			</div>
			<div class="content">
				<div class="checkbox">
					<input type="checkbox" id="remember-me"> <label
						for="remember-me">Remember me</label>
				</div>
				<div class="pass-link">
					<a href="/forgotpassword">Forgot password?</a>
				</div>
			</div>
			<div class="field">
				<input type="submit" value="Login">
			</div>
			<div class="signup-link">
				Not a member? <a href="/registration">Signup now</a>
			</div>
		</form>
	</div>
</body>
</html>