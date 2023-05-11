package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Envio;
import modelo.dto.Sucursal;

public class ModeloSucursal extends Conector {

//	public void insertarSucursa(Sucursal sucursal) {
//		PreparedStatement pstInsert;
//
//		try {
//			pstInsert = super.conexion.prepareStatement("INSERT INTO sucursal (telefono, direccion) VALUES (?,?)");
//
//			pstInsert.setString(1, sucursal.getTelefono());
//			pstInsert.setString(2, sucursal.getDireccion());
//			pstInsert.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void eliminarSucursal(int cod_sucursal) {
//		PreparedStatement pstDelete;
//		try {
//			pstDelete = super.conexion.prepareStatement("DELETE FROM sucursal WHERE cod_sucursal=?");
//			pstDelete.setInt(1, cod_sucursal);
//			pstDelete.execute();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	public Sucursal verSucursal(int codSucursal) {

		String senteciaSelect = "SELECT * FROM sucursal WHERE cod_sucursal=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codSucursal);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Sucursal sucursal = new Sucursal();

			sucursal.setCodSucursal(resultado.getInt("cod_sucursal"));
			sucursal.setTelefono(resultado.getString("telefono"));
			sucursal.setDireccion(resultado.getString("direccion"));
			return sucursal;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public ArrayList<Sucursal> verSucursales() {

		String senteciaSelect = "SELECT * FROM sucursal ";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();

			ResultSet resultado = pstSelect.executeQuery();
			while (resultado.next()) {

				Sucursal sucursal = new Sucursal();

				sucursal.setCodSucursal(resultado.getInt("cod_sucursal"));
				sucursal.setTelefono(resultado.getString("telefono"));
				sucursal.setDireccion(resultado.getString("direccion"));
				sucursales.add(sucursal);
			}

			return sucursales;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}// fin clase
