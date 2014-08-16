package actionController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlbumController
 */
@WebServlet("/AlbumController")
public class AlbumController extends ActionServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlbumController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Get model objects
		Album album = Album.findNamed(request.getParameter("name"));

		if (album == null) {
			forward("/MissingArtistError.jsp", request, response);

		} else {
			// forward to album.jsp / rockalbum.jsp based on model instance rather than helper object
			request.setAttribute("helper", album);
			if (album instanceof RockAlbum) {
				forward("/rockalbum.jsp", request, response);
			} else {
				forward("/album.jsp", request, response);

			}
		}
	}

}
