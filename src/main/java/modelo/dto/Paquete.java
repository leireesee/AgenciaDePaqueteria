package modelo.dto;

import java.util.ArrayList;

public class Paquete extends Envio {

	private int cantidadBultos;
	private ArrayList<Bulto> bultos;

	// setter and getters

	public int getCantidadBultos() {
		return cantidadBultos;
	}

	public void setCantidadBultos(int cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}

	public ArrayList<Bulto> getBultos() {
		return bultos;
	}

	public void setBultos(ArrayList<Bulto> bultos) {
		this.bultos = bultos;
	}

}
