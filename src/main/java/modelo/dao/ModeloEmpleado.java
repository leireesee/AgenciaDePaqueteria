package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Empleado;
import modelo.dto.Envio;

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
			pstDelete.setString(1, dni);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modificarEmpleado(Empleado empleado) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement(
					"UPDATE empleados SET cod_sucursal=? , dni=?, nombre=?, direccion=?, telefono=?, num_seguridad_social=?, categoria=?, nomina=?, comision=?, cod_departamento=?, contrasena=? WHERE dni=?");
			pstUpdate.setInt(1, empleado.getSucursal().getCodSucursal());
			pstUpdate.setString(2, empleado.getDni());
			pstUpdate.setString(3, empleado.getNombre());
			pstUpdate.setString(4, empleado.getDireccion());
			pstUpdate.setString(5, empleado.getTelefono());
			pstUpdate.setString(6, empleado.getNumSeguridadS());
			pstUpdate.setString(7, empleado.getCategoria());
			pstUpdate.setDouble(8, empleado.getNomina());
			pstUpdate.setDouble(9, empleado.getComision());
			pstUpdate.setInt(10, empleado.getDepartamento().getCodDepartamento());
			pstUpdate.setString(11, empleado.getContrasena());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Empleado> verEmpleados() {
		String sentenciaSelect = "SELECT * FROM empleados";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ResultSet resultado;
		try {
			resultado = st.executeQuery(sentenciaSelect);
			while (resultado.next()) {
				Empleado empleado = new Empleado();
				ModeloSucursal modeloSucursal = new ModeloSucursal();
				ModeloDepartamento modeloDepartamento = new ModeloDepartamento();

				empleado.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				empleado.setDni(resultado.getString("dni"));
				empleado.setNombre(resultado.getString("nombre"));
				empleado.setDireccion(resultado.getString("direccion"));
				empleado.setTelefono(resultado.getString("telefono"));
				empleado.setNumSeguridadS(resultado.getString("num_seguridad_social"));
				empleado.setCategoria(resultado.getString("categoria"));
				empleado.setNomina(resultado.getDouble("nomina"));
				empleado.setComision(resultado.getDouble("comision"));
				empleado.setDepartamento(modeloDepartamento.verDepartamento(resultado.getInt("cod_departamento")));
				empleado.setContrasena(resultado.getString("contrasena"));
				empleados.add(empleado);

				

			}
			return empleados;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public Empleado verEmpleado(String dni) {
		String senteciaSelect = "SELECT * FROM empleados WHERE dni=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setString(1, dni);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Empleado empleado = new Empleado();
			ModeloSucursal modeloSucursal = new ModeloSucursal();
			ModeloDepartamento modeloDepartamento = new ModeloDepartamento();

			empleado.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
			empleado.setDni(resultado.getString("dni"));
			empleado.setNombre(resultado.getString("nombre"));
			empleado.setDireccion(resultado.getString("direccion"));
			empleado.setTelefono(resultado.getString("telefono"));
			empleado.setNumSeguridadS(resultado.getString("num_seguridad_social"));
			empleado.setCategoria(resultado.getString("categoria"));
			empleado.setNomina(resultado.getDouble("nomina"));
			empleado.setComision(resultado.getDouble("comision"));
			empleado.setDepartamento(modeloDepartamento.verDepartamento(resultado.getInt("cod_departamento")));
			
			empleado.setContrasena(resultado.getString("contrasena"));
			return empleado;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Empleado verificar(String dni, String contrasena) {
		String senteciaSelect = "SELECT * FROM empleados WHERE Dni=? AND contrasena =?";
		Empleado empleado = new Empleado();
		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setString(1, dni);
			pstSelect.setString(2, contrasena);


			ModeloSucursal modeloSucursal = new ModeloSucursal();
			ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
			ResultSet resultado = pstSelect.executeQuery();

			while(resultado.next()) {
				empleado.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				empleado.setDni(resultado.getString("dni"));
				empleado.setNombre(resultado.getString("nombre"));
				empleado.setDireccion(resultado.getString("direccion"));
				empleado.setTelefono(resultado.getString("telefono"));
				empleado.setNumSeguridadS(resultado.getString("num_seguridad_social"));
				empleado.setCategoria(resultado.getString("categoria"));
				empleado.setNomina(resultado.getDouble("nomina"));
				empleado.setComision(resultado.getDouble("comision"));
				empleado.setDepartamento(modeloDepartamento.verDepartamento(resultado.getInt("cod_departamento")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return empleado;
	}

}
