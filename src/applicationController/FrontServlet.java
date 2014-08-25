package applicationController;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */
@WebServlet("/FrontServlet")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 ApplicationController appController = getApplicationController(request);
	      String commandString = (String) request.getParameter("command");
	      DomainCommand comm =
	            appController.getDomainCommand(commandString, getParameterMap(request));
	      comm.run(getParameterMap(request));
	      String viewPage =
	            "/" + appController.getView(commandString, getParameterMap(request)) + ".jsp";
	      forward(viewPage, request, response);
	}

	protected void forward(String target, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

	private Map getParameterMap(HttpServletRequest request) {
		return null;
	}

	private ApplicationController getApplicationController(
			HttpServletRequest request) {
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
