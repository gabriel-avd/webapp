<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<p><font color="red">${errorMessage}</font></p>

<form action="/webapp/login.do" method="post">
	Name: <input type="text" name="name"/>
	Password: <input type="password" name="password"/>
	<input type="submit" value="login"/>
</form>

</body>
</html>

<!--  valid user -> welcome.jsp -->
<!--  invalid user -> welcome.jsp -->