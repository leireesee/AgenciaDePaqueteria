package modelo.dto;

import java.util.Date;

public abstract class Envio {

	int codEnvio;
	String idCliente;
	Date fechaEntrada;
	Date fechaSalida;
	Date fechaLlegada;
	boolean entregado;
	String direccionDestino;
	String tracking;
}
