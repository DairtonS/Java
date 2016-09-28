package br.com.emovaintra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException {
		System.out.println("Conectando...");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
		return DriverManager.getConnection("jdbc:mysql://localhost/emova", "root", "");

		//		Trocando a string de conexão no Mysql
		//		return DriverManager.getConnection("jdbc:mysql://localhost/emova", "root", "");
		
	}

}
