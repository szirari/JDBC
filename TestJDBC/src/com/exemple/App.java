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
		PreparedStatement stmt = null;

		try{
			//1- je me connecte
			System.out.println("Connecting ...");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			
			//2- creation du statement
			System.out.println("Create Statement ...");
			//stmt = conn.createStatement();
			// Select ? ne marche pas
			//
			stmt = conn.prepareStatement("insert into user values (?,?,?,?);");
			//3- Execution d'une requete
			//int rs = stmt.executeUpdate("insert into user values (50, 'insert1', 'insert2', 'adresse insert');");
			
			//System.out.println(rs);
			
			System.out.println("Send SQL ...");
			stmt.setInt(1,71);
			stmt.setString(2, "Elise");
			stmt.setString(3, "bidule");
			stmt.setString(4, "Adresse de bidule");
			
			stmt.executeUpdate();
			
			stmt.setInt(1,72);
			stmt.setString(2, "Elise");
			stmt.setString(3, "bidule");
			stmt.setString(4, "Adresse de bidule");
			
			stmt.executeUpdate();
			
			//-4 boucler sur rs pour afficher le résultat
			// rs n'est pas une liste. C'est un ens de résultats. Pointeur vers la ligne. Next permet d'aller vers la ligne suivante
//			while(rs.next())
//			{
//				System.out.println("User #" + rs.getInt("id") + " " +rs.getString("firstname") + " " + rs.getString("lastname") + " " + rs.getString("address"));
//				
//			}
			// 5- Tout cloturer dans finaly

//			rs.close();

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
