package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Empresa;
import modelo.dto.Particular;

public class ModeloEmpresa extends Conector {
	public void insertarParticular(Empresa empresa) {
		PreparedStatement pstInsert;
		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO empresa (cif, persona_contacto, email,cod_cliente ) VALUES (?,?,?,?)");
			
			pstInsert.setString(1, empresa.getCif());
			pstInsert.setString(2, empresa.getPersonaContacto());
			pstInsert.setString(3, empresa.getEmail());
			pstInsert.setInt(4, empresa.getCodCliente());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarParticular(int codCliente) {
		PreparedStatement pstDelete;
		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM empresa WHERE cod_cliente=?");
			pstDelete.setInt(1, codCliente);
			pstDelete.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void modificarEmpresa(Empresa empresa) {
		PreparedStatement pstUpdate;

		try {
			pstUpdate = super.conexion
					.prepareStatement("UPDATE particular SET  cif =?, persona_contacto=?,email=?,cod_cliente=? WHERE cod_cliente=?");
			pstUpdate.setString(1, empresa.getCif());
			pstUpdate.setString(2, empresa.getPersonaContacto());
			pstUpdate.setString(3, empresa.getEmail());
			pstUpdate.setInt(4, empresa.getCodCliente());
			pstUpdate.setInt(5, empresa.getCodCliente());
			pstUpdate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Empresa> verEmpresas() {
		String senteciaSelect = "SELECT * FROM empresa";
		java.sql.Statement st = null;
		try {
			st = super.conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();

		ResultSet resultado;
		try {
			resultado = st.executeQuery(senteciaSelect);
			while (resultado.next()) {

				Empresa empresa = new Empresa();

				empresa.setCif(resultado.getString("cif"));
				empresa.setPersonaContacto(resultado.getString("persona_contacto"));
				empresa.setEmail(resultado.getString("email"));
				empresa.setCodCliente(resultado.getInt("cod_cliente"));
				empresas.add(empresa);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return empresas;
	}
	
	public Empresa verEmpresa(int codCliente) {
		String senteciaSelect = "SELECT * FROM empresa WHERE cod_cliente=?";

		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);
			pstSelect.setInt(1, codCliente);

			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();
			Empresa empresa = new Empresa();

			empresa.setCif(resultado.getString("cif"));
			empresa.setPersonaContacto(resultado.getString("persona_contacto"));
			empresa.setEmail(resultado.getString("email"));
			empresa.setCodCliente(resultado.getInt("cod_cliente"));
			return empresa;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
