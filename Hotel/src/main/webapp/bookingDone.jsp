<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "paymentPage.jsp" >
<center>
<h2>Check Details and go for Payment</h2><br>
<table border="5" cellpadding= '8' >  
<tr>
 
<th>Attributes</th>
<th>Details</th>
 
 
</tr>  
 <tr>
   <td>Booking Id</td>
    <td>${booking.bookingId}</td>
     
   </tr>  
  
  <tr>
   <td>Property Name</td>
    <td>${hotel.propertyName}</td>
     
   </tr>  
   <tr>
   <td>First name</td>
    <td>${register.firstname}</td>
     </tr> 
     <tr>
   <td>Last name</td>
    <td>${register.lastname}</td>
     </tr>  
     <tr>
   <td>Phone no.</td>
    <td>${register.phone}</td>
     </tr> 
     <tr>
   <td>Aadhar no.</td>
    <td>${register.aadhar}</td>
     </tr> 
      <tr>
   <td>Room Type</td>
    <td>${booking.roomType}</td>
     
   </tr>  
    <tr>
   <td>Number of Adults</td>
    <td>${booking.numberOfAdults}</td>
     
   </tr>  
    <tr>
   <td>Number of Children</td>
    <td>${booking.numberOfChildren}</td>
     
   </tr>  
   
   </table>
   <br><br>
   <input type="submit" value="Go to Payments">
 
  <%--  <c:forEach var="register" items="${register}">   
   <tr> 
    <td>${register.firstname}</td>
   <td>${register.lastname}</td>  
    <td>${register.phone}</td>
  </tr>  
   </c:forEach> <br>  --%>

</center>
</form>
</body>
</html>