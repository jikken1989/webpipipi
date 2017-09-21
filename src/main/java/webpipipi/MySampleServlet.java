package webpipipi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;




/**
 * Servlet implementation class MySampleServlet
 */
public class MySampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired

	private MyBean mybean1;


	@Override

	public void init() throws ServletException {
		// TODO Auto-generated method stub

			super.init();
			SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setAttribute("mybean", mybean1);
		request.getRequestDispatcher("/index.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String message = request.getParameter("message");
		mybean1.addMessage(message);
		response.sendRedirect("sample");

	}





}
