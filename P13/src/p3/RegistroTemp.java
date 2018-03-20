package p3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class RegistroTemp
 */
@WebServlet("/RegistroTemp")
public class RegistroTemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroTemp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession sesion = request.getSession(true);
		String uID=request.getParameter("DNI");
		//Cookie c = Cookie("idCookie",uID);
		
		
		
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("Nombre");
		String ape=request.getParameter("Apellido");
		String dni=request.getParameter("DNI");
		UserTemporales UserT = new UserTemporales (name,ape,dni);
		request.setAttribute("UserT", UserT);
		String url="/WEB-INF/Welcome.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
