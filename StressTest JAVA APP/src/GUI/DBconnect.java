package GUI;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;

import java.sql.*;

/**
 * @author Rafael Leon
 *@version 1.0
 *date 2.3.2016
 *Description: General data base connector 
 */
public class DBconnect {
	/**
	 * Basic user attributes
	 */
	private java.sql.Connection conn;
	private String db;
	private String url;
	private String usuario;
	private String password;
	
	public DBconnect (){
		// Basic constructor stub
		url = "jdbc:mysql://localhost:3306/";
		db = "stressdb";
		usuario = "root";
		password = "";
		
	}
	/**
	 * @param conn
	 * @param url
	 * @param usuario
	 * @param password
	 * @param servidor
	 * @param db
	 */
	public DBconnect(String url, String db, String usuario, String password, int servidor){
		this.url = url;
		this.usuario = usuario; 
		this.password = password;
		this.db = db;
	}
	
	public void connect() throws SQLException{
		String connString = "";
		//System.setProperty("jdbc.drivers","com.mysql.jdbc.Driver");
		connString = url+db;
		conn = DriverManager.getConnection(connString, usuario, password);
	}
	
	/**
	 * @return the conn
	 */
	public java.sql.Connection getConn(){
		try {
			//If conn doesnt exist or is closed
			if (conn == null || conn.isClosed())
				connect(); //Send to connect
			return conn;
		} catch (SQLException e) {
			//Catch block
			e.printStackTrace();
			return null;	
		}
	}
	
	public void Stop(){
		try {
			if(!conn.isClosed())
				conn.close();
		} catch (SQLException e){
			//Catch block
			e.printStackTrace();	
		}
	}
	/**
	 * @return the db
	 */
	public String getDb() {
		return db;
	}
	/**
	 * @param db the db to set
	 */
	public void setDb(String db) {
		this.db = db;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param conn the conn to set
	 */
	public void setConn(java.sql.Connection conn) {
		this.conn = conn;
	}
	

	
	
}
