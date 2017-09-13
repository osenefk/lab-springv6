package com.objis.springinject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;


import com.objis.springinject.domaine.Client;
import com.objis.springinject.domaine.Employe;

@Named
public class ClientDaoImpl implements IClientDao {

	@Inject
	private DataSource dataSource; //Injection du dataSource

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	public void saveEmploye(Employe employe) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			final String EMPLOYE_INSERT = "insert into employe (id,login, password, prenom, nom, email, role) "
					+ "values (?,?,?,?,?,?,?)";

			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(EMPLOYE_INSERT);

			stmt.setInt(1, employe.getId());
			stmt.setString(2, employe.getLogin());
			stmt.setString(3, employe.getPassword());
			stmt.setString(4, employe.getPrenom());
			stmt.setString(5, employe.getNom());
			stmt.setString(6, employe.getEmail());
			stmt.setString(7, employe.getRole());

			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public void sauverEmploye(Employe employe) {
		// TODO Auto-generated method stub

	}

}
