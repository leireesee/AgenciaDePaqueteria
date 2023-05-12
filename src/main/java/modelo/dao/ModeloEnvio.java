package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Envio;

public class ModeloEnvio extends Conector {

	/***
	 * Este metodo inserta un envio 
	 * @param  envio
	 */
	public void insertarEnvio(Envio envio) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO envio (cod_sucursal,cod_cliente,  fecha_entrada, fecha_salida, fecha_llegada, entregado, direccion_destino, tracking) VALUES (?,?,?,?,?,?,?,?)");
			pstInsert.setInt(1, envio.getSucursal().getCodSucursal());
			pstInsert.setInt(2, envio.getCliente().getCodCliente());
			pstInsert.setDate(3, new Date(envio.getFechaEntrada().getTime()));
			pstInsert.setDate(4, new Date(envio.getFechaSalida().getTime()));
			pstInsert.setDate(5, new Date(envio.getFechaLlegada().getTime()));
			pstInsert.setString(6, envio.getEntregado());
			pstInsert.setString(7, envio.getDireccionDestino());
			pstInsert.setString(8, envio.getTracking());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fin clase insertar
	/**
	 *  Elimina un envio  siempre que coincida con el codigo envio
	 * @param  codEnvio 
	 */
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
	/***
	 * Este metodo se encarga de de modificar carta dependiedno del codigo envio.
	 * @param envio
	 */
	public void modificarEnvio(Envio envio) {
		PreparedStatement pstUpdate;
		try {
			pstUpdate = super.conexion.prepareStatement(
					"UPDATE envio SET cod_sucursal=?, cod_cliente=? , fecha_entrada=?, fecha_salida=?, fecha_llegada=?, entregado=?, direccion_destino=?, tracking=? WHERE cod_envio=?");
			pstUpdate.setInt(1, envio.getSucursal().getCodSucursal());
			pstUpdate.setInt(2, envio.getCliente().getCodCliente());
			pstUpdate.setDate(3, new Date(envio.getFechaEntrada().getTime()));
			pstUpdate.setDate(4, new Date(envio.getFechaSalida().getTime()));
			pstUpdate.setDate(5, new Date(envio.getFechaLlegada().getTime()));
			pstUpdate.setString(6, envio.getEntregado());
			pstUpdate.setString(7, envio.getDireccionDestino());
			pstUpdate.setString(8, envio.getTracking());
			pstUpdate.setInt(9, envio.getCodEnvio());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// fin clase modificar
	/***
	 * Se encarga de visualizar todos los envios 
	 * @return devuelve un arrayList de envios
	 */
	public ArrayList<Envio> verEnvios() {

		String senteciaSelect = "SELECT * FROM envio ORDER BY cod_envio DESC";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Envio> envios = new ArrayList<Envio>();
		ModeloSucursal modeloSucursal = new ModeloSucursal();
		ModeloCliente modeloCliente = new ModeloCliente();

		ResultSet resultado;
		try {
			resultado = st.executeQuery(senteciaSelect);
			while (resultado.next()) {

				Envio envio = new Envio();

				envio.setCodEnvio(resultado.getInt("cod_envio"));
				envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				envio.setCliente(modeloCliente.verCliente(resultado.getInt("cod_cliente")));
				envio.setFechaEntrada(resultado.getDate("fecha_entrada"));
				envio.setFechaSalida(resultado.getDate("fecha_salida"));
				envio.setFechaLlegada(resultado.getDate("fecha_llegada"));
				envio.setEntregado(resultado.getString("entregado"));
				envio.setDireccionDestino(resultado.getString("direccion_destino"));
				envio.setTracking(resultado.getString("tracking"));
				envios.add(envio);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		modeloSucursal.cerrarConexion();
		modeloCliente.cerrarConexion();
		return envios;
	}// fin clase verEnvios
	/***
	 * Este metodo se encarga de visualizar envios dependiendo del codigo envio y ordenado de manera ascendente .
	 * @return devuelve un objeto envios
	 */
	public ArrayList<Envio> verEnviosASC() {

		String senteciaSelect = "SELECT * FROM envio ORDER BY cod_envio ASC";
		Statement st = null;
		try {
			st = super.conexion.createStatement();
	
		ArrayList<Envio> envios = new ArrayList<Envio>();

		ResultSet resultado;
		
			resultado = st.executeQuery(senteciaSelect);
			ModeloSucursal modeloSucursal = new ModeloSucursal();
			ModeloCliente modeloCliente = new ModeloCliente();
			while (resultado.next()) {

				Envio envio = new Envio();

				envio.setCodEnvio(resultado.getInt("cod_envio"));
				envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				envio.setCliente(modeloCliente.verCliente(resultado.getInt("cod_cliente")));
				envio.setFechaEntrada(resultado.getDate("fecha_entrada"));
				envio.setFechaSalida(resultado.getDate("fecha_salida"));
				envio.setFechaLlegada(resultado.getDate("fecha_llegada"));
				envio.setEntregado(resultado.getString("entregado"));
				envio.setDireccionDestino(resultado.getString("direccion_destino"));
				envio.setTracking(resultado.getString("tracking"));
				envios.add(envio);

			}

			modeloSucursal.cerrarConexion();
			modeloCliente.cerrarConexion();
			return envios;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		
	}// fin clase verEnvios
	/***
	 * Este metodo se encarga de visualizar envios dependiendo del codigo envio y ordenado de manera descendente  .
	 * @param codCliente
	 * @return devuelve un objeto envios
	 */
	public ArrayList<Envio> verEnviosPersonal(int codCliente) {

		String senteciaSelect = "SELECT * FROM envio WHERE cod_cliente=? ORDER BY cod_envio DESC ";
		PreparedStatement pstSelect;
		
		try {
			pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codCliente);
			ModeloSucursal modeloSucursal = new ModeloSucursal();
			ModeloCliente modeloCliente = new ModeloCliente();
			ArrayList<Envio> envios = new ArrayList<Envio>();

			ResultSet resultado;

			resultado = pstSelect.executeQuery();
			while (resultado.next()) {

				Envio envio = new Envio();
				

				envio.setCodEnvio(resultado.getInt("cod_envio"));
				envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt("cod_sucursal")));
				envio.setCliente(modeloCliente.verCliente(resultado.getInt("cod_cliente")));
				envio.setFechaEntrada(resultado.getDate("fecha_entrada"));
				envio.setFechaSalida(resultado.getDate("fecha_salida"));
				envio.setFechaLlegada(resultado.getDate("fecha_llegada"));
				envio.setEntregado(resultado.getString("entregado"));
				envio.setDireccionDestino(resultado.getString("direccion_destino"));
				envio.setTracking(resultado.getString("tracking"));
				envios.add(envio);
				
			}
			modeloSucursal.cerrarConexion();
			modeloCliente.cerrarConexion();

			return envios;
		

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return null;
	}// fin clase verEnvios
	/***
	 * Este metodo se encarga de visualizar un envio dependiendo del codigo envio.
	 * @param codEnvio
	 * @return devuelve un objeto envios
	 */
	public Envio verEnvio(int codEnvio) {

		String senteciaSelect = "SELECT * FROM envio WHERE cod_envio=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codEnvio);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Envio envio = new Envio();
			ModeloSucursal modeloSucursal = new ModeloSucursal();
			ModeloCliente modeloCliente = new ModeloCliente();

			envio.setCodEnvio(resultado.getInt(1));
			envio.setSucursal(modeloSucursal.verSucursal(resultado.getInt(2)));
			envio.setCliente(modeloCliente.verCliente(resultado.getInt(3)));
			envio.setFechaEntrada(resultado.getDate(4));
			envio.setFechaSalida(resultado.getDate(5));
			envio.setFechaLlegada(resultado.getDate(6));
			envio.setEntregado(resultado.getString(7));
			envio.setDireccionDestino(resultado.getString(8));
			envio.setTracking(resultado.getString(9));
			modeloSucursal.cerrarConexion();
			modeloCliente.cerrarConexion();

			return envio;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
 /***
  * Este metodo se encargar de recibir el ultimo codigo envio
  * @return devuelve el codigo envio
  */
	public int recibirUltimoCodigo() {

		String senteciaSelect = "SELECT MAX(cod_envio) FROM envio ";
		int codigoEnvio = 0;
		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);

			ResultSet resultado = pstSelect.executeQuery();

			while (resultado.next()) {
				codigoEnvio = resultado.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return codigoEnvio;
	}

}// fin clase
