package modelo.dto;

public class Sucursal {

	private int codSucursal;
	private String direccion;
	private String telefono;
	
	

	// setter and getters

	public int getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(int codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
