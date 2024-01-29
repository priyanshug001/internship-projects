<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<title>Car Registration</title>
<link rel="stylesheet" href="css/carreg.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="container">
		<a href="homepage" style="color: black">Home</a></br>
		</br>
		<div class="title">Car Registration</div>
		<div class="content">
			<form action="/carregistration" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details">Vehical Year</span> <input type="text"
							placeholder="Vehical Year" id="vyear" name="vyear" required>
					</div>
					<div class="input-box">
						<span class="details">Vehical Make</span> <input type="text"
							placeholder="like suzuki,honda,audi etc." id="vmake" name="vmake"
							required>
					</div>
					<div class="input-box">
						<span class="details">Vehical Model</span> <input type="text"
							placeholder="Vehical Model" id="vmodel" name="vmodel" required>
					</div>
					<div class="input-box">
						<span class="details">Vehical Colour</span> <input type="text"
							placeholder="Vehical Colour" id="vcolour" name="vcolour" required>
					</div>
					<div class="input-box">
						<span class="details">Vehical Number/Lisence No.</span> <input
							type="text" placeholder="Vehical Number/Lisence No." id="vno"
							name="vno" required>
					</div>
					<div class="input-box">
						<span class="details">Owner Name</span> <input type="text"
							placeholder="Owner Name" id="oname" name="oname" required>
					</div>
					<div class="input-box">
						<span class="details">Address</span> <input type="text"
							placeholder="Address" id="oadd" name="oadd" required>
					</div>
					<div class="input-box">
						<span class="details">City</span> <input type="text"
							placeholder="City" id="ocity" name="ocity" required>
					</div>
					<div class="input-box">
						<span class="details">State</span> <input type="text"
							placeholder="State" id="ostate" name="ostate" required>
					</div>
					<div class="input-box">
						<span class="details">ZIP Code</span> <input type="text"
							placeholder="ZIP Code" id="ozip" name="ozip" required>
					</div>
				</div>
				<div class="button">
					<input type="submit" value="Register Car Details">
				</div>
			</form>
		</div>
	</div>

</body>
</html>