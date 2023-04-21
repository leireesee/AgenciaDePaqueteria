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
					"INSERT INTO cliente (cod_cliente, cod_envio, nombre, direccion, forma_pago, telefono, contrasena) VALUES (?,?,?,?,?,?,?)");
			pstInsert.setInt(1, cliente.getCodCliente());
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
	
	public void eliminarCliente() {
		
	}
	
	public void modificarCliente() {
		
	}
	
	public  ArrayList<Cliente> verClientes(){
		
		return null;
	}
	
	public Cliente verCliente() {
		
		return null;
	}
	
	

}//fin clase modeloCliente

