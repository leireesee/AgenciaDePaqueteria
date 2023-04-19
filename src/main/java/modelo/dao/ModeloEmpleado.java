package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Empleado;

public class ModeloEmpleado extends Conector {

	public void insertarEmpleado(Empleado empleado) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO empleados (cod_sucursal, dni, nombre, direccion, telefono, num_seguridad_social, categoria, nomina, comision,cod_departamento, contrasena) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			pstInsert.setInt(1, empleado.getSucursal().getCodSucursal());
			pstInsert.setString(2, empleado.getDni());
			pstInsert.setString(3, empleado.getNombre());
			pstInsert.setString(4, empleado.getDireccion());
			pstInsert.setString(5, empleado.getTelefono());
			pstInsert.setString(6, empleado.getNumSeguridadS());
			pstInsert.setString(7, empleado.getCategoria());
			pstInsert.setDouble(8, empleado.getNomina());
			pstInsert.setDouble(9, empleado.getComision());
			pstInsert.setInt(10, empleado.getDepartamento().getCodDepartamento());
			pstInsert.setString(11, empleado.getContrasena());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void eliminarEmpleado(String dni) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM empleados WHERE dni=?");
			pstDelete.setString (1, dni);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modificarEmpleado() {

	}

	public ArrayList<Empleado> verEmpleados() {

		return null;
	}

	public Empleado verEmpleado() {

		return null;
	}

}
