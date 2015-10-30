package m2i.Formation.VenteEnLigne.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import m2i.Formation.VenteEnLigne.entities.*;

public class BookRepository implements IRepository<Book> {

	private String uri;
	
	private static List<Book> cach = null;
	
			
	public List<Book> getCach() throws IOException {
		if (cach == null)
			cach = cachFactory();
		return cach;
	}

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return this.uri;
	}

	@Override
	public void setUri(String uri) {
		// TODO Auto-generated method stub
		this.uri = uri;
	}

	private List<Book> cachFactory() throws IOException {
		// TODO Auto-generated method stub
		Book book;	

		BufferedReader br = new BufferedReader(new FileReader(uri));
		List<Book> books = new ArrayList<Book>();

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
			book.setId(Integer.parseInt(st.nextToken()));

			books.add(book);

			line  = br.readLine();
		}
		
		br.close();
		return books;
	}
	@Override
	public List<Book> getAll() throws IOException {
		return getCach();
	}
	@Override
	public Book getById(int id) throws IOException {
		// TODO Auto-generated method stub
		List<Book> br = getCach();
		Book book = new Book();
		
		for (Book bookTmp : br) {
			if (bookTmp.getId() == id){
				book = bookTmp;
				break;		
			}
		}
		return book;	
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		// TODO Auto-generated method stub
		List<Book> br = getCach();
		List<Book> books = new ArrayList<Book>();

		for (Book book : br) {

			book.getPrice();
			if (book.getPrice() == price)
				books.add(book);
		}
		
		return books;
	}

	@Override
	public List<Book> getByTitle(String title) throws IOException {
		// TODO Auto-generated method stub
		List<Book> br = getCach();
		List<Book> books = new ArrayList<Book>();

		for (Book book : br) {

			book.getName();
			if (book.getName().contains(title) == true)
				books.add(book);
		}
		
		return books;
	}
	@Override
	public void insert(Book b) {
		// TODO Auto-generated method stub
		
	}
}
