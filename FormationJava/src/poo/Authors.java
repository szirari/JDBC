package poo;

public class Authors {
	private String firstName;
	private String lastName;
	private String langue;
	private int numberOfAuthors;
	public String getFirstName() {
		return firstName;
	}
	
	public Authors(String firstName, String lastName, String langue, int numberOfAuthors){
		this.firstName = firstName;
		this.lastName = lastName;
		this.langue = langue;
		this.numberOfAuthors = numberOfAuthors;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public int getNumberOfAuthors() {
		return numberOfAuthors;
	}
	public void setNumberOfAuthors(int numberOfAuthors) {
		this.numberOfAuthors = numberOfAuthors;
	}
	

}
