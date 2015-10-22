package com.exemple;

import java.sql.*;

import com.mysql.jdbc.ResultSetImpl;

public class App {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost/j2ee";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try{
			//1- je me connecte
			System.out.println("Connecting ...");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			
			//2- creation du statement
			System.out.println("Crate Statement ...");
			stmt = conn.createStatement();
			
			//3- Execution d'une requete
			ResultSet rs = stmt.executeQuery("select * from user;");
			
			//-4 boucler sur rs pour afficher le résultat
			// rs n'est pas une liste. C'est un ens de résultats. Pointeur vers la ligne. Next permet d'aller vers la ligne suivante
			while(rs.next())
			{
				System.out.println("User #" + rs.getInt("id") + " " +rs.getString("firstname") + " " + rs.getString("lastname") + " " + rs.getString("address"));
				
			}
			// 5- Tout cloturer dans finaly

			rs.close();

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			// Pour cloturer le statement
			try {
				// Meme la fermeture de la connexion peut planter dou les try catch
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// Pour cloturer le driver
			try {
				// Meme la fermeture de la connexion peut planter dou les try catch
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
