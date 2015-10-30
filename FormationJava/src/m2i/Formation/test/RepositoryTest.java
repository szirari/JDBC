package m2i.Formation.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import m2i.Formation.VenteEnLigne.Repository.BookRepository;
import m2i.Formation.VenteEnLigne.entities.Book;

public class RepositoryTest {

	@Test
	public void getAllTest() throws IOException {
		String uri = "C:\\Users\\adminlocal\\Desktop\\Book.csv";

		BookRepository br = new BookRepository();

		br.setUri(uri);

		Assert.assertEquals(26, br.getAll().size());
	}

	@Test
	public void getByIdTest() throws IOException {
		String uri = "C:\\Users\\adminlocal\\Desktop\\Book.csv";

		BookRepository br = new BookRepository();

		br.setUri(uri);

		Assert.assertEquals("BBBB", br.getById(2).getName());
	}
	
	@Test
	public void getByPriceTest() throws IOException {
		String uri = "C:\\Users\\adminlocal\\Desktop\\Book.csv";

		BookRepository br = new BookRepository();

		br.setUri(uri);

		Assert.assertEquals(1.0, br.getById(1).getPrice(),0.001);
	}
	
	@Test
	public void getByTitleTest() throws IOException {
		String uri = "C:\\Users\\adminlocal\\Desktop\\Book.csv";

		BookRepository br = new BookRepository();

		br.setUri(uri);

		Assert.assertEquals("BBBB", br.getById(2).getName());
	}
	
	@Test
	public void insertBookTest() throws IOException {
		Book b = new Book();
		
		b.setName("test");
		b.setPrice(12.03);
		BookRepository br = new BookRepository();
		int nbre = br.getAll().size();
		br.insert(b);

		Assert.assertEquals("BBBB", br.getById(2).getName());
	}
	
}
