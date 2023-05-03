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
		
		//añadir bulto a paquete
		ModeloEnvio modeloEnvio = new ModeloEnvio();
		ModeloBulto modeloBulto = new ModeloBulto();
		ModeloPaquete modeloPaquete = new ModeloPaquete();
		
		//que haria oier
		Paquete paquete2 = modeloPaquete.verPaquete(modeloPaquete.recibirUltimoCodigoPaquete());
		
		paquete2.setCantidadBultos(paquete2.getCantidadBultos() + 1);
		
		modeloPaquete.modificarPaquete(paquete2);
		
		//no mas paquete2
		
		//hacer bulto
		
		String tamano = request.getParameter("tamano");
		int peso = Integer.parseInt(request.getParameter("peso"));
		
		Bulto bulto2 = new Bulto();
		
		bulto2.setEnvio(paquete2);
		bulto2.setPaquete(paquete2);
		bulto2.setPeso(peso);
		bulto2.setTamano(tamano);
		
		modeloBulto.insertarBulto(bulto2);
		
		//fin bulto oier
		
		
//		Paquete paquete = (Paquete) modeloEnvio.verEnvio(modeloEnvio.recibirUltimoCodigo());
//
//		paquete.setCantidadBultos(cantidadBultos);
//		
//		modeloPaquete.modificarCarta(paquete);
	
		
		
		
		// recibe parametros bultos
		
//		Bulto bulto = new Bulto();
//		bulto.setEnvio(modeloPaquete.verPaquete(modeloPaquete.recibirUltimoCodigoEnvio()));
//		String tamano = request.getParameter("tamano");
//		int peso = Integer.parseInt(request.getParameter("peso"));
//
//		bulto.setTamano(tamano);
//		bulto.setPeso(peso);
//		
//		bulto.setPaquete(modeloPaquete.verPaquete(modeloPaquete.recibirUltimoCodigoPaquete()));
//
//		// inserta bulto
//		
//		modeloBulto.insertarBulto(bulto);


	}

}
