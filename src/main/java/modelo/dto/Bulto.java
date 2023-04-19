package modelo.dto;

public class Bulto  {

	private String codBulto;
	private int cod_envio;
	private int codPaquete;
	private double peso;
	private String tamano;
	// setter and getters
	public String getCodBulto() {
		return codBulto;
	}
	public void setCodBulto(String codBulto) {
		this.codBulto = codBulto;
	}
	public int getCodPaquete() {
		return codPaquete;
	}
	public void setCodPaquete(int codPaquete) {
		this.codPaquete = codPaquete;
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
	public int getCod_envio() {
		return cod_envio;
	}
	public void setCod_envio(int cod_envio) {
		this.cod_envio = cod_envio;
	}
	

	



}
