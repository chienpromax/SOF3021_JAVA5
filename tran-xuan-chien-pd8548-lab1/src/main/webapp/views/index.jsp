<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello spring boot</h1>
	<h2>${mes}</h2>
	<form action="create" method="post">
		<label for="">full name</label>
		<input type="text" name="name" />
		<label for="">password</label>
		<input type="text" name="pass" />
		<button type="submit">ok</button>
	</form>
</body>
</html>