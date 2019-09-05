<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp" method="post" modelAttribute="forRegisterId">
<center>
<marquee><h1>Thank you for Registering</h1></marquee><br><br>
<tr>
				<td>Registration id is:</td>
				<td>${forRegisterId}</td>
			</tr><br><br>
<input type="submit" value="login">
</center>
</form>
</body>
</html>