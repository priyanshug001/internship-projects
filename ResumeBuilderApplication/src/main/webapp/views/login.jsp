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
	<form action="/login" method="post">
	<center><label><h1>Login</h1></label></center>
	<center>
	
	<div>
		<label for="unm">Username</label>&nbsp;&nbsp;<input type="text" id="unm" name="unm" placeholder="Username" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
		<label for="pass">Password</label>&nbsp;&nbsp;<input type="password" id="pass" name="pass" placeholder="Password" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
    </div>	<br><br>   
   <div>
   <button type="submit" value="Submit">Generate Resume</button>
   </div><br><br>
   
   <button type="submit" value="registration" ><a href="registration">If you not have registered !! Click Here</a></button>
   
	</form>
	</center>
</body>
</html>