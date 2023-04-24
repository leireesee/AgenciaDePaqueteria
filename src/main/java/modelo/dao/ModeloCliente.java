package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Envio;

public class ModeloCliente extends Conector {

	public void insertarCliente(Cliente cliente) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO cliente ( DniCif, nombre, direccion, forma_pago, telefono, contrasena) VALUES (?,?,?,?,?)");
			pstInsert.setString(1, cliente.getNombre());
			pstInsert.setString(2, cliente.getDireccion());
			pstInsert.setString(3, cliente.getFormaPago());
			pstInsert.setString(4, cliente.getTelefono());
			pstInsert.setString(5, cliente.getContrasena());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

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

	public void modificarCliente(Cliente cliente) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion.prepareStatement(
					"UPDATE cliente SET DniCif=?,  nombre=?, direccion=?, forma_pago=?, telefono=?, contrasena=? WHERE cod_cliente=?");
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
				ModeloEnvio modeloEnvio = new ModeloEnvio();
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

	public Cliente verCliente(int codCliente) {
		String senteciaSelect = "SELECT * FROM cliente WHERE cod_cliente=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codCliente);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();

			Cliente cliente = new Cliente();
			ModeloEnvio modeloEnvio = new ModeloEnvio();
			
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

	public boolean verificar(String codCliente, String contrasena) {
		String senteciaSelect = "SELECT * FROM cliente WHERE Dni_Cif=? AND contrasena =?";
		boolean verificar = false;
		
		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setString(1, codCliente);
			pstSelect.setString(2, contrasena);

			ResultSet resultado = pstSelect.executeQuery();
			
			if(resultado.next()) {
				verificar = true;
			} else {
				verificar = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return verificar;
	}

}// fin clase modeloCliente
