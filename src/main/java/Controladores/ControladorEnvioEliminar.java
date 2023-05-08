package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCliente;
import modelo.dao.ModeloEnvio;

/**
 * Servlet implementation class ControladorEliminarEnvio
 */
@WebServlet("/ControladorEnvioEliminar")
public class ControladorEnvioEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEnvioEliminar() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codEnvio = Integer.parseInt(request.getParameter("codEnvio"));

		ModeloEnvio modeloEnvio = new ModeloEnvio();
		
		modeloEnvio.eliminarEnvio(codEnvio);

		request.getRequestDispatcher("ControladorVerEnvios").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
