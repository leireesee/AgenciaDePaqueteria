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
import modelo.dao.ModeloPaquete;
import modelo.dto.Carta;
import modelo.dto.Empleado;
import modelo.dto.Paquete;

/**
 * Servlet implementation class ControladorBulto
 */
@WebServlet("/ControladorPaquete")
public class ControladorPaquete extends HttpServlet {
	/**
	 * se encarga de insertar un paquete en la base de datos 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorPaquete() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		ModeloBulto modeloBulto = new ModeloBulto();
//		ModeloPaquete modeloPaquete = new ModeloPaquete();
//		ArrayList<Bulto> bultos = modeloBulto.verBultos(modeloPaquete.verPaquete(request.getParameter("cod_paquete")));
//		request.setAttribute("bultos", bultos);
//		
		request.getRequestDispatcher("InsertarPaquete.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ModeloEnvio modeloEnvio = new ModeloEnvio();
			ModeloPaquete modeloPaquete = new ModeloPaquete();

			Paquete paquete = new Paquete();

			String tamano = request.getParameter("tamano");
			double peso = Double.parseDouble(request.getParameter("peso"));

			paquete.setCodEnvio(modeloEnvio.recibirUltimoCodigo());
			paquete.setPeso(peso);
			paquete.setTamano(tamano);

			modeloPaquete.insertarPaquete(paquete);
			modeloPaquete.cerrarConexion();
		} catch (Exception e) {
			String MensajeError = "ERROR";
			request.setAttribute("MensajeError", MensajeError);
			request.getRequestDispatcher("InsertarCliente.jsp").forward(request, response);
		}
		HttpSession session = request.getSession();
		Empleado empleado = (Empleado) session.getAttribute("empleado");
		if (empleado.getCategoria().equals("Administrador")) {
			response.sendRedirect("ControladorVistaAdmin");
		} else {
			response.sendRedirect("ControladorVistaEmpleado");

		}

	}

}
