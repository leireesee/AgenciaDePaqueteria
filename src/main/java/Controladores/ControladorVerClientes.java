package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCliente;
import modelo.dto.Cliente;
import modelo.dto.Envio;

/**
 * Servlet implementation class ControladorVerClientes
 */
@WebServlet("/ControladorVerClientes")
public class ControladorVerClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVerClientes() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloCliente modeloCliente = new ModeloCliente();

		ArrayList<Cliente> clientes = null;
		clientes = modeloCliente.verClientes();
		modeloCliente.cerrarConexion();
		request.setAttribute("clientes", clientes);
		request.getRequestDispatcher("VerClientes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
