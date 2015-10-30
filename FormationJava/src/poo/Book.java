 package poo;

import java.util.Date;

public class Book {
	private String title;
	private Authors author = new Authors("toto", "toto", "FR", 2);
	private Date dateSortie = new Date();
	private int reference;
	private BookCategory category;
	
	public void affiche(){
		System.out.println("Livre ref :" + reference + "titre \"" + title + "\"" + "auteur" + author.getFirstName() + "date de sortie "+ dateSortie);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}


}
