package frontController;

import java.io.IOException;

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
		FrontCommand command = getCommand(request);
		command.init(getServletContext(), request, response);
		command.process();
	}

	private FrontCommand getCommand(HttpServletRequest request) {
		FrontCommand frontCommand = null;
		try {
			frontCommand = (FrontCommand) getCommandClass(request)
					.newInstance();
		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
		return frontCommand;
	}

	@SuppressWarnings("rawtypes")
	private Class getCommandClass(HttpServletRequest request) {
		Class result = null;
		final String commandClassName = "frontController."
				+ (String) request.getParameter("command") + "Command";
		try {
			result = Class.forName(commandClassName);
		} catch (ClassNotFoundException e) {
			System.out.println("Error occured: " + e);
		}
		return result;
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
