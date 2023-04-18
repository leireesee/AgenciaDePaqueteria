package modelo.dto;

import java.util.ArrayList;

public class Paquete extends Envio {
	
	private int codPaquete;
	private int cantidadBultos;

	// setter and getters

	
	public int getCantidadBultos() {
		return cantidadBultos;
	}

	public void setCantidadBultos(int cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}

	public int getCodPaquete() {
		return codPaquete;
	}

	public void setCodPaquete(int codPaquete) {
		this.codPaquete = codPaquete;
	}



}
