<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="viewPropByCity">
<center>
<p>Select City:<select name="city" required>
  <option value="Hyderabad">Hyderabad</option>
  <option value="Bangalore">Bangalore</option>
   <option value="Chennai">Chennai</option>
    <option value="Mumbai">Mumbai</option>
      <option value="Kolkata">Kolkata</option>
        <option value="Pune">Pune</option>
          <option value="Tirupati">Tirupati</option>
            <option value="Vishakhapatnam">Vishakhapatnam</option>
    </select></p>
<input type="date" name="FROM" required>
<input type="date" name="TO" required>
<input type="submit" value="Check available Properties">
</center>
</form>
</body>
</html>