package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Envio;

public class ModeloCliente extends Conector {
	
	public ModeloCliente() {
		super();
	}
	/***
	 * Este metodo inserta un cliente 
	 * @param cliente.
	 */
	public void insertarCliente(Cliente cliente) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO cliente ( Dni_Cif, nombre, direccion, forma_pago, telefono, contrasena) VALUES (?,?,?,?,?,?)");
			pstInsert.setString(1, cliente.getDniCif());
			pstInsert.setString(2, cliente.getNombre());
			pstInsert.setString(3, cliente.getDireccion());
			pstInsert.setString(4, cliente.getFormaPago());
			pstInsert.setString(5, cliente.getTelefono());
			pstInsert.setString(6, cliente.getContrasena());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 *  Elimina un cliente  siempre que conicida con el codigo cliente 
	 * @param  codCliente 
	 */
	public void eliminarCliente(int codCliente) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM cliente WHERE cod_cliente=?");
			pstDelete.setInt(1, codCliente);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/***
	 * Este metodo se encarga de de modificar un cliente dependiedno del codigo cliente.
	 * @param  cliente
	 */
	public void modificarCliente(Cliente cliente) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement(
					"UPDATE cliente SET Dni_Cif=?,  nombre=?, direccion=?, forma_pago=?, telefono=?, contrasena=? WHERE cod_cliente=?");
			pstUpdate.setString(1, cliente.getDniCif());
			pstUpdate.setString(2, cliente.getNombre());
			pstUpdate.setString(3, cliente.getDireccion());
			pstUpdate.setString(4, cliente.getFormaPago());
			pstUpdate.setString(5, cliente.getTelefono());
			pstUpdate.setString(6, cliente.getContrasena());
			pstUpdate.setInt(7, cliente.getCodCliente());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/***
	 * Se encarga de visualizar todos los clientes 
	 * @return devuelve un arrayList de clientes
	 */
	public ArrayList<Cliente> verClientes() {
		String senteciaSelect = "SELECT * FROM cliente";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		ResultSet resultado;
		try {
			resultado = st.executeQuery(senteciaSelect);
			while (resultado.next()) {

				Cliente cliente = new Cliente();
				cliente.setCodCliente(resultado.getInt("cod_cliente"));
				cliente.setDniCif(resultado.getString("Dni_Cif"));
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setDireccion(resultado.getString("direccion"));
				cliente.setFormaPago(resultado.getString("forma_pago"));
				cliente.setTelefono(resultado.getString("telefono"));
				cliente.setContrasena(resultado.getString("contrasena"));
				clientes.add(cliente);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientes;
	}
	/***
	 * Se encarga de visualizar un cliente dependiendo del codigo cliente 
	 * @param codCliente
	 * @return devuelve el cliente
	 */
	public Cliente verCliente(int codCliente) {
		String senteciaSelect = "SELECT * FROM cliente WHERE cod_cliente=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codCliente);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Cliente cliente = new Cliente();

			cliente.setCodCliente(resultado.getInt("cod_cliente"));
			cliente.setDniCif(resultado.getString("Dni_Cif"));
			cliente.setNombre(resultado.getString("nombre"));
			cliente.setDireccion(resultado.getString("direccion"));
			cliente.setFormaPago(resultado.getString("forma_pago"));
			cliente.setTelefono(resultado.getString("telefono"));
			cliente.setContrasena(resultado.getString("contrasena"));
			return cliente;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/***
	 * Se encarga de averiguar si el dni y la contrasena que se le pasa existen en la base de datos.s
	 * @param    dniCif
	 * @param   contrasena
	 * @return devuelve el objeto cliente
	 */
	public Cliente verificar(String dniCif, String contrasena) {
		String senteciaSelect = "SELECT * FROM cliente WHERE Dni_Cif=? AND contrasena =?";
		Cliente cliente = new Cliente();

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setString(1, dniCif);
			pstSelect.setString(2, contrasena);

			ResultSet resultado = pstSelect.executeQuery();

			while (resultado.next()) {
				cliente.setCodCliente(resultado.getInt(1));
				cliente.setDniCif(resultado.getString(2));
				cliente.setNombre(resultado.getString(3));
				cliente.setDireccion(resultado.getString(4));
				cliente.setFormaPago(resultado.getString(5));
				cliente.setTelefono(resultado.getString(6));
				cliente.setContrasena(resultado.getString(7));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cliente;
	}

}// fin clase modeloCliente
