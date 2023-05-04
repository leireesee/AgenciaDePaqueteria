package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dto.Cliente;
import modelo.dto.Departamento;

public class ModeloDepartamento extends Conector {

	public void insertarDepartamento(Departamento departamento) {
		PreparedStatement pstInsert;

		try {
			pstInsert = super.conexion.prepareStatement("INSERT INTO departamentos  ( nombre) VALUES (?)");
			pstInsert.setString(1, departamento.getNombre());
			pstInsert.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void eliminarDepartamento(int codDepartamento) {
		PreparedStatement pstDelete;

		try {
			pstDelete = super.conexion.prepareStatement("DELETE FROM departamentos WHERE cod_departamento=?");
			pstDelete.setInt(1, codDepartamento);
			pstDelete.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Departamento> verDepartamentos() {
	String sentenciaSelect ="SELECT * FROM departamentos";
		
		try {
			PreparedStatement pstSelect= super.conexion.prepareStatement(sentenciaSelect);
			ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
			
			ResultSet resultado = pstSelect.executeQuery();
			while (resultado.next()) {
			
			Departamento departamento = new Departamento();
			
			departamento.setCodDepartamento(resultado.getInt("cod_departamento"));
			departamento.setNombre(resultado.getString("nombre"));
			departamentos.add(departamento);
			return departamentos;
			
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}

	public Departamento verDepartamento(int codDepartamento) {
		String sentenciaSelect ="SELECT * FROM departamentos WHERE cod_departamento=?";
		
		try {
			PreparedStatement pstSelect= super.conexion.prepareStatement(sentenciaSelect);
			pstSelect.setInt(1, codDepartamento);
			
			ResultSet resultado = pstSelect.executeQuery();
			resultado.next();
			
			Departamento departamento = new Departamento();
			
			departamento.setCodDepartamento(resultado.getInt(1));
			departamento.setNombre(resultado.getString(2));
			return departamento;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int recibirUltimoCodigoDepartamento() {

		String senteciaSelect = "SELECT MAX(cod_departamento) FROM departamento ";
		int codigoDepartamento = 0;
		try {
			PreparedStatement pstSelect = super.conexion.prepareStatement(senteciaSelect);

			ResultSet resultado = pstSelect.executeQuery();

			while (resultado.next()) {
				codigoDepartamento = resultado.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return codigoDepartamento;
	}

}// fin clase
