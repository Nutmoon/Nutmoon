<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@page import="com.app.bean.StudentBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.app.bean.StudentBeanAddData"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>		
<%
	StudentBeanAddData student = (StudentBeanAddData) request.getAttribute("student");
	SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
	Date bDate=new Date(student.getBdate());
	String bparsedate=dateF.format(bDate);
%>
	<form action="edit-student-redirect" method="post">
	
		First Name: <input type="text" name="firstname" placeholder="First name" value="<%= student.getFirstname()%>" required autofocus style="margin-bottom: 10px"> <br> 
		Last Name: <input type="text" name="lastname" placeholder="Last name" value="<%= student.getLastname() %>" required autofocus style="margin-bottom: 10px"> <br> 
		Birth Date: <input type="date" name="bdate" placeholder="From Date"  value="<%=bparsedate %>" style="margin: 7px"><br>
		E-mail: <input type="email" id="email" name="email" title="Enter email" placeholder="Email" value="<%= student.getEmail() %>" required style="margin-bottom: 10px" /><br>
		Phone Number:<input type="tel" name="phone" pattern="[0-9]{10}" title="Enter mobile number"  placeholder="xxxx-xx-xxxx" value="<%= student.getPhone() %>" /><br>
		<p><b>Gender</b>
		<%if(student.getGender()==0){ %>																
			<input type="radio" id="gender_other" name="gender" value="0" checked="checked"/><label for="gender_other">Other</label>
			<input type="radio" id="gender_male" name="gender" value="1"/><label for="gender_male">Male</label>
			<input type="radio" id="gender_female"  name="gender" value="2"/><label for="gender_female">Female</label><br>
		<%}else if(student.getGender()==1){ %>
			<input type="radio" id="gender_other" name="gender" value="0"/><label for="gender_other">Other</label>
			<input type="radio" id="gender_male" name="gender" value="1" checked="checked"/><label for="gender_male">Male</label>
			<input type="radio" id="gender_female"  name="gender" value="2"/><label for="gender_female">Female</label><br>
		<%}else{ %>
			<input type="radio" id="gender_other" name="gender" value="0"/><label for="gender_other">Other</label>
			<input type="radio" id="gender_male" name="gender" value="1"/><label for="gender_male">Male</label>
			<input type="radio" id="gender_female"  name="gender" value="2" checked="checked"/><label for="gender_female">Female</label><br>
		<%} %>
		</p>
		<div style="margin-bottom: 10px"></div>
		<div style="margin-bottom: 10px">AddressLine1 </div> <textarea name="addressLine1" placeholder="Address" val<%= student.getAddressLine1() %> rows="2" cols="30" style="margin-bottom: 10px">	</textarea><br>
		<div style="margin-bottom: 10px">AddressLine2 </div> <textarea name="addressLine2" placeholder="Address" value="<%= student.getAddressLine2() %>"  rows="2" cols="30" style="margin-bottom: 10px">	</textarea><br>	
		<label>City:</label>
		<select name="city" style="margin-bottom: 10px">
			<option value="Bhavnagar">Bhavnagar</option>
			<option value="Surat">Surat</option>
			<option value="Rajkot">Rajkot</option> 
		</select>
		<label>Country:</label>
		<select name="country" style="margin-bottom: 10px">
			<option value="India">India</option>
			<option value="UAS">UAS</option>
			<option value="UK">UK</option> 
		</select>
		<br>
		<label>Course:</label>
		<select name="course">
		<option value="Technical">Technology</option>
		<option value="Biology">Biology</option>
		<option value="Science">Science</option> 
		</select>
		<br>
		<div style="margin-bottom: 10px"></div>	
		<!-- 	<label style="margin-bottom: 10px">Upload Photo:</label>
		  <input type="file" name="file"/> -->

		<div style="margin-bottom: 10px"></div>
		<input type="submit">

	</form>
<script>
	var studentCity='<%=student.getCity()%>';
	window.onload = function() {
		document.getElementsByName("city")[0].value=studentCity;
	};
</script>
</body>
</html>