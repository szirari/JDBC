
public class Singleton {

	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Singleton instance = null;
	
	public static synchronized Singleton getInstance(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}
