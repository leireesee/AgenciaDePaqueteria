package modelo.dto;

public abstract class Cliente  {

	private String nombre;
	private String direccion;
	private String formaPago;
	private String telefono;
	private String contrasena;
	
	public Historial getHistorial() {
		return historial;
	}
	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
	private Historial historial;
	
	// setter and getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}