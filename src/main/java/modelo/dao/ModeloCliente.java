package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;

public class ModeloCliente extends Conector{

	
	public void insertarCliente(Cliente cliente) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement(
					"INSERT INTO cliente ( cod_envio, nombre, direccion, forma_pago, telefono, contrasena) VALUES (?,?,?,?,?,?)");
			pstInsert.setInt(2, cliente.getEnvio().getCodEnvio());
			pstInsert.setString(3, cliente.getNombre());
			pstInsert.setString(4, cliente.getDireccion());
			pstInsert.setString(5, cliente.getFormaPago());
			pstInsert.setString(6, cliente.getTelefono());
			pstInsert.setString(7, cliente.getContrasena());
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
					"UPDATE cliente SET , cod_envio=?, nombre=?, direccion=?, forma_pago=?, telefono=?, contrasena=? WHERE cod_cliente=?");
			pstUpdate.setInt(1, cliente.getEnvio().getCodEnvio());
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
	
	public  ArrayList<Cliente> verClientes(){
		
		return null;
	}
	
	public Cliente verCliente() {
		
		return null;
	}
	
	

}//fin clase modeloCliente

