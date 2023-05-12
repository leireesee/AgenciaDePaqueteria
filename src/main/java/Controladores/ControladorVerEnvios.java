package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloEnvio;
import modelo.dto.Envio;

/**
 * Servlet implementation class ControladorVerEnvios
 */
@WebServlet("/ControladorVerEnvios")
public class ControladorVerEnvios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVerEnvios() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloEnvio modeloEnvio = new ModeloEnvio();
		ArrayList<Envio> envios = null;
		envios = modeloEnvio.verEnvios();
		modeloEnvio.cerrarConexion();
		String ordenar = request.getParameter("Ordenar");
		if (ordenar == null) {
			ordenar = "desc";
		}
		if (ordenar.equals("asc")) {
			envios = modeloEnvio.verEnviosASC();
		}
		request.setAttribute("ordenar", ordenar);
		request.setAttribute("envios", envios);
		request.getRequestDispatcher("VerEnvios.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
