package poo;

public class Point {
	private int x;
	private int y;
	
	public void deplacer(int ecartx, int ecarty){
		x += ecartx;
		y += ecarty;
	}
	
	public void afficher(){
		System.out.println("("+x+";"+y+")");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
