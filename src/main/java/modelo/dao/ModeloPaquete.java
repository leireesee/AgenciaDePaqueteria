package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.dto.Carta;
import modelo.dto.Paquete;

public class ModeloPaquete extends Conector {

	public void insertarPaqute(Paquete paquete) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion
					.prepareStatement("INSERT INTO paquete (cantidad_bultos, cod_envio) VALUES (?,?)");

			pstInsert.setInt(1, paquete.getCantidadBultos());
			pstInsert.setInt(2, paquete.getCodEnvio());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarPaquete(int codEnvio) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM paquete WHERE cod_envio=?");
			pstDelete.setInt(1, codEnvio);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void modificarCarta(Paquete paquete) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement("UPDATE carta SET cantidad_bultos=? WHERE cod_envio=?");
			{
				pstUpdate.setInt(1, paquete.getCantidadBultos());
				pstUpdate.setInt(2, paquete.getCodEnvio());
				pstUpdate.execute();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	

}// fin clase modelo paquete
