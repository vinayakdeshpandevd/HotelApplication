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

<center>
<h1>TT Properties</h1>  
<form action = " " method = "get">
<table border="5" cellpadding= '8' >
<tr>
<th>Select</th>
<th>Property Id</th>
<th>Property Name</th>
<th>Property Code</th>
<th>Star Rating</th>
<th>Max. Rooms Available</th>
<th>Property City</th>
<th>Address</th>
</tr>  
   <c:forEach var="property" items="${hotel}">
   <tr> 
    
   
   <td><input type = "radio" name = "key" value = "${property.propertyId}" ></td>
   <td>${property.propertyId}</td>
   <td>${property.propertyName}</td>
   <td>${property.propertyCode}</td>
   <td>${property.starRating}</td>  
   <td>${property.maxRoomsAvailable}</td>  
   <td>${property.pcity}</td>
   <td>${property.address.plotNo},${property.address.areaName},${property.address.city},${property.address.state},${property.address.pin}</td>
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <!-- <br>
      <input type = "submit" name = "action" value = "update"> 
      <input type = "submit" name = "action" value = "delete">  
   <br/>   -->
    
   <a href="propReg">Add more Properties</a> <br><br>
   </form>
   <form action="adminHome.jsp">
   <input type="submit" value="Home">
   </form>
   
   </center>
</body>
</html>