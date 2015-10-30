package m2i.Formation.VenteEnLigne.entities;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import m2i.Formation.VenteEnLigne.Repository.*;

public class Main {
	
	//private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//private static final String JDBC_URL = "jdbc:mysql://localhost/test";
	//private static final String JDBC_USER = "root";
	//private static final String JDBC_PASS = "root";
	
	public static void afficher(BookCategory style) { switch(style) 
		{ 
		case Database : System.out.println("Database"); break; 
		case Computer : System.out.println("Computer"); break; 
		case SF : System.out.println("SF"); break; 
		} 
	} 


	public static void main(String[] args) {
		Properties prop = new Properties();
		

		try {

			FileInputStream file = new FileInputStream("src/config.properties");

			// set the properties value
			prop.load(file);

		} catch (IOException io) {
			io.printStackTrace();
		}
		
		String JDBC_DRIVER = prop.getProperty("JDBC_DRIVER");
		String JDBC_URL = prop.getProperty("JDBC_URL");
		String JDBC_USER = prop.getProperty("JDBC_USER");
		String JDBC_PASS = prop.getProperty("JDBC_PASS");
		

		// TODO Auto-generated method stub
/*		Book book1 = new Book();
		
		Authors author = new Authors();
		BookRepository bookRepositoy = new BookRepository(); 

		Date dateSortie = new Date(23);
		
		book1.setName("toto");
		try{
			book1.setAuthor(author);
		}catch (MediaException e){
			e.printStackTrace();
		}
		book1.setDateSortie(dateSortie);
		book1.setId(123);
		book1.setCategoryBook(BookCategory.Computer);
		book1.setCategory(MediaCategory.Book);
		
		Media m = new Book();
		m.setPrice(10);
		Basket cart = new Basket(); 
				
		afficher(book1.getCategoryBook());
		System.out.println(m.getVATPrice());
		bookRepositoy.setUri("C:\\Users\\adminlocal\\Desktop\\Book.csv");
		try {
			bookRepositoy.getByTitle("AA");
			System.out.println(bookRepositoy.getByTitle("NN").get(0).getName());
			System.out.println(bookRepositoy.getByTitle("NN").get(0).getReference());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cart.getMedias().addAll(bookRepositoy.getAll());
			System.out.println(cart.getVATPrice());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	
		Connection conn = null;
		Statement stmt = null;

		try{
			//1- je me connecte
			System.out.println("Connecting ...");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			
			//2- creation du statement
			System.out.println("Create Statement ...");
			stmt = conn.createStatement();
			// Select ? ne marche pas
			//
			//3- Execution d'une requete
			ResultSet rs = stmt.executeQuery("select * from media;");

			//System.out.println(rs);
			
			
			//-4 boucler sur rs pour afficher le résultat
			// rs n'est pas une liste. C'est un ens de résultats. Pointeur vers la ligne. Next permet d'aller vers la ligne suivante
			while(rs.next())
			{
				System.out.println("Media #" + rs.getInt("id") + " " +rs.getString("title") + " " + rs.getDate("dateSortie"));
				
			}
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
