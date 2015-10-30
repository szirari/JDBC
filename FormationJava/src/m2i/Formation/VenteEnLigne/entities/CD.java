package m2i.Formation.VenteEnLigne.entities;

import java.util.Date;

public class CD extends Media {
	private Authors author = new Authors();
	private Date dateSortie = new Date();
	private CdCategory categoryCd;
	

	public Authors getAuthor() {
		return author;
	}
	public void setAuthor(Authors author) {
		this.author = author;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public CdCategory getCategoryCd() {
		return categoryCd;
	}
	public void setCategoryCd(CdCategory categoryCd) {
		this.categoryCd = categoryCd;
	}
	@Override
	public double getVATPrice() {
		// TODO Auto-generated method stub
		return getPrice() * 1.2;
	}	


}
