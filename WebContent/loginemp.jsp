<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login!!</title>
<style type="text/css">
body {
	text-align: center; margin-left : auto;
	margin-bottom: auto;
	margin-top: auto;
	margin-right: auto;
	background:
		url("https://images.pexels.com/photos/1054218/pexels-photo-1054218.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
	background-repeat: no repeat;
	background-size: 1366px 768px;
	color: black;
	margin-left: auto;
}
</style>
</head>
<body bgcolor="white">
	<form action="login.do" method="post">
		<center>
			<h2>Employee Login Page</h2>
			<table>
				<tr>
					<td>Enter UserName:</td>
					<td><input type="text" name="userName" id="userName"></td>
				</tr>
				<tr>
					<td>Enter Your Email:</td>
					<td><input type="email" name="email" id="email"></td>
				</tr>
				<tr>
					<td>Enter Your Password:</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Login" style="margin-left: 75%"></td>
				</tr>





			</table>

		</center>

	</form>

</body>
</html>