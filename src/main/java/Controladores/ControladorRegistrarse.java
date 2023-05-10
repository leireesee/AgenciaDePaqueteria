package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCliente;
import modelo.dto.Cliente;

/**
 * Servlet implementation class ControladorRegistrarse
 */
@WebServlet("/ControladorRegistrarse")
public class ControladorRegistrarse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorRegistrarse() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("InsertarCliente.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		Cliente cliente = new Cliente();
		ModeloCliente modeloCliente = new ModeloCliente();

		String dniCif = request.getParameter("dniCif");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String contrasena = request.getParameter("contrasena");

		cliente.setDniCif(dniCif);
		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		cliente.setContrasena(contrasena);

		modeloCliente.insertarCliente(cliente);

		// hay que poner se ha realizado con exito
		} catch (Exception e) {
			String MensajeError= "ERROR";
			request.setAttribute("MensajeError", MensajeError);
			request.getRequestDispatcher("InsertarCliente.jsp").forward(request, response);
		}
		
		request.getRequestDispatcher("Home.jsp").forward(request, response);

	}

}
