package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Bulto;
import modelo.dto.Carta;

public class ModeloBulto extends Conector {
	public void insertarBulto(Bulto bulto) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion
					.prepareStatement("INSERT INTO bulto (cod_envio, tamano, peso, cod_paquete) VALUES (?,?,?,?)");

			pstInsert.setInt(1, bulto.getCod_envio());
			pstInsert.setString(1, bulto.getTamano());
			pstInsert.setDouble(2, bulto.getPeso());
			pstInsert.setInt(3, bulto.getCodPaquete());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarBulto(int cod_bulto) {
		PreparedStatement pstDelete;

		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM bulto WHERE cod_bulto=?");
			pstDelete.setInt(1, cod_bulto);
			pstDelete.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Bulto> verBultos(int cod_paquete) {
		String sentenciaSelect = "SELECT * FROM bulto WHERE cod_paquete=?";

		ArrayList<Bulto> bultos = new ArrayList<Bulto>();

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(sentenciaSelect);
			pstSelect.setInt(1, cod_paquete);

			ResultSet resultado = pstSelect.executeQuery();
			while (resultado.next()) {
				Bulto bulto = new Bulto();

				bulto.setCod_envio(resultado.getInt("cod_envio"));
				bulto.setTamano(resultado.getString("tamano"));
				bulto.setPeso(resultado.getDouble("peso"));
				bulto.setCodPaquete(resultado.getInt("cod_paquete"));
				bultos.add(bulto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bultos;
	}

	// en el modelo bulto solo se puede insertar y ver y eliminar pero no modificar

}// fin de modeloBulto
