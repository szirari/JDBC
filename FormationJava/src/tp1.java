/* 		Fait le 05/10/2015 		*/
/* 		Par Soumaya ZIRARI 		*/
/* 		POEC				  	*/	

public class tp1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int temp;
		int temp2 = 1;
		int temp3 = 0;
		
		/*--------------------------------*/
		/* Inverser les valeurs de i et j */
		/*--------------------------------*/
		i = 12;
		j = 26;
		
		System.out.println("La valeur de i :"+ i);
		System.out.println("La valeur de j :"+ j );
		
		temp = i;
		i = j;
		j = temp;
		
		System.out.println("Inversion de i et j");
		System.out.println("La nouvelle valeur de i :" + i);
		System.out.println("La nouvelle valeur de j :" + j);
		
		/*---------------------------------*/
		/* Afficher les chiffres de 0 à 99 */
		/*---------------------------------*/
		for (int k = 0; k < 100; k++)
		{
			System.out.println(k);
		}
		
		/*-------------------------------*/
		/* Affiche 10 9 8 ... 3 2 1 BOOM */
		/*-------------------------------*/
		for (int k = 10; k > 0; k--)
		{
			System.out.println(k);
		}
		System.out.println("BOOM");
		
		/*------------------------------*/
		/* Afficher les puissances de 2 */
		/*------------------------------*/
		System.out.println("Les puissances de 2 : ");
		for (int k = 1; k < 11; k++)
		{
			temp2 = temp2 * 2;
			System.out.println(temp2);
		}
		
		/*-------------------------------*/
		/* Afficher les Nombres Premiers */
		/*-------------------------------*/
		System.out.println("Les 50 nombres premiers : ");
		for ( int k = 1; k < 51; k++)
		{	temp3 = 0;
				for (int t = 1; t < 51 ; t++)
				{	
					if (k % t == 0)
					{
						temp3 ++;
						if (temp3 > 2)
							break;
					}
				}
			if (temp3 == 2)
			{
				System.out.println(k);
			}
				
		}		
		/* ------------------------------- */
		/* Affichage de la somme de i et j */
		/* ------------------------------- */
		i = 12;
		j = 89;
		System.out.println("La somme de i = " + i + " et de j = " + j + " est : "+ add(i, j));
	}
	
	/* ------------------------------------ */
	/* La fonction Addition de deux entiers */
	/* ------------------------------------ */
	/**
	 * Fonction d'addition
	 * @param a premier argument 
	 * @param b deuxieme argument
	 * @return Somme de a et b
	 */
	public static int add(int a, int b){
		return a + b;
	}
	
}
