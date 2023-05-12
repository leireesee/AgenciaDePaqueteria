package Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloDepartamento;
import modelo.dto.Departamento;

/**
 * Servlet implementation class ControladorVerDepartamentos
 */
@WebServlet("/ControladorVerDepartamentos")
public class ControladorVerDepartamentos extends HttpServlet {
	/***
	 * Este controlador se conecta a la base de datos y desde ahi  se los enviamos por el doGet el arraylist de departamentos para que se visualice.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorVerDepartamentos() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModeloDepartamento modeloDepartamento = new ModeloDepartamento();

		ArrayList<Departamento> departamentos = null;

		departamentos = modeloDepartamento.verDepartamentos();
		modeloDepartamento.cerrarConexion();
		request.setAttribute("departamentos", departamentos);
		request.getRequestDispatcher("VerDepartamentos.jsp").forward(request, response);

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
