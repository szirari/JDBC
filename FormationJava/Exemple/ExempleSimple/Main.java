package ExempleSimple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteUser compteUser = new CompteUser();  // initialisation de l'instance d'objet
												   // compteUser est une instance de ComteUser
		double soldeInitial = 2013.12;
		double quantite = 1000.00;
		
		compteUser.setSolde(soldeInitial);    // Pour mettre une somme de depart
			
		compteUser.debiter(quantite);		  // Pour debiter 
		
		System.out.print(compteUser.getSolde());		  // Pour Crediter
		
	}

}
