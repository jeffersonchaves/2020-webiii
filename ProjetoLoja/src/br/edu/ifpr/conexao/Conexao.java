package br.edu.ifpr.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection obterConexao() {
				
		String bancoDeDados = "db_loja_lab";
		String usuario = "root";
		String senha = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/" + bancoDeDados, usuario, senha);
		
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}
}
