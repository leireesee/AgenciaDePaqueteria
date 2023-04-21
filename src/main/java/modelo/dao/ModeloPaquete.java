package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.dto.Carta;
import modelo.dto.Envio;
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
	
	
	public Paquete verPaquete(int codEnvio) {
		String senteciaSelect = "SELECT * FROM paquete WHERE cod_envio=?";
		
		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codEnvio);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Paquete paquete = new Paquete();
			

			paquete.setCodPaquete(resultado.getInt("cod_paquete"));
			paquete.setCantidadBultos(resultado.getInt("cantidad_bultos"));
			paquete.setCodEnvio(resultado.getInt("cod_envio"));
			return paquete;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	

}// fin clase modelo paquete
