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
	<a href="homepage" style="color: black">Home</a></br></br>
		<div class="title">Fill Vehicle Details</div>
		<div class="content">
			<form action="/findcar" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details">Vehicle Year</span> <input type="text"
							placeholder="Vehicle Year" id="vyear" name="vyear" required>
					</div>
					<div class="input-box">
						<span class="details">Vehicle Make</span> <input type="text"
							placeholder="like suzuki,honda,audi etc." id="vmake" name="vmake"
							required>
					</div>
					<div class="input-box">
						<span class="details">Vehicle Model</span> <input type="text"
							placeholder="Vehicle Model" id="vmodel" name="vmodel" required>
					</div>
					<div class="input-box">
						<span class="details">Vehicle Number/License No.</span> <input
							type="text" placeholder="Vehical Number/License No." id="vno"
							name="vno" required>
					</div>
				</div>
				<div class="button">
					<input type="submit" value="Get Car Details">
				</div>
			</form>
		</div>
	</div>

</body>
</html>