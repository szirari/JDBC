package poo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point point = new Point();
//		
//		point.x = 10;
//		point.y = 20;
//		
//		point.afficher();
//		point.deplacer(56, 10);
//		point.afficher();
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		Authors author = new Authors("toto", "toto", "FR", 2);
		
		Date dateSortie = new Date();
		


		//dateSortie.setDate(23);

		book1.setAuthor(author);
		book1.setDateSortie(dateSortie);
		book1.setReference(123);
		book1.setCategory(BookCategory.Computer);
		
		book2.setAuthor(author);
		book2.setDateSortie(dateSortie);
		book2.setReference(123);
		book2.setCategory(BookCategory.Computer);
		
		//if (book1 == book2)
			//System.out.println("OK !");
		//else 
			//System.out.println("Deux objets sont forcement differents");
		
		Point3D p3D = new Point3D();
		
		
	}

}
