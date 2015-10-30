package m2i.Formation.VenteEnLigne.entities;

import java.util.*;

public class Basket implements IEntity {

	private List<Media> medias = new ArrayList<Media>();
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Media> getMedias() {
		return medias;
	}
	
	public double getVATPrice(){
		double price = 0;
		
		for (Media m : medias)
			price += m.getVATPrice();
		return price; 
	}
}
