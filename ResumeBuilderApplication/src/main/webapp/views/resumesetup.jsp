<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
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
<%
	String fname = request.getParameter("fname");
	request.setAttribute("fname", fname);
	String lname = request.getParameter("lname");
	request.setAttribute("lname", lname);
	String resumry = request.getParameter("resumry");
	request.setAttribute("resumry", resumry);
	String rehead = request.getParameter("rehead");
	request.setAttribute("rehead", rehead);
	String add = request.getParameter("add");
	request.setAttribute("add", add);
	String pcode = request.getParameter("pcode");
	request.setAttribute("pcode", pcode);
	String nat = request.getParameter("nat");
	request.setAttribute("nat", nat);
	String dob = request.getParameter("dob");
	request.setAttribute("dob", dob);
	String mno = request.getParameter("mno");
	request.setAttribute("mno", mno);
	String eml = request.getParameter("eml");
	request.setAttribute("eml", eml);
	String cus = request.getParameter("cus");
	request.setAttribute("cus", cus);
	String eop = request.getParameter("eop");
	request.setAttribute("eop", eop);
	String cc = request.getParameter("cc");
	request.setAttribute("cc", cc);
	String pstg = request.getParameter("pstg");
	request.setAttribute("pstg", pstg);
	String skills1 = request.getParameter("skills1");
	request.setAttribute("skills1", skills1);
	String skills2 = request.getParameter("skills2");
	request.setAttribute("skills2", skills2);
	String skills3 = request.getParameter("skills3");
	request.setAttribute("skills3", skills3);
	String skills4 = request.getParameter("skills4");
	request.setAttribute("skills4", skills4);
	String allskills = request.getParameter("allskills");
	request.setAttribute("allskills", allskills);
	String cnm = request.getParameter("cnm");
	request.setAttribute("cnm", cnm);
	String wrdn = request.getParameter("wrdn");
	request.setAttribute("wrdn", wrdn);
	String cnm2 = request.getParameter("cnm2");
	request.setAttribute("cnm2", cnm2);
	String wrdn2 = request.getParameter("wrdn2");
	request.setAttribute("wrdn2", wrdn2);
	%>

	<div class="resume-container">
		<header>
			<h1><%=fname%><%=lname %></h1>
			<p><%=rehead %></p>
		</header>
		<p><%=resumry %></p>
		<div class="contact-info">
		
		<p>Address: <%=add %>, <%=pcode %> </p>
		<p>Nationality: <%=nat %></p>
		<p>DOB: <%=dob %></p>
		<p>Phone: <%= mno%></p>
	    <p>Email: <%= eml %></p>
	    			
		</div>

		<div class="education">
			<h2>Education</h2>
			<h4>University/College/School </h4>
			<p><%=cus %></p> 
			<h4>Degree</h4>
			<p><%=cc %></p>
			<h4>Graduation Year</h4>
			<p><%=eop %></p>
			<h4>Percentage,CGPA,AGPA</h4>
			<p><%=pstg %></p>
		</div>
		
		<div class="skills">
			<h2>Skills</h2>
			<ul>
				<li><%=skills1 %></li>
				<li><%=skills2 %></li>
				<li><%=skills3 %></li>
				<li><%=skills4 %></li>
				<li><%=allskills %></li>
			</ul>
		</div>

		<div class="experience">
			<h2>Work Experience</h2>
			<h4>Company Name :- <%=cnm %></h4>
			<p>Work Done :- <%=wrdn %></p>
			<h4>Company Name2 :- <%=cnm2 %></h4>
			<p>Work Done2 :- <%=wrdn2 %></p>
		</div>
	</div>

	<form action="resumedownload" method="post">
		<input type="hidden" id="fname" name="fname" value=<%=fname%>> <input
			type="hidden" id="lname" name="lname" value=<%=lname%>><input
			type="hidden" id="rehead" name="rehead" value=<%=rehead%>> <input
			type="hidden" id="resumry" name="resumry" value=<%=resumry%>> <input
			type="hidden" id="add" name="add" value=<%=add%>> <input
			type="hidden" id="pcode" name="pcode" value=<%=pcode%>> <input
			type="hidden" id="nat" name="nat" value=<%=nat%>> <input
			type="hidden" id="dob" name="dob" value=<%=dob%>> <input
			type="hidden" id="mno" name="mno" value=<%=mno%>> <input
			type="hidden" id="eml" name="eml" value=<%=eml%>> <input
			type="hidden" id="cus" name="cus" value=<%=cus%>> <input
			type="hidden" id="eop" name="eop" value=<%=eop%>> <input
			type="hidden" id="cc" name="cc" value=<%=cc%>> <input
			type="hidden" id="pstg" name="pstg" value=<%=pstg%>> <input
			type="hidden" id="skills1" name="skills1" value=<%=skills1%>> <input
			type="hidden" id="skills2" name="skills2" value=<%=skills2%>> <input
			type="hidden" id="skills3" name="skills3" value=<%=skills3%>> <input
			type="hidden" id="skills4" name="skills4" value=<%=skills4%>> <input
			type="hidden" id="allskills" name="allskills" value=<%=allskills%>> <input
			type="hidden" id="cnm" name="cnm" value=<%=cnm%>> <input
			type="hidden" id="wrdn" name="wrdn" value=<%=wrdn%>><input
			type="hidden" id="cnm2" name="cnm2" value=<%=cnm2%>><input
			type="hidden" id="wrdn2" name="wrdn2" value=<%=wrdn2%>>
		<button type="submit" value="submit">Download</button>
	</form>
	
</body>
</html>
