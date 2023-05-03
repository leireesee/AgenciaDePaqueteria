package modelo.dto;

public class Paquete extends Envio {
	
	private int codPaquete;
	private double peso;
	private String tamano;

	// setter and getters

	
	

	public int getCodPaquete() {
		return codPaquete;
	}

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

	public void setCodPaquete(int codPaquete) {
		this.codPaquete = codPaquete;
	}



}
