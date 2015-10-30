package m2i.Formation.Collection;

import java.util.*;

import m2i.Formation.VenteEnLigne.entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest test = new CollectionTest();
		
		
		List<Book> list = test.lisTest();
		
		for (Book b3 : list)
			
			System.out.println(b3.getId());
		
		Book book1 = new Book();

		book1.setId(143);
		book1.setCategoryBook(BookCategory.Computer);
		book1.setCategory(MediaCategory.Book);
		
		list.set(2, book1);
		
		System.out.println(list.get(2).getId());

		Map <Integer, Book> m = test.mapTest();
		m.get(123);
		
		for (int key : m.keySet()){
			System.out.println(key);
			System.out.println(m.get(key));
		}
		
		Basket cart = new Basket();
		cart.getVATPrice();
		
	}

}
