package frontController;

import java.io.IOException;

import javax.servlet.ServletException;

import modelObjects.Artist;
import modelObjects.ArtistHelper;

public class ArtistCommand extends FrontCommand {

	@Override
	public void process() throws ServletException, IOException {
		Artist artist = Artist.findNamed(request.getParameter("name"));
		request.setAttribute("helper", new ArtistHelper(artist));
		forward("/artist.jsp");
	}

}
