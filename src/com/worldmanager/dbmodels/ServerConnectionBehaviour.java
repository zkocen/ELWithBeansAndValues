package com.worldmanager.dbmodels;

import java.sql.Connection;

public interface ServerConnectionBehaviour extends Connection {
	Connection getConnection();
	String getConnectionURL();
	String getConnectionDetails();
	String getTablesSchemaQuery();
}
