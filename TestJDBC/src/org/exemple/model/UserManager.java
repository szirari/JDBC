package org.exemple.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UserManager {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost/j2ee";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	private static final UserManager instance = new UserManager();
	
	public static final UserManager getInstance(){
		return UserManager.instance;
	}
	
	private Map<Integer,User> cache = new HashMap<>();

	private UserManager(){

		

			
	}

	public void add(User u) {
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
			stmt = conn.prepareStatement("INSERT INTO user VALUES (?,?,?,?);");
			stmt.setInt(1, u.getId());
			stmt.setString(2, u.getFirstname());
			stmt.setString(3, u.getLastname());
			stmt.setString(4, u.getAddress());
			
			stmt.executeUpdate();
			
			
			
		}	catch(SQLException e){
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
	
	public void del(User u) {
		User user = new User();
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
			stmt = conn.prepareStatement("DELATE from user WHERE id = ?;");
			stmt.setInt(1, u.getId());


			
			stmt.executeUpdate();
			
		}	catch(SQLException e){
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
	
	public void upd(User u) {
		User user = new User();
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
			stmt = conn.prepareStatement("UPDATE user SET id = ?,firstname= ?,lastname=?,address= ? WHERE id = ?;");
			stmt.setInt(1, u.getId());
			stmt.setString(2, u.getFirstname());
			stmt.setString(3, u.getLastname());
			stmt.setString(4, u.getAddress());
			stmt.setInt(5, u.getId());

			
			stmt.executeUpdate();
			
		}	catch(SQLException e){
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
	
	public User getbyId(int id){
		User user = new User();
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
			stmt = conn.prepareStatement("select * from user where id = ?;");
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next())
			{
				user = new User();	
				user.setId(rs.getInt("id")); 
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setAddress(rs.getString("address"));
			}
			
		}	catch(SQLException e){
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
		
		return user;
	}
	
	public List<User> getAll(){
		
		final List<User> result = new ArrayList<User>();
		
		Connection conn = null;
		Statement stmt = null;
		User user;

		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
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
				user = new User();	
				user.setId(rs.getInt("id")); 
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setAddress(rs.getString("address"));
				result.add(user);
				
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
		
		
		return result;
	}
}
