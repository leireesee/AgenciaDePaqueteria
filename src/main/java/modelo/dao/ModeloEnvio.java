package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Envio;

public class ModeloEnvio extends Conector {

	public void insertarEnvio(Envio envio) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO envio (cod_sucursal, fecha_entrada, fecha_salida, fecha_llegada, entregado, direccion_destino, tracking) VALUES (?,?,?,?,?,?,?)");
			pstInsert.setInt(1, envio.getSucursal().getCodSucursal());
			pstInsert.setDate(2, new Date(envio.getFechaEntrada().getTime()));
			pstInsert.setDate(3, new Date(envio.getFechaSalida().getTime()));
			pstInsert.setDate(4, new Date(envio.getFechaLlegada().getTime()));
			pstInsert.setBoolean(5, envio.isEntregado());
			pstInsert.setString(6, envio.getDireccionDestino());
			pstInsert.setString(7, envio.getTracking());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fin clase insertar

	public void eliminarEnvio(int codEnvio) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM envio WHERE cod_envio=?");
			pstDelete.setInt(1, codEnvio);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// fin clase eliminar

	public void modificarEnvio(Envio envio) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement(
					"UPDATE envio SET cod_sucursal=? , fecha_entrada=?, fecha_salida=?, fecha_llegada=?, entregado=?, direccion_destino=?, tracking=? WHERE cod_envio=?");
			pstUpdate.setInt(1, envio.getSucursal().getCodSucursal());
			pstUpdate.setDate(3, new Date(envio.getFechaEntrada().getTime()));
			pstUpdate.setDate(4, new Date(envio.getFechaSalida().getTime()));
			pstUpdate.setDate(5, new Date(envio.getFechaLlegada().getTime()));
			pstUpdate.setBoolean(6, envio.isEntregado());
			pstUpdate.setString(7, envio.getDireccionDestino());
			pstUpdate.setString(8, envio.getTracking());
			pstUpdate.setInt(9, envio.getCodEnvio());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// fin clase modificar

	public ArrayList<Envio> verEnvios() {

		String senteciaSelect = "SELECT * FROM envio";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Envio> envios = new ArrayList<Envio>();

		ResultSet resultado;
		try {
			resultado = st.executeQuery(senteciaSelect);
			while (resultado.next()) {

				Envio envio = new Envio();
				ModeloSucursal modeloSucursal = new ModeloSucursal();

				envio.setCodEnvio(resultado.getInt("cod_envio"));
				envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				envio.setFechaEntrada(resultado.getDate("fecha_entrada"));
				envio.setFechaSalida(resultado.getDate("fecha_salida"));
				envio.setFechaLlegada(resultado.getDate("fecha_llegada"));
				envio.setEntregado(resultado.getBoolean("entregado"));
				envio.setDireccionDestino(resultado.getString("direccion_destino"));
				envio.setTracking(resultado.getString("tracking"));
				envios.add(envio);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return envios;
	}// fin clase verEnvios

	public Envio verEnvio(int codEnvio) {

		String senteciaSelect = "SELECT * FROM envio WHERE cod_envio=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codEnvio);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Envio envio = new Envio();
			ModeloSucursal modeloSucursal = new ModeloSucursal();

			envio.setCodEnvio(resultado.getInt("cod_envio"));
			envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
			envio.setFechaEntrada(resultado.getDate("fecha_entrada"));
			envio.setFechaSalida(resultado.getDate("fecha_salida"));
			envio.setFechaLlegada(resultado.getDate("fecha_llegada"));
			envio.setEntregado(resultado.getBoolean("entregado"));
			envio.setDireccionDestino(resultado.getString("direccion_destino"));
			envio.setTracking(resultado.getString("tracking"));
			return envio;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}// fin clase
