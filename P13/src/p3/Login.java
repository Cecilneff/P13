package p3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
doGet(request, response);
		
		String nombre=request.getParameter("Nombre");
		String clave=request.getParameter("clave");
		String url="";
		
		if (checkAdmin(nombre,clave)) {
			url="/WEB-INF/admin.jsp";
		}
		else url ="/WEB-INF/registro.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	public boolean checkAdmin(String nombre, String clave) {
		if (nombre.equals("fjnh") && clave.equals("1234"))
		return true;
		 else 
			return false;
		
	}

}
