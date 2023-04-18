package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Envio;

public class ModeloEnvio extends Conector {

	public void insertarEnvio(Envio envio) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO envio (cod_sucursal, id_cliente, fecha_entrada, fecha_salida, fecha_llegada, entregado, direccion_destino, tracking) VALUES (?,?,?,?,?,?,?,?)");
			pstInsert.setInt(1, envio.getCodSucursal());
			pstInsert.setString(2, envio.getIdCliente());
			pstInsert.setDate(3, new Date(envio.getFechaEntrada().getTime()));
			pstInsert.setDate(4, new Date(envio.getFechaSalida().getTime()));
			pstInsert.setDate(5, new Date(envio.getFechaLlegada().getTime()));
			pstInsert.setBoolean(6, envio.isEntregado());
			pstInsert.setString(7, envio.getDireccionDestino());
			pstInsert.setString(8, envio.getTracking());
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
					"UPDATE envio SET cod_sucursal=? ,id_cliente=?, fecha_entrada=?, fecha_salida=?, fecha_llegada=?, entregado=?, direccion_destino=?, tracking=? WHERE cod_envio=?");
			pstUpdate.setInt(1, envio.getCodSucursal());
			pstUpdate.setString(2, envio.getIdCliente());
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

	}//fin clase modificar

	public ArrayList<Envio> verEnvios() {

		return null;
	}

	public Envio verEnvio() {
		return null;
	}

	public String verTracking() {

		return null;
	}

}
