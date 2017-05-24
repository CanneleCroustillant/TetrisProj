<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Accueil.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue sur TetrisGame</title>
</head>
<body>
<h1> Tetris - Bienvenu</h1>
<ul>
<li><a href="/TetrisProj/home">Accueil</a></li>
<li><a href="tetrimino.jsp">Tetriminos</a></li>
</ul>
<h2>Bienvenue ${param.username} !</h2>
<form action="logout" method="POST" >
<input type="submit" value="se deconnecter">
</form>
</body>
</html>