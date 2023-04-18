package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.dto.Carta;

public class ModeloCarta extends Conector {

	public void insertarCarta(Carta carta) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO carta (mensual, cod_envio) VALUES (?,?)");

			pstInsert.setBoolean(1, carta.isMensual());
			pstInsert.setInt(2, carta.getCodEnvio());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarCarta(int codEnvio) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM carta WHERE cod_envio=?");
			pstDelete.setInt(1, codEnvio);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}// fin clase modeloCarta
