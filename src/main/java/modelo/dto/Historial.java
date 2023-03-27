package modelo.dto;

import java.util.ArrayList;
import java.util.Date;

public class Historial {

	private Date fechaLlegada;
	private String tracking;

	private Cliente idCliente;
	private ArrayList<Envio> envios;

	// setter and getters

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getTracking() {
		return tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Envio> getEnvios() {
		return envios;
	}

	public void setEnvios(ArrayList<Envio> envios) {
		this.envios = envios;
	}

}
