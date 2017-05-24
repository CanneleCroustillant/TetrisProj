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
 * Servlet implementation class TetriminoDeleteServlet
 */
@WebServlet("/TetriminoDeleteServlet")
public class TetriminoDeleteServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String id = request.getParameter("id");
		@SuppressWarnings("unchecked")
		HashMap <String, Tetrimino> listeTetrimino = (HashMap<String, Tetrimino>) request.getServletContext().getAttribute("listeTetrimino");
		
		listeTetrimino.remove(id);
		
		request.getServletContext().setAttribute("listeTetrimmino", listeTetrimino);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/tetrimino.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
