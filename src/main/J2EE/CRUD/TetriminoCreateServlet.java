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
 * Servlet implementation class TetriminoCreateServlet
 */
@WebServlet("/TetriminoCreateServlet")
public class TetriminoCreateServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Tetrimino t = new Tetrimino("nom", "couleur");

		@SuppressWarnings("unchecked")
		HashMap<String, Tetrimino> listeTetrimino = (HashMap<String, Tetrimino>) request.getServletContext()
				.getAttribute("listeTetrimino");
		listeTetrimino.put(t.getId(), t);
		
		request.getServletContext().setAttribute("listeTetrimino", listeTetrimino);
		
		request.setAttribute("id", t.getId());
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetriminoCreate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
