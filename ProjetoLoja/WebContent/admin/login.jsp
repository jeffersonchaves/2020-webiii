<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>login</h1>
	
	<p>${mensagemErro}</p>

	<form action="/app/login">
	
		<input type="text" name="inputLogin" />
		<br />
		<input type="password" name="inputSenha" />
		
		<input type="submit" />
	</form>


</body>
</html>