package Controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCarta;
import modelo.dao.ModeloCliente;
import modelo.dao.ModeloEnvio;
import modelo.dao.ModeloPaquete;
import modelo.dao.ModeloSucursal;
import modelo.dto.Envio;
import modelo.dto.Paquete;
import modelo.dto.Carta;

/**
 * Servlet implementation class ControladorEnvioInsertar
 */
@WebServlet("/ControladorEnvioInsertar")
public class ControladorEnvioInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorEnvioInsertar() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("InsertarEnvio.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Envio envio = new Envio();

		ModeloEnvio modeloEnvio = new ModeloEnvio();
		ModeloSucursal modeloSucursal = new ModeloSucursal();
		ModeloCliente modeloCliente = new ModeloCliente();

		// parte de envio
		try {
			int codSucursal = Integer.parseInt(request.getParameter("cod_sucursal"));
			int codCliente = Integer.parseInt(request.getParameter("cod_cliente"));

			Date fechaEntrada = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_entrada"));
			Date fechaSalida = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_salida"));
			Date fechaLlegada = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_llegada"));

			String entregado = request.getParameter("entregado");
			String direccionDestino = request.getParameter("direccion_destino");
			String tracking = request.getParameter("tracking");

			//envio.setSucursal(modeloSucursal.verSucursal(codSucursal));
			modeloSucursal.verSucursal(codSucursal);
			envio.setCliente(modeloCliente.verCliente(codCliente));
			envio.setFechaEntrada(fechaEntrada);
			envio.setFechaSalida(fechaSalida);
			envio.setFechaLlegada(fechaLlegada);
			envio.setEntregado(entregado);
			envio.setDireccionDestino(direccionDestino);
			envio.setTracking(tracking);

			modeloEnvio.insertarEnvio(envio);
			} catch (Exception e) {
//			String MensajeError= "ERROR";
//			request.setAttribute("MensajeError", MensajeError);
//			request.getRequestDispatcher("InsertarEnvio.jsp").forward(request, response);
		}


		String tipoEnvio = request.getParameter("tipoEnvio");

		// parte carta
		if (tipoEnvio.equals("Carta")) {

			response.sendRedirect("ControladorCarta");

		}

		if (tipoEnvio.equals("Paquete")) {

			response.sendRedirect("ControladorPaquete");

		}

	}

}
