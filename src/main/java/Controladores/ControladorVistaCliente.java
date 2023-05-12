package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.ModeloEnvio;
import modelo.dto.Cliente;
import modelo.dto.Envio;

/**
 * Servlet implementation class ControladorVistaCliente
 */
@WebServlet("/ControladorVistaCliente")
public class ControladorVistaCliente extends HttpServlet {
	/***
	 * Este controlador se encarga de visualizar la vista cliente al que le pasamos tambien un arrayList de clientes para que se vea en
	 * la vista.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVistaCliente() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Cliente cliente = (Cliente) session.getAttribute("cliente");

		ModeloEnvio modeloEnvio = new ModeloEnvio();

		ArrayList<Envio> envios = null;
		envios = modeloEnvio.verEnviosPersonal(cliente.getCodCliente());
		modeloEnvio.cerrarConexion();
		request.setAttribute("envios", envios);
		request.getRequestDispatcher("VistaCliente.jsp").forward(request, response);

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
