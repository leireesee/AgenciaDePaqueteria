package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloEmpleado;
import modelo.dto.Empleado;

/**
 * Servlet implementation class ControladorVistaAdmin
 */
@WebServlet("/ControladorVistaAdmin")
public class ControladorVistaAdmin extends HttpServlet {
	/***
	 * Este controlador se encarga de visualizar la vista administrador al que le pasamos tambien un arrayList de empleados para que se vea en
	 * la vista.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVistaAdmin() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloEmpleado modeloEmpleado = new ModeloEmpleado();

		ArrayList<Empleado> empleados = null;
		empleados = modeloEmpleado.verEmpleados();
		modeloEmpleado.cerrarConexion();
		request.setAttribute("empleados", empleados);
		request.getRequestDispatcher("VistaAdmin.jsp").forward(request, response);

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
