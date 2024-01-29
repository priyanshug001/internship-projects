<%@page
	import="com.CodeClause.NumberPlateRecognitionANPR.model.CarRegistration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
CarRegistration carRegistration = (CarRegistration) session.getAttribute("getcardetails");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/listcss.css">
</head>
<body>

	<section>
		<div>
			<br> <a href="homepage" style="color: black">Home</a></br>
			<h2>Vehicle Details</h2>
			<ul class="check-list">
				<li><b>OwnerID :</b> <%=carRegistration.getId()%></li>
				<li><b>Owner Name :</b> <%=carRegistration.getOwnername()%></li>
				<li><b>Owner Address :</b> <%=carRegistration.getAddress()%></li>
				<li><b>Owner City :</b> <%=carRegistration.getOcity()%></li>
				<li><b>Owner State :</b> <%=carRegistration.getOstate()%></li>
				<li><b>Owner ZIP :</b> <%=carRegistration.getOzip()%></li>
				<li><b>Vehicle Year :</b> <%=carRegistration.getVehicalyear()%></li>
				<li><b>Vehicle No. :</b> <%=carRegistration.getVehicalno()%></li>
				<li><b>Vehicle Make :</b> <%=carRegistration.getVehicalmake()%></li>
				<li><b>Vehicle Model :</b> <%=carRegistration.getVehicalmodel()%></li>
				<li><b>Vehicle Colour :</b> <%=carRegistration.getVehicalcolour()%></li>
				<li><b>Vehicle Registration Date :</b> <%=carRegistration.getRegdate()%></li>
			</ul>


		</div>
	</section>

</body>
</html>