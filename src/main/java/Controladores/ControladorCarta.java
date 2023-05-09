package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ModeloCarta;
import modelo.dao.ModeloEnvio;
import modelo.dto.Carta;

/**
 * Servlet implementation class ControladorCarta
 */
@WebServlet("/ControladorCarta")
public class ControladorCarta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCarta() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("InsertarCarta.jsp").forward(request, response);

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mensual = request.getParameter("mensual");
		
		Carta carta = new Carta();
		ModeloEnvio modeloEnvio = new ModeloEnvio();
		ModeloCarta modeloCarta = new ModeloCarta();
		
		
		if(mensual.equals("Si")) {
			carta.setMensual(true);
		}
		
		if(mensual.equals("No")) {
			carta.setMensual(false);
		}
		
		
		
		carta.setCodEnvio(modeloEnvio.recibirUltimoCodigo());
		
		
		modeloCarta.insertarCarta(carta);
		
		response.sendRedirect("ControladorVistaEmpleado");

		
	}
	

}
