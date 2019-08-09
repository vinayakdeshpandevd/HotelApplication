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
<h3>Enter the Property Details<h3></h3>
 <form:form action = "propRegDone" method="post" modelAttribute="hotel">
  <table>  
			 
			<tr>
				<td>Property Name</td>
				<td><form:input path="propertyName"/></td>
			</tr>
			
			<tr>
				<td>Property Code</td>
				<td><form:input path="propertyCode"/></td>
            </tr>
            <tr>
				<td>Star Rating</td>
				<td><form:input path="starRating"/></td>
            </tr>
            <tr>
				<td>Maximum Rooms Available</td>
				<td><form:input path="maxRoomsAvailable"/></td>
            </tr>
            <tr>
				<td>Property City</td>
				<td><form:input path="pcity"/></td>
            </tr>
                </table>
       <br>
			 
		  <input type="submit" value="Register"> 
</form:form><br>
<form action="adminHome.jsp">
<input type="submit" value="Home">
</form>
</center>
</body>
</html>