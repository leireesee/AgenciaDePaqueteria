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
import modelo.dto.Envio;

/**
 * Servlet implementation class ControladorVistaEmpleado
 */
@WebServlet("/ControladorVistaEmpleado")
public class ControladorVistaEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVistaEmpleado() {
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
		request.setAttribute("envios", envios);
		HttpSession session=request.getSession();
		request.setAttribute("empleado", session.getAttribute("empleado"));
		request.getRequestDispatcher("VistaEmpleado.jsp").forward(request, response);
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
