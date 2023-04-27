package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloBulto;
import modelo.dao.ModeloEnvio;
import modelo.dao.ModeloPaquete;
import modelo.dto.Bulto;
import modelo.dto.Carta;
import modelo.dto.Paquete;

/**
 * Servlet implementation class ControladorBulto
 */
@WebServlet("/ControladorBulto")
public class ControladorBulto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorBulto() {
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
		request.getRequestDispatcher("InsertarBulto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recibe parametros paquete
		ModeloPaquete modeloPaquete = new ModeloPaquete();
		ModeloEnvio modeloEnvio = new ModeloEnvio();

		int cantidadBultos = 1;
		Paquete paquete = (Paquete) modeloEnvio.verEnvio(modeloEnvio.recibirUltimoCodigo());

		paquete.setCantidadBultos(cantidadBultos);

		// insertar un paquete
		modeloPaquete.insertarPaqute(paquete);

		// recibe parametros bultos

		// inserta bulto

	}

}
