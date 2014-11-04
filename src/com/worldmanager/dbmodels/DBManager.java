package com.worldmanager.dbmodels;

import java.io.Serializable;
import java.sql.Connection;

public class DBManager implements Serializable {
	private static long serialVersion = 1L;
	
	Connection cn = null;
	ServerConnectionBehaviour  scb = null;
	
	public DBManager() {}
	
	public DBManager(ServerConnectionBehaviour conBehaviour) {
		scb = conBehaviour;
	}
	
	public boolean setConnectionBehaviour(ServerConnectionBehaviour value) {
		if (value == null) {
			throw new IllegalArgumentException("Please man use a valid connection, ServerConnection == null");
		}
		scb = value;
		return true;
	}
}
