package Persis;

import java.sql.*;

public class Connexion {

	private static Connection connexion = null;
	private static String url="jdbc:postgresql://localhost:5432/magasin?currentSchema=magasin";
	private static String userName="gestionnaire";
	private static String password="123456";
	
	public static void connect() {
		
		try {
		
		connexion = DriverManager.getConnection(url, userName, password);
		
		} catch (SQLException e) {
			System.out.println("erreur");
		}
	}
	
	public static Connection getConnexion() {
		return connexion;
	}
	
	
	
}
