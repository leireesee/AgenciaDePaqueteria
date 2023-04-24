package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Particular;

public class ModeloParticular extends Conector {
	public void insertarParticular(Particular particular) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO particular (cod_cliente, dni ) VALUES (?,?)");

			pstInsert.setInt(1, particular.getCodCliente());
			pstInsert.setString(2, particular.getDni());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarParticular(int codCliente) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM particular WHERE cod_cliente=?");
			pstDelete.setInt(1, codCliente);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modificarParticular(Particular particular) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion
					.prepareStatement("UPDATE particular SET , cod_cliente =?, dni=?WHERE cod_cliente=?");
			pstUpdate.setInt(1, particular.getCodCliente());
			pstUpdate.setString(2, particular.getDni());
			pstUpdate.setInt(7, particular.getCodCliente());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Particular> verParticular() {
		String senteciaSelect = "SELECT * FROM particular";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Particular> particulares = new ArrayList<Particular>();

		ResultSet resultado;
		try {
			resultado = st.executeQuery(senteciaSelect);
			while (resultado.next()) {

				Particular particular = new Particular();

				particular.setCodCliente(resultado.getInt("cod_cliente"));
				particular.setDni(resultado.getString("dni"));
				particulares.add(particular);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return particulares;
	}

	public Cliente verCliente(int codCliente) {
		String senteciaSelect = "SELECT * FROM particular WHERE cod_cliente=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codCliente);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();
			Particular particular = new Particular();

			particular.setCodCliente(resultado.getInt("cod_cliente"));
			particular.setDni(resultado.getString("dni"));
			return particular;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
