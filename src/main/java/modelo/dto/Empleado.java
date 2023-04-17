package modelo.dto;

public class Empleado {

	private int codSucursal;
	private String dni;
	private String nombre;
	private String direccion;
	private String telefono;
	private String numSeguridadS;
	private String categoria;
	private double nomina;
	private double comision;
	private int codDepartamento;
	
	//getters and setters
	public int getCodSucursal() {
		return codSucursal;
	}
	public void setCodSucursal(int codSucursal) {
		this.codSucursal = codSucursal;
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
	public int getCodDepartamento() {
		return codDepartamento;
	}
	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}
	
	
}
