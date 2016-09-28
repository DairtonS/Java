package br.com.emovaintra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.emovaintra.ConnectionFactory;
import br.com.emovaintra.bean.Users;

public class DaoUsers {
	
	private final Connection connection;
	
	public DaoUsers(){
		try{
			this.connection = new ConnectionFactory().getConnection();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void adiciona(Users user){
		
		String sql = "insert into users( codagente,login,senha,nome,cargo,vip1,senhavip1,email,mmcb,obs) values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try{
			ps=connection.prepareStatement(sql);
			ps.setInt(1, user.getCodagente());
			ps.setString(2, user.getLogin());
			ps.setString(3, user.getSenha());
			ps.setString(4, user.getNome());
			ps.setString(5, user.getCargo());
			ps.setString(6, user.getVip1());
			ps.setString(7, user.getSenhavip1());
			ps.setString(8, user.getEmail());
			ps.setString(9, user.getMmcb());
			ps.setString(10, user.getObs());
			
			System.out.println(user.getLogin());
			ps.execute();
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
