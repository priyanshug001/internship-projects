<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>SignUp</title>
<link rel="stylesheet" href="css/allcss.css">
</head>
<body>
	<div class="wrapper"></br>
	<center><a href="homepage" style="color: black">Home</a></br></br></center>
		<div class="title">Registration Form</div>
		<form action="/registration" method="post">
			<div class="field">
				<input type="text" id="fname" name="fname" required> <label>Your
					Fullname</label>
			</div>
			<div class="field">
				<input type="email" id="yemail" name="yemail" required>
				<label>Email</label>
			</div>
			<div class="field">
				<input type="number" id="mno" name="mno" required>
				<label>MobileNo.</label>
			</div>
			<div class="field">
				<input type="text" id="add" name="add" required> <label>Address</label>
			</div>
			<div class="field">
				<input type="text" id="district" name="district" required> <label>District</label>
			</div>
			<div class="field">
				<input type="text" id="state" name="state" required> <label>State</label>
			</div>
			<div class="field">
				<input type="text" id="unm" name="unm" required> <label>Create
					Username</label>
			</div>
			<div class="field">
				<input type="password" id="pass" name="pass" required> <label>Create
					Password</label>
			</div>
			<div class="content">
				<div class="checkbox">
					<input type="checkbox" id="remember-me"> <label
						for="remember-me">Remember me</label>
				</div>
				<div class="pass-link">
					<a href="forgotpassword">Forgot password?</a>
				</div>
			</div>
			<div class="field">
				<input type="submit" value="submit">
			</div>
			<div class="signup-link">
				If you are a member? <a href="login">login now</a>
			</div>
		</form>
	</div>
</body>
</html>