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
 * Servlet implementation class ControladorModificarCliente
 */
@WebServlet("/ControladorModificarCliente")
public class ControladorModificarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorModificarCliente() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModeloCliente modeloCliente = new ModeloCliente();
		Cliente cliente = new Cliente();
		int codCliente = Integer.parseInt(request.getParameter("codCliente"));
		
		cliente = modeloCliente.verCliente(codCliente);
		
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("ModificarCliente.jsp").forward(request, response);
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
		
		int codCliente = Integer.parseInt(request.getParameter("codCliente"));
		String dniCif = request.getParameter("dniCif");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String contrasena = request.getParameter("contrasena");

		cliente.setCodCliente(codCliente);
		cliente.setDniCif(dniCif);
		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		cliente.setContrasena(contrasena);

		modeloCliente.modificarCliente(cliente);

	} catch (Exception e) {
		String MensajeError= "ERROR";
		request.setAttribute("MensajeError", MensajeError);
		request.getRequestDispatcher("ModificarCliente.jsp").forward(request, response);
	}
	response.sendRedirect("ControladorHome");

	
	}

}
