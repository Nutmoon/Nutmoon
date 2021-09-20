<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.app.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<%
	List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	%>
	<div>
		<a href="student-add-details.jsp">Add Student</a>
	</div>

	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Birth Date</th>
			<th>Email</th>
			<th>Phone</th>
			<th>City</th>
			<th>Country</th>
			<th>Course</th>
			<th>Action</th>
		</tr>
		<%
		for (int i = 0; i < students.size(); i++) {
		%>
		<tr>
			<td><%=students.get(i).getFirstname()%></td>
			<td><%=students.get(i).getLastname()%></td>
			<td><%=dateFormat.format(new Date(students.get(i).getBdate()))%></td>
			<td><%=students.get(i).getEmail()%></td>
			<td><%=students.get(i).getPhone()%></td>
			<td><%=students.get(i).getCity()%></td>
			<td><%=students.get(i).getCountry()%></td>
			<td><%=students.get(i).getCourse()%></td>
			<td><a
				href="edit-student-redirect?studentId=<%=students.get(i).getStudentId()%>">Edit</a></td>
			<td><a href="javascript:void(0)"
				onclick="deleteStud(<%=students.get(i).getStudentId()%>);">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
<!-- 
<form name="myform" action="/student-delete"></form> -->
<script>
function editStud(){
	window.open("student-edit-details.jsp","pageName");
	
}
function deleteStud(studentId){
	/* window.open("student-delete-details.jsp","pageName"); */
	alert("Confirm Delete?");
	/* document.forms["myform"].submit(); */
}
</script>
</html>