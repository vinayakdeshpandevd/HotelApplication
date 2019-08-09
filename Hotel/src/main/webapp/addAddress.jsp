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
<h3>Enter the Addresses<h3></h3>
 <form:form action = "addedAddress" method="post" modelAttribute="address">
  <table>  
			 
			<tr>
				<td>Plot No.</td>
				<td><form:input path="plotNo"/></td>
			</tr>
			
			<tr>
				<td>Area name</td>
				<td><form:input path="areaName"/></td>
            </tr>
            <tr>
				<td>City</td>
				<td><form:input path="city"/></td>
            </tr>
            <tr>
				<td>State</td>
				<td><form:input path="state"/></td>
            </tr>
            <tr>
				<td>Pin</td>
				<td><form:input path="pin"/></td>
            </tr>
                </table>
       <br>
			 
		  <input type="submit" value="Add"> 
</form:form><br>
<form action="adminHome.jsp">
<input type="submit" value="Home">
</form>
</center>
</body>
</html>