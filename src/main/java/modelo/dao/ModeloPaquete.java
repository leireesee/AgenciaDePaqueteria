package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.dto.Carta;
import modelo.dto.Envio;
import modelo.dto.Paquete;

public class ModeloPaquete extends Conector {
	/***
	 * Este metodo inserta un paquete  
	 * @param paquete
	 */
	public void insertarPaquete(Paquete paquete) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO paquete (peso,tamano, cod_envio) VALUES (?,?,?)");

			pstInsert.setDouble(1, paquete.getPeso());
			pstInsert.setString(2, paquete.getTamano());
			pstInsert.setInt(3, paquete.getCodEnvio());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 *  Elimina un paquete   siempre que conicida con el codigo envio 
	 * @param  codEnvio 
	 */
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
	/***
	 * Este metodo se encarga de de modificar el paquete  dependiedno del codigo envio.
	 * @param paquete
	 */
	public void modificarPaquete(Paquete paquete) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement("UPDATE paquete SET peso=?, tamano=? WHERE cod_envio=?");
			{
				pstUpdate.setDouble(1, paquete.getPeso());
				pstUpdate.setString(2, paquete.getTamano());
				pstUpdate.setInt(3, paquete.getCodEnvio());
				pstUpdate.execute();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/***
	 * Este metodo se encarga de visualizar un paquete dependiendo del codigo envio.
	 * @param  codEnvio
	 * @return devuelve un objeto paquete
	 */
	public Paquete verPaquete(int codEnvio) {
		String senteciaSelect = "SELECT * FROM paquete WHERE cod_envio=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codEnvio);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Paquete paquete = new Paquete();

			paquete.setCodPaquete(resultado.getInt("cod_paquete"));
			paquete.setPeso(resultado.getDouble("peso"));
			paquete.setTamano(resultado.getString("tamano"));
			paquete.setCodEnvio(resultado.getInt("cod_envio"));
			return paquete;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	/***
	 * Este metodo sirve para recibir  el ultimo codigo de envio
	 * @return devuelve codigoEnvio
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
	

	/***
	 * Este metodo sirve para recibir  el ultimo codigo de paquete
	 * @return devuelve codigoPaquete
	 */
	public int recibirUltimoCodigoPaquete() {

		String senteciaSelect = "SELECT MAX(cod_paquete) FROM paquete ";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			int codigoPaquete = resultado.getInt("cod_paquete");

			return codigoPaquete;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}// fin clase modelo paquete
