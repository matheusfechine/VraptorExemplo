<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
${msg} 
${usuario.login}
${opcional}
<form action="/VraptorExemplo/usuario/login" method="post" name="form">
<table>
<tr>
	<td>Login: </td>
	<td><input type="text" name="usuario.login" /> </td>
</tr>

<tr>
	<td>Senha: </td>
	<td><input type="password" name="usuario.senha" /></td>
</tr>
<tr>
	<td><input type="submit"/> </td>
	<td></td>
</tr>
</table>
</form>
</body>
</html>