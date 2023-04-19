package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.dto.Bulto;
import modelo.dto.Carta;

public class ModeloBulto extends Conector {
	public void insertarBulto(Bulto bulto) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO bulto (tamano, peso, cod_paquete) VALUES (?,?,?)");

			pstInsert.setString(1, bulto.getTamano());
			pstInsert.setDouble(2, bulto.getPeso());
			pstInsert.setInt(3, bulto.getCodPaquete());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarBulto (int cod_bulto) {
		PreparedStatement pstDelete;
		
		try {
			pstDelete= super.conexion.prepareStatement("DELETE FROM bulto WHERE cod_bulto=?");
			pstDelete.setInt(1, cod_bulto);
			pstDelete.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}// fin de modeloBulto
