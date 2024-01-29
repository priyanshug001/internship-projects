<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
label {
	color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black">
	<form action="/registration" method="post">
		<center>
			<label><h1>Registration</h1></label>
		</center>

		<center>
			<div>
				<label for="fname">FullName</label>&nbsp;&nbsp;<input type="text"
					id="fname" name="fname" placeholder="FullName" required>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="add">Address</label>&nbsp;&nbsp;<input type="text"
					id="add" name="add" placeholder="Address" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="city">City</label>&nbsp;&nbsp;<input type="text"
					id="city" name="city" placeholder="City" required>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="mob">Mobile No.</label>&nbsp;&nbsp;<input type="text"
					id="mob" name="mob" placeholder="Mobile No." required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="email">Email</label>&nbsp;&nbsp;<input type="email"
					id="email" name="email" placeholder="Email" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="unm">Username</label>&nbsp;&nbsp;<input type="text"
					id="unm" name="unm" placeholder="Username" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<label for="pass">Password</label>&nbsp;&nbsp;<input type="password"
					id="pass" name="pass" placeholder="Password" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<br>
			<br>
			<div>
				<button type="submit" value="Submit">Register</button>
			</div>
			<br>
			<br>
	</form>
	<button type="submit" value="login">
		<a href="login">If you have registered !! Click Here</a>
	</button>
	</center>
</body>
</html>