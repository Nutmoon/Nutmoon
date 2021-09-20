<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	<%
	String errormessage = (String) request.getAttribute("errormessage");
	%>
	<h1>
		Error:
		<%=errormessage%></h1>
</body>
</html>