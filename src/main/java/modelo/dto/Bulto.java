package modelo.dto;

public class Bulto  {

	private Bulto bulto;
	private Envio envio;
	private Paquete paquete;
	private double peso;
	private String tamano;
	// setter and getters
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public Bulto getBulto() {
		return bulto;
	}
	public void setBulto(Bulto bulto) {
		this.bulto = bulto;
	}
	public Envio getEnvio() {
		return envio;
	}
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	



}
