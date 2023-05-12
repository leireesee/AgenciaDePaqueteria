package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.dto.Carta;

public class ModeloCarta extends Conector {

	/***
	 * Insertar el objeto carta en la base de datos
	 * @param  carta
	 */
	public void insertarCarta(Carta carta) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO carta (mensual, cod_envio) VALUES (?,?)");

			pstInsert.setString(1, carta.getMensual());
			pstInsert.setInt(2, carta.getCodEnvio());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * Elimina una carta siempre que conicida con el codigo envio 
	 * @param  codEnvio
	 */
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
	
	/***
	 * Este metodo se encarga de de modificar carta dependiedno del codigo envio.
	 * @param  carta
	 */
	public void modificarCarta(Carta carta) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement("UPDATE carta SET mensual=? WHERE cod_envio=?");
			{
				pstUpdate.setString(1, carta.getMensual());
				pstUpdate.setInt(2, carta.getCodEnvio());
				pstUpdate.execute();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/***
	 * Este metodo se encarga de mostrar el ultimo paquete con el codigo de envio 
	 * @return devulve un el ultimo codigo envio
	 */
	public int recibirUltimoCodigoEnvio() {

		String senteciaSelect = "SELECT MAX(cod_envio) FROM paquete ";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			int codigoEnvio = resultado.getInt("cod_envio");

			return codigoEnvio;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
// fin clase modeloCarta
