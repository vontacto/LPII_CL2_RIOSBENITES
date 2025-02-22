package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// Validaci�n b�sica del formulario
		// Obtener los par�metros del formulario de login
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		// hacer las respectivas instancias....
		TblUsuariocl2 tblprod = new TblUsuariocl2();
		ClassUsuarioImp climp = new ClassUsuarioImp();

		// Llamar al m�todo ListadoUsuario para obtener la lista de usuarios
		// v�lidos
		List<TblUsuariocl2> usuarios = climp.ListadoUsuario();

		// Verificar si el usuario existe y la contrase�a es correcta
		boolean loginValido = false;

		for (TblUsuariocl2 user : usuarios) {
			if (user.getUsuariocl2().equals(usuario) && user.getPasswordcl2().equals(password)) {
				loginValido = true;
				break;
			}
		}

		// Si el login es v�lido, redirigir al usuario a la p�gina principal
		if (loginValido) {
			request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);	
		} else {
			// Si las credenciales son incorrectas
			request.getRequestDispatcher("/index.jsp").forward(request, response);	
		}

	}

}
