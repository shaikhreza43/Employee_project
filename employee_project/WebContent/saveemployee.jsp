<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="pink">
<form action="saveemp.do" method="post">
<pre>
Employee Id:<input type="text" name="id" id="id">
Employee Name:<input type="text" name="name" id="name">
Employee Location:<input type="text" name="location" id="location">
Employee Email:<input type="email" name="email" id="email">
Employee Dob:<input type="date" name="dob" id="dob">
Employee Mobile:<input type="number" name="phoneNumber" id="phoneNumber">



<input type="submit" value="Save" >



</pre>

</form>



</body>
</html>