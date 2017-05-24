<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Tetris</title>
</head>
<body>
	<h1>Tetris - Liste des tetriminos</h1>
	<ul>
		<li><a href="/TetrisProj/home">Accueil</a></li>
		<li><a href="/TetrisProj/tetrimino">Tetriminos</a></li>
	</ul>
	
	
	<c:forEach items="${ listeTetrimino }" var="tetrimino">
    <tr>
        <td><c:out value="${ tetrimino.getName() }" /></td>
        <td><c:out value="${ tetrimino.getCouleur() }" /></td>
        <div class="liste_couleurs_tetris">
			<div class="couleur" id="tetri1">
				<a href="TetrisProj/TetriminoReadServlet" style="text-decoration: none"> Details</a> <br>
				<a href="TetrisProj/TetriminoDeleteServlet" style="text-decoration: none"> Retirer</a> <br>
				<a href="TetrisProj/TetriminoUpdateServlet" style="text-decoration: none"> Editer</a> <br>
			</div>
		</div>
    </tr>
</c:forEach>
	
</body>
</html>
