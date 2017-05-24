package CRUD;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Object.Tetrimino;

/**
 * Servlet implementation class TetriminoUploadServlet
 */
@WebServlet("/TetriminoUpdateServlet")
public class TetriminoUpdateServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String nom = (String) request.getAttribute("nom");
		String couleur = (String) request.getAttribute("couleur");
		String id = (String) request.getAttribute("id");

		@SuppressWarnings("unchecked")
		HashMap<String, Tetrimino> listeTetrimino = (HashMap<String, Tetrimino>) request.getServletContext()
				.getAttribute("listeTetrimino");

		Tetrimino t = listeTetrimino.get(id);
		t.setColor(couleur);
		t.setName(nom);

		listeTetrimino.put(id, t);

		request.getServletContext().setAttribute("listeTetrimino", listeTetrimino);
	}

}
