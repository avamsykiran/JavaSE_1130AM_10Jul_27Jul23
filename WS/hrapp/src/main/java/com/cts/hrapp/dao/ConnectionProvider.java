package com.cts.hrapp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private String connectionString;
	private String userId;
	private String password;
	
	public static final String DB_DETAILS = "./dbdetails.properties";
	
	private static ConnectionProvider instance;
	
	private ConnectionProvider() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(DB_DETAILS));
		this.connectionString=props.getProperty("connection.string");
		this.userId=props.getProperty("connection.user");
		this.password=props.getProperty("connection.password");
	}
	
	public static ConnectionProvider getInstance() throws FileNotFoundException, IOException {
		if(instance==null) {
			instance=new ConnectionProvider();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(connectionString,userId,password);
	}
}
