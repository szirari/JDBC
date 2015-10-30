package m2i.Formation.Collection;

import java.util.*;

import m2i.Formation.VenteEnLigne.entities.*;

public class CollectionTest {

	public CollectionTest() {
		// TODO Auto-generated constructor stub
		
	}

	
	public List<Book> lisTest(){
		
		Book book1 = new Book(); 
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();

		book1.setId(123);
		book1.setCategoryBook(BookCategory.Computer);
		book1.setCategory(MediaCategory.Book);

		book2.setId(123);
		book2.setCategoryBook(BookCategory.Computer);
		book2.setCategory(MediaCategory.Book);

		book3.setId(123);
		book3.setCategoryBook(BookCategory.Computer);
		book3.setCategory(MediaCategory.Book);

		book4.setId(123);
		book4.setCategoryBook(BookCategory.Computer);
		book4.setCategory(MediaCategory.Book);

		List<Book> list = new ArrayList<Book>();
		list.add(book1);
		list.add(book1);
		list.add(book3);

		// Insert 1 livre à l'indice 1
		list.add(1, book4);

		// Remove un livre à l'indice 2
		list.remove(2);
		
		return list;
		
	}

public Set<Book> setTest(){
		
		Book book1 = new Book(); 

		book1.setId(123);
		book1.setCategoryBook(BookCategory.Computer);
		book1.setCategory(MediaCategory.Book);


		Set<Book> list = new HashSet<Book>();
		
		list.add(book1);


		return list;
		
	}

public Map<Integer, Book> mapTest(){
	
	Book book1 = new Book(); 

	book1.setId(123);
	book1.setCategoryBook(BookCategory.Computer);
	book1.setCategory(MediaCategory.Book);


	Map<Integer, Book> list = new HashMap<Integer, Book>();
	
	list.put(book1.getId(), book1);


	return list;
	
}
}


