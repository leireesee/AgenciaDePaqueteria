package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.ModeloCliente;
import modelo.dao.ModeloEmpleado;
import modelo.dto.Cliente;
import modelo.dto.Empleado;

/**
 * Servlet implementation class ControladorLoginEmpleados
 */
@WebServlet("/ControladorLoginEmpleados")
public class ControladorLoginEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorLoginEmpleados() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("InicioSesionEmpleado.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloEmpleado modeloEmpleado = new ModeloEmpleado();

		String dni = request.getParameter("dni");
		String contrasena = request.getParameter("contrasena");

		Empleado empleado = modeloEmpleado.verificar(dni, contrasena);
		modeloEmpleado.cerrarConexion();
		String empleadoCateg = "Administrador";

		if (empleado.getDni() != null) {
			if (empleado.getCategoria().equals(empleadoCateg)) {
				HttpSession sesion = request.getSession();
				sesion.setAttribute("empleado", empleado);
				request.getRequestDispatcher("ControladorVistaAdmin").forward(request, response);
			}else {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("empleado", empleado);
			request.getRequestDispatcher("ControladorVistaEmpleado").forward(request, response);
			}

		} else {
			request.getRequestDispatcher("InicioSesionEmpleado.jsp").forward(request, response);

		}

	}

}
