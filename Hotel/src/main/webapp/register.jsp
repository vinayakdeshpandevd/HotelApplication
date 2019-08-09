<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Fill the Details

 <form:form action = "regDone" method="post" modelAttribute="register">
  <table>  
			 
			<tr>
				<td>Firstname</td>
				<td><form:input path="firstname"/></td>
			</tr>
			
			<tr>
				<td>Lastname</td>
				<td><form:input path="lastname"/></td>
            </tr>
            <tr>
				<td>Age</td>
				<td><form:input path="age"/></td>
            </tr>
            <tr>
				<td>Phone</td>
				<td><form:input path="phone"/></td>
            </tr>
            <tr>
				<td>Aadhar no.</td>
				<td><form:input path="aadhar"/></td>
			</tr>
			
             <tr>
				<td>Username</td>
				<td><form:input path="username"/></td>
            </tr>
             <tr>
				<td>Password</td>
				<td><form:input type="password"  path="password"/></td>
            </tr>


			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>