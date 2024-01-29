<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
  String user=(String)session.getAttribute("unm");
 if(user =="" || user==null)
 {
	 response.sendRedirect("login");
 }
%>
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
	<form action="/resumesetup" method="post">
	<center><label><h1>PERSONAL INFORMATION</h1></label></center>
	<center>
	
	<div>
		<label for="fname">Your Firstname</label>&nbsp;&nbsp;<input type="text" id="fname" name="fname" placeholder="Your FirstName" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
		<label for="lname">Your LastName</label>&nbsp;&nbsp;<input type="text" id="lname" name="lname" placeholder="Your LastName" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
    </div>	<br><br>
    
    <div>
		<label for="rehead">Your position like Developer</label>&nbsp;&nbsp;<input type="text" id="rehead" name="rehead" placeholder="Your position like Developer" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
		<label for="resumry">Resume Summary</label>&nbsp;&nbsp;<input type="text" id="resumry" name="resumry" placeholder="Resume Summary" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
    </div>	<br><br>
    
	<div>
		<label for="add">Your Full Address</label>&nbsp;&nbsp;<input type="text" id="add" name="add" placeholder="Your Full Address" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			
		<label for="pcode">Postal code</label>&nbsp;&nbsp;<input type="text" id="pcode" name="pcode" placeholder="Postal Code" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </div><br><br>
   
   <div> 
        <label for="nat">Nationality</label>&nbsp;&nbsp;<input type="text" id="nat" name="nat" placeholder="Nationality" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

        <label for="dob">Date of Birth</label>&nbsp;&nbsp;<input type="text" id="dob" name="dob" placeholder="Date of Birth" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </div>    <br><br>
   
   <div>
         <label for="mno">Contact</label>&nbsp;&nbsp;<input type="text" id="mno" name="mno" placeholder="Contact" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="eml">Email</label>&nbsp;&nbsp;<input type="email" id="eml" name="eml" placeholder="Email" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <center><label><h1>QUALIFICATIONS</h1></label></center>
   
    <div>
         <label for="cus">College/University/School</label>&nbsp;&nbsp;<input type="text" id="cus" name="cus" placeholder="College/University/School" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="eop">Year Of Passing</label>&nbsp;&nbsp;<input type="text" id="eop" name="eop" placeholder="Year Of Passing" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <div>
         <label for="cc">Course/Class</label>&nbsp;&nbsp;<input type="text" id="cc" name="cc" placeholder="Course/Class" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="pstg">Percentage/CGPA/AGPA</label>&nbsp;&nbsp;<input type="text" id="pstg" name="pstg" placeholder="Percentage/CGPA/AGPA" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <center><label><h1>Skills</h1></label></center>
   
   <div>
         <label for="skills1">Skill 1</label>&nbsp;&nbsp;<input type="text" id="skills1" name="skills1" placeholder="Skill 1" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="skills2">Skill 2</label>&nbsp;&nbsp;<input type="text" id="skills2" name="skills2" placeholder="Skill 2" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
    <div>
         <label for="skills3">Skill 3</label>&nbsp;&nbsp;<input type="text" id="skills3" name="skills3" placeholder="Skill 3" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="skills4">Skill 4</label>&nbsp;&nbsp;<input type="text" id="skills4" name="skills4" placeholder="Skill 4" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <div>
   <label for="allskills">If you have remaining skills so type here.....</label>&nbsp;&nbsp;<textarea rows="2" cols="40" name="allskills">If you have remaining skills so type here.....</textarea>
    </div><br><br>
   
    <center><label><h1>WORK EXPERIENCE</h1></label></center>
   
   <div>
         <label for="cnm">Company Name</label>&nbsp;&nbsp;<input type="text" id="cnm" name="cnm" placeholder="Company Name" > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="wrdn">Work Done</label>&nbsp;&nbsp;<input type="text" id="wrdn" name="wrdn" placeholder="Work Done" > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <div>
         <label for="cnm2">Company Name</label>&nbsp;&nbsp;<input type="text" id="cnm2" name="cnm2" placeholder="Company Name " > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
        <label for="wrdn2">Work Done</label>&nbsp;&nbsp;<input type="text" id="wrdn2" name="wrdn2" placeholder="Work Done" > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
   </div>    <br><br>
   
   <div>
   <button type="submit" value="Submit">Generate Resume</button>
<!--    <button type="button" value="setup" ><a href="resumesetup">Generate Resume</a></button> -->
   </div>
   
	</form>
	
	<br>
		</center>
	<center>
	<label><h2>If your data is save </h2></label>
	<form action="/existdata" method="post">
	<div>
		<label for="fname">FirstName</label>&nbsp;&nbsp;<input type="text" id="fname" name="fname" placeholder="Firstname" required> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		<label for="lname">LastName</label>&nbsp;&nbsp;<input type="text" id="lname" name="lname" placeholder="LastName" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		<label for="email">Email</label>&nbsp;&nbsp;<input type="email" id="email" name="email" placeholder="Email" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
    </div>	<br><br>   
   <div>
   <button type="submit" value="Submit">GetResumeData</button>
   </div>
	</form>
	</center>
</body>
</html>