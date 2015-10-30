package m2i.Formation.VenteEnLigne.Repository;

import java.io.IOException;
import java.util.List;

import m2i.Formation.VenteEnLigne.entities.Book;
import m2i.Formation.VenteEnLigne.entities.IEntity;
import m2i.Formation.VenteEnLigne.entities.Media;

public interface IRepository <T extends IEntity>{
	
	String getUri();
	void setUri(String uri);
	List<T> getAll() throws IOException;
	T getById(int id) throws IOException;
	List<T> getByPrice(double price) throws IOException;
	List<T> getByTitle(String title) throws IOException;
	void insert(Book b);

}
