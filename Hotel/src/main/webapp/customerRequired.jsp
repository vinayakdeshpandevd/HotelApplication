 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Fill the Requirements

<form:form action = "bookingDone" method="post" modelAttribute="booking">
<input type="hidden" name="propertyId" value="${propertyId}">
  <table>  
               <tr>
               <td>Enter your id</td>
               <td><form:input path="registerId" name="registerId"/>
               </td>
               </tr>
			 <br>
			<tr>
				<td>Room Type</td>
				<td><form:select path="roomType">  
        <form:option value="Deluxe Room" label="Deluxe Room"/>  
        <form:option value="King Sized Room" label="King Sized Room"/>  
        <form:option value="Luxury Room" label="Luxury Room"/>  
        <form:option value="Budget Room" label="Budget Room"/>  
        </form:select>  </td>
			</tr>
			<br>
			<tr>
				<td>Number of Adults</td>
				<td><form:select path="numberOfAdults">  
        <form:option value="1" label="1"/>  
        <form:option value="2" label="2"/>  
        <form:option value="3" label="3"/>  
        <form:option value="4" label="4"/>  
        </form:select>  </td>
            </tr>
            <br>
            <tr>
				<td>Number of Children</td>
				<td><form:select path="numberOfChildren">  
        <form:option value="1" label="1"/>  
        <form:option value="2" label="2"/>  
        <form:option value="3" label="3"/>  
        <form:option value="4" label="4"/>  
        </form:select> </td>
            </tr>
            
<br><br>

			<tr>
				<td><input type="submit" value="Book"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>