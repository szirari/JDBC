package m2i.Formation.VenteEnLigne.entities;

public abstract class  Media extends Item{
	private MediaCategory Category;
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MediaCategory getCategory() {
		return Category;
	}

	public void setCategory(MediaCategory category) {
		Category = category;
	}
	
	
	public abstract double getVATPrice();
}
