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
					"INSERT INTO envio (cod_sucursal, id_cliente, fecha_entrada, fecha_salida, fecha_llegada, entregado, direccion_destino, tracking)");
			pstInsert.setInt(1, envio.getCodSucursal());
			pstInsert.setString(2, envio.getIdCliente());
			pstInsert.setDate(3, new Date(envio.getFechaEntrada().getTime()));
			pstInsert.setDate(4, new Date(envio.getFechaSalida().getTime()));
			pstInsert.setDate(5, new Date(envio.getFechaLlegada().getTime()));
			pstInsert.setBoolean(6, envio.isEntregado());
			pstInsert.setString(7, envio.getDireccionDestino());
			pstInsert.setString(8, envio.getTracking());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fin clase insertar

	public void eliminarEnvio() {

	}

	public void modificarEnvio() {

	}

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
