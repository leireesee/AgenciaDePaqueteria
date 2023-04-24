package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dto.Cliente;
import modelo.dao.ModeloCliente;

/**
 * Servlet implementation class LoginInicioS
 */
@WebServlet("/ControladorLoginInicioS")
public class ControladorLoginInicioS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorLoginInicioS() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("InicioSesion.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloCliente modeloCliente = new ModeloCliente();


		String dniCif = request.getParameter("dniCif");
		String contrasena = request.getParameter("contrasena");

		Cliente cliente = modeloCliente.verificar(dniCif,contrasena);
		
		if (cliente != null) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("cliente", cliente);
			request.getRequestDispatcher("ControladorHome").forward(request, response);
		}else {
			doGet(request, response);

		}

	}

}
