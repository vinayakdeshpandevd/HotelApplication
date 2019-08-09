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
<h1>Properties List</h1>  
<form action = "customerReq" >
<table border="5" cellpadding= '8' >
<tr>
<th>Select</th>
<th>Property Id</th>
<th>Property Name</th>
<th>Property Area</th>
 
</tr>  
   <c:forEach var="property" items="${hotel}">
   <tr> 
    
   
   <td><input type = "radio" name = "propertyId" value = "${property.propertyId}" ></td>
   <td>${property.propertyId}</td>
   <td>${property.propertyName}</td>  
    <td>${property.address.areaName}</td>
  
 
   
   </tr>  
   </c:forEach>  
   </table>
   <br>
   <br>
   
      <input type = "submit" name = "action" value = "Select Property"> 
     <!--  <input type = "submit" name = "action" value = "delete">   -->
   
    
  <!--  <a href="propReg">Add more Properties</a>  -->
   
   </center>
</body>
</html>