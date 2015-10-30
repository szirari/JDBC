package m2i.Formation.VenteEnLigne.entities;

public abstract class Item implements Iitem {
	private int Id;
	private double price;
	private String name;
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#getId()
	 */
	public int getId() {
		return Id;
	}
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#setId(int)
	 */
	@Override
	public void setId(int id) {
		Id = id;
	}
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#getPrice()
	 */
	@Override
	public double getPrice() {
		return price;
	}
	/* (non-Javadoc)
	 * @see m2i.Formation.VenteEnLigne.Iitem#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
}
