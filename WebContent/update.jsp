<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Your Details!</title>
<style type="text/css">
body {
	background:
		url("https://images.pexels.com/photos/46253/mt-fuji-sea-of-clouds-sunrise-46253.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
	background-repeat: no repeat;
	background-size: 1366px 768px;
	color: white;
}
</style>

</head>
<body bgcolor="violet">
	<form action="update.do" method="post">
		<center>
		<h1>You Should enter the same name as you have entered previously</h1>
			<table>
				<!--  <tr>
					<td><label for="Employee Id">Enter Your Id:</label></td>
					<td><input type="number" id="id" name="id"></td>
				</tr> -->
				<tr>
					<td><label for="Employee Name">Enter Your Name:</label></td>
					<td><input type="text" id="name" name="name"></td>
				</tr>
				<tr>
					<td><label for="Employee Password">Enter Your
							Password:</label></td>
					<td><input type="password" id="password" name="password"></td>
				</tr>

				<tr>
					<td><label for="Employee Email">Enter Your Email:</label></td>
					<td><input type="email" id="email" name="email"></td>
				</tr>
				<tr>
					<td><label for="Employee Location">Enter Your
							Location:</label></td>
					<td><input type="text" id="location" name="location"></td>
				</tr>

				<tr>
					<td><label for="Employee PhoneNumber">Enter Your
							Mobile Number:</label></td>
					<td><input type="number" id="phoneNumber" name="phoneNumber"></td>
				</tr>

				<tr>
					<td><label for="Employee Date Of Birth">Enter Your
							Date Of Birth:</label></td>
					<td><input type="date" id="dob" name="dob"></td>
				</tr>
				<tr>
					<td><label for="Employee Alternate Phone">Enter Your
							Alternate Mobile Number:</label></td>
					<td><input type="number" id="alternatePhone"
						name="alternatePhone"></td>
				</tr>
				<tr>
					<td><label for="Employee Alternate Email">Enter Your
							Alternate Email:</label></td>
					<td><input type="email" id="alternateEmail"
						name="alternateEmail"></td>
				</tr>
				<tr>
					<td><label for="Employee Gender">Enter Your Gender:</label></td>
					<td><select id="gender" name="gender"><option
								value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Others">Others</option></select></td>
				</tr>
				<tr>
					<td><label for="Employee Age">Enter Your Age:</label></td>
					<td><input type="number" id="age" name="age"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit Details"
						style="margin-left: 50%; margin-top: 12%"></td>
					<td><a href="loginemp.jsp">Login Here</a></td>
				</tr>


			</table>
		</center>


	</form>



</body>
</html>