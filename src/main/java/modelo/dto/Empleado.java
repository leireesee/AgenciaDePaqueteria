package modelo.dto;

public class Empleado {

	@Override
	public String toString() {
		return "Empleado [sucursal=" + sucursal + ", dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", numSeguridadS=" + numSeguridadS + ", categoria=" + categoria
				+ ", nomina=" + nomina + ", comision=" + comision + ", departamento=" + departamento + ", contrasena="
				+ contrasena + "]";
	}
	private Sucursal sucursal;
	private String dni;
	private String nombre;
	private String direccion;
	private String telefono;
	private String numSeguridadS;
	private String categoria;
	private double nomina;
	private double comision;
	private Departamento departamento;
	private String contrasena;
	
	
	//getters and setters
	
	public String getContrasena() {
		return contrasena;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNumSeguridadS() {
		return numSeguridadS;
	}
	public void setNumSeguridadS(String numSeguridadS) {
		this.numSeguridadS = numSeguridadS;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getNomina() {
		return nomina;
	}
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
}
