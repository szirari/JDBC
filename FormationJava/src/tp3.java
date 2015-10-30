
public class tp3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,9, 45,78,36,130};
		
		System.out.println(factorielRecursif(3));
		System.out.println(sommeRecursive(tab,5));
	}
	
	
	public static int factorielRecursif(int n){
		if (n == 1) 
			return 1; 
		return n*factorielRecursif (n-1);
	}
	
	public static int sommeRecursive (int [] tab, int indice){
		int somme = 0;

		if ((indice<tab.length) && indice >-1 )
			somme = tab[indice] + sommeRecursive(tab, indice-1);		
		return somme;
	}
}
