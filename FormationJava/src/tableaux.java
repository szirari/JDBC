import java.util.Random;

public class tableaux {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {10,22,39,45,59,61,78,56,9,19};
		display(tab);
		System.out.println("");
		System.out.println("La somme des elements du tableaux est : " + sum(tab));
		System.out.println("Le max du tableau est : "+max(tab));
		System.out.println("La moyenne du tableau est : "+average(tab));
		tab =  aleatoire(tab);
		display(tab);
		put(tab, 6, 89);
		display(tab);

		tab = aleatoire(tab);
		display(tab);
		permut(tab, 6 , 2);
		display(tab);

		tab = aleatoire(tab);
		display(tab);
		permut2(tab, 3);
		display(tab);

		tab = aleatoire(tab);
		display(tab);
		display(insert(tab, 2 , 6));

		tab = aleatoire(tab);
		display(tab);
		display(remove(tab, 2));
		
		tab = aleatoire(tab);
		display(tab);
		display(even(tab));
		
		tab = aleatoire(tab);
		display(tab);
		display(inverse(tab));
		}

	public static void display(int[] tab){

		for (int i = 0; i<tab.length; i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();

	}	

	public static int sum(int[] tab){
		int temp = 0;
		for (int i = 0; i<tab.length; i++){
			temp += tab[i]; 
		}
		return temp;
	}

	public static int max(int[] tab){
		int max = tab[0];
		for (int i = 1; i<tab.length; i++){
			if (tab[i] > max){
				max = tab[i];
			}
		}
		return max;
	}

	public static double average(int[] tab){
		double average;
		average = (double)sum(tab)/(double)tab.length;
		return average; 
	}

	public static int[] aleatoire(int[] tab){
		Random randomno = new Random();
		for (int i = 0; i<tab.length; i++){
			tab[i] = randomno.nextInt(100);
		}
		return tab;
	}

	public static void put(int[] tab, int index, int value){
		tab[index] = value;
	}

	/**
	 * permut tab de index1 avec index2
	 * @param tab
	 * @param index1
	 * @param index2
	 */
	public static void permut(int[] tab, int index1, int index2){
		int temp = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = temp;

	}

	/**
	 * Permute tab[index] avec tab[index-1]
	 * @param tab
	 * @param index
	 */
	public static void permut2(int[] tab, int index){
		permut(tab, index, index-1);
	}

	/**
	 * Inserer une valeur à un index
	 * @param tab
	 * @param index
	 * @param value
	 * @return nouveau tableau résultat
	 */
	public static int[] insert(int[] tab, int index, int value){
		int[] tab2; 
		tab2 = new int[tab.length + 1];
		for (int i =0; i<index; i++){
			tab2[i] = tab[i];
		}
		tab2[index] = value;

		for (int i = index + 1; i <tab.length+1 ; i++){
			tab2[i] = tab[i-1];
		}
		return tab2;
	}
	
	/**
	 * enlever une valeur du tableau à l'index index
	 * @param tab
	 * @param index
	 * @return nouveau tableau qui est tab2
	 */
	public static int[]remove(int[] tab, int index){
		int[] tab2; 
		tab2 = new int[tab.length - 1];
		for (int i =0; i<index; i++){
			tab2[i] = tab[i];
		}

		for (int i = index; i <tab.length-1 ; i++){
			tab2[i] = tab[i+1];
		}
		return tab2;
	}
	
	/**
	 * Clonne d'un tableau
	 * @param tab
	 * @return tab clonné
	 */
	public static int[] clonne(int[] tab){
		int[] tabClonne = new int[tab.length];
		for (int i = 0; i<tab.length; i++){
			tabClonne[i] = tab[i];
		}
		return tabClonne;
	}
	
	/**
	 * Les nombres pairs d'un tableau
	 * @param tab
	 * @return tableau des nombres pairs
	 */
	public static int[] even(int[] tab){
		int temp = 0;
		int[] tabEven = new int[(tab.length)];
		temp = 0;
		for (int i=0; i<tab.length; i++){
			if (tab[i]%2 == 0){
				tabEven[temp++] = tab[i];
			}
		}

		return tabEven;
	}
	
	/**
	 * Inverse tableau
	 * @param tab
	 * @return tab inversé
	 */
	public static int[] inverse(int[] tab){
		int[] tabInverse = new int[tab.length];
		for (int i = 0; i<tab.length; i++){
			tabInverse[i] = tab[tab.length -1- i];
		}
		return tabInverse;
	}
}
