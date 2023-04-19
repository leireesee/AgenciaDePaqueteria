package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.dto.Sucursal;

public class ModeloSucursal extends Conector {

	public void insertarSucursa(Sucursal sucursal) {
		PreparedStatement pstInsert;

		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO sucursal (telefono, direccion) VALUES (?,?)");

			pstInsert.setString(1, sucursal.getTelefono());
			pstInsert.setString(2, sucursal.getDireccion());
			pstInsert.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void eliminarSucursal (int cod_sucursal) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM sucursal WHERE cod_sucursal=?");
			pstDelete.setInt(1, cod_sucursal);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}//fin clase
