package actionController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArtistController
 */
@WebServlet("/ArtistController")
public class ArtistController extends ActionServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ArtistController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Get model objects
		Artist artist = Artist.findNamed(request.getParameter("name"));
		
		if (artist == null) {
			forward("/MissingArtistError.jsp", request, response);

		} else {
			// forward to artist.jsp & pass Helper object for dynamic logic
			request.setAttribute("helper", new ArtistHelper(artist));
			forward("/artist.jsp", request, response);
		}
	}

}
