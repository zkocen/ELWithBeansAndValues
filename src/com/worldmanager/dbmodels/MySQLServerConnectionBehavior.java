package com.worldmanager.dbmodels;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLServerConnectionBehavior extends DBUserInfo implements ServerConnectionBehaviour {
	
	public MySQLServerConnectionBehavior() {
		super();
	}
	
	public MySQLServerConnectionBehavior(String uid, String pwd, String cat) {
		super(uid, pwd, cat);
	}
	
	@Override
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn = DriverManager.getConnection(getConnectionURL());
			return cn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
