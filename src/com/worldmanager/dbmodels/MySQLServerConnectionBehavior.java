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
	
	@Override
	public String getConnectionURL() {
		return String.format("jdbc:mysql://localhost/%s?user=%s&password", getCat(), getUid(), getPwd());
	}
	
	@Override
	public String getConnectionDetails() {
		return "MySQL Connection details to " + getCat();
	}
	
	@Override
	public String getTablesSchemaQuery() {
		return "select table_name from information_schema.tables "
				+ "where table_schema = " + getCat();
	}
}
