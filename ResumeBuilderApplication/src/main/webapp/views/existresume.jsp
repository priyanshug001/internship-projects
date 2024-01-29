<%@page
	import="com.codeclause.ResumeBuilderApplication.model.ResumeData"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<%
ResumeData rd = (ResumeData) session.getAttribute("alldata");
%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Resume Setup</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f2f2f2;
}

.resume-container {
	width: 21cm; /* A4 width */
	height: 29.7cm; /* A4 height */
	margin: 20px auto;
	background-color: #ffffff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	padding: 20px;
	box-sizing: border-box;
}

header {
	text-align: center;
	margin-bottom: 20px;
}

h1, h2, h3 {
	margin-bottom: 10px;
}

.contact-info {
	margin-bottom: 20px;
}

.education, .experience {
	margin-bottom: 30px;
}

.education h3, .experience h3 {
	margin-bottom: 10px;
}

.skills {
	margin-bottom: 30px;
}

.skills ul {
	list-style-type: none;
	padding: 0;
}

.skills li {
	display: inline-block;
	margin-right: 10px;
	margin-bottom: 10px;
	background-color: #f2f2f2;
	padding: 8px 15px;
	border-radius: 5px;
}

.references {
	margin-bottom: 20px;
}
</style>
</head>
<body>
	<div class="resume-container">
		<header>
			<h1><%=rd.getFirstname()%>
				<%=rd.getLastname()%></h1>
			<p><%=rd.getRehead()%></p>
		</header>
		<p><%=rd.getResumry()%></p>
		<div class="contact-info">

			<p>
				Address:
				<%=rd.getAddress()%>,
				<%=rd.getPostalcode()%>
			</p>
			<p>
				Nationality:
				<%=rd.getNationality()%></p>
			<p>
				DOB:
				<%=rd.getDateofbirth()%></p>
			<p>
				Phone:
				<%=rd.getMobile()%></p>
			<p>
				Email:
				<%=rd.getEmail()%></p>

		</div>

		<div class="education">
			<h2>Education</h2>
			<h4>University/College/School</h4>
			<p><%=rd.getClguniv()%></p>
			<h4>Degree</h4>
			<p><%=rd.getClasscourse()%></p>
			<h4>Graduation Year</h4>
			<p><%=rd.getPassingyear()%></p>
			<h4>Percentage,CGPA,AGPA</h4>
			<p><%=rd.getPercentage()%></p>
		</div>

		<div class="skills">
			<h2>Skills</h2>
			<ul>
				<li><%=rd.getSkills1()%></li>
				<li><%=rd.getSkills2()%></li>
				<li><%=rd.getSkills3()%></li>
				<li><%=rd.getSkills4()%></li>
				<li><%=rd.getAllskills()%></li>
			</ul>
		</div>

		<div class="experience">
			<h2>Work Experience</h2>
			<h4>
				Company Name :-
				<%=rd.getCompanyname()%></h4>
			<p>
				Work Done :-
				<%=rd.getWorkdone()%></p>
			<h4>
				Company Name2 :-
				<%=rd.getCompanyname2()%></h4>
			<p>
				Work Done2 :-
				<%=rd.getWorkdone2()%></p>
		</div>
		<center>
			<button>
				<h3>
					<a href="resumedownload/<%=rd.getEmail()%>">Download</a>
				</h3>
			</button>
		</center>
	</div>
</body>
</html>
