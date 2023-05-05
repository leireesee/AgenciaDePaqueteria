package modelo.dto;

import java.util.Date;

public class Envio {

	private int codEnvio; // autoincrement en la base de datos
	private Sucursal sucursal;
	private Cliente cliente;

	private Date fechaEntrada;
	private Date fechaSalida;
	private Date fechaLlegada;
	private boolean entregado;
	private String direccionDestino;
	private String tracking;

	// setter and getters
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCodEnvio() {
		return codEnvio;
	}

	public void setCodEnvio(int codEnvio) {
		this.codEnvio = codEnvio;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public void setDireccionDestino(String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	public String getTracking() {
		return tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	@Override
	public String toString() {
		return "Envio [codEnvio=" + codEnvio + ", sucursal=" + sucursal + ", cliente=" + cliente + ", fechaEntrada="
				+ fechaEntrada + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + ", entregado="
				+ entregado + ", direccionDestino=" + direccionDestino + ", tracking=" + tracking + "]";
	}

}
