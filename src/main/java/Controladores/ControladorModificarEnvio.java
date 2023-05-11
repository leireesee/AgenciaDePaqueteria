package Controladores;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCliente;
import modelo.dao.ModeloEnvio;
import modelo.dao.ModeloSucursal;
import modelo.dto.Envio;

/**
 * Servlet implementation class ControladorModificarEnvio
 */
@WebServlet("/ControladorModificarEnvio")
public class ControladorModificarEnvio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorModificarEnvio() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloEnvio modeloEnvio = new ModeloEnvio();

		Envio envio = new Envio();

		int codEnvio = Integer.parseInt(request.getParameter("codEnvio"));

		envio = modeloEnvio.verEnvio(codEnvio);

		request.setAttribute("envio", envio);
		request.getRequestDispatcher("ModificarEnvio.jsp").forward(request, response);

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

		try {
			int codEnvio = Integer.parseInt(request.getParameter("codEnvio"));
			int codSucursal = Integer.parseInt(request.getParameter("cod_sucursal"));
			int codCliente = Integer.parseInt(request.getParameter("cod_cliente"));

			Date fechaEntrada = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_entrada"));
			Date fechaSalida = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_salida"));
			Date fechaLlegada = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_llegada"));

			String entregado = request.getParameter("entregado");
			String direccionDestino = request.getParameter("direccion_destino");
			String tracking = request.getParameter("tracking");
			envio.setCodEnvio(codEnvio);
			envio.setSucursal(modeloSucursal.verSucursal(codSucursal));
			envio.setCliente(modeloCliente.verCliente(codCliente));
			envio.setFechaEntrada(fechaEntrada);
			envio.setFechaSalida(fechaSalida);
			envio.setFechaLlegada(fechaLlegada);
			envio.setEntregado(entregado);
			envio.setDireccionDestino(direccionDestino);
			envio.setTracking(tracking);
			modeloEnvio.modificarEnvio(envio);
			response.sendRedirect("ControladorVistaEmpleado");
		} catch (Exception e) {

			String MensajeError = "ERROR";
			request.setAttribute("MensajeError", MensajeError);
			request.getRequestDispatcher("ModificarEnvio.jsp").forward(request, response);
		}
	}

}
