import java.io.*;
import java.util.*;

import m2i.Formation.VenteEnLigne.entities.*;

public class TestFile {

	public static List<Book> ReadFile(String uri) throws IOException {
		System.out.println("Lecture du fichier "+ uri);
		
		List<Book> readBooks = new ArrayList<Book>();
		Book book;// = new Book();
		
		
		BufferedReader br = new BufferedReader(new FileReader(uri));
		
		br.readLine();
		String line = br.readLine();
		//line  = br.readLine();

		StringTokenizer st;

		while(line!=null) {
			st = new StringTokenizer(line,";");
			book = new Book();
			
			book.setName(st.nextToken());
			st.nextToken();
			book.setPrice(Double.parseDouble(st.nextToken()));
			st.nextToken();
			book.setReference(st.nextToken());
			
			readBooks.add(book);

			line  = br.readLine();
		}
		
		br.close();
		return readBooks;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//ReadFile("C:\\Users\\adminlocal\\Desktop\\Book.csv");
		List<Book> readBooks = new ArrayList<Book>();
		Basket cart = new Basket();

		try {
			readBooks = ReadFile("C:\\Users\\adminlocal\\Desktop\\Book.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cart.getMedias().addAll(readBooks);

		System.out.println(readBooks.size());

		System.out.println(readBooks.get(25).getReference());
		System.out.println(readBooks.get(10).getReference());
		
		System.out.println(readBooks.get(25).getName());
		System.out.println(readBooks.get(10).getName());
		
		System.out.println(cart.getVATPrice());


	}

}
