package ExempleSimple;

public class CompteUser {
	private double solde;

	public double getSolde() {                // Pour réccuperer le solde
		return solde;
	}
	
	public void setSolde(double solde) {	 // pour mettre a la place du solde une autre somme		
		this.solde = solde;
	}


	public void debiter (double quantite){		// pour ajouter au solde une quantité donnée
		double newSolde = getSolde() - quantite;// on réccupere le solde et on lui ajoute quantité
		setSolde(newSolde);
	}
	
	public void crediter (double quantite){		// pour soustraire au solde une quantité donnée
		double newSolde = getSolde() + quantite;// on réccupere le solde et on lui soustrait quantité		
		setSolde(newSolde);
	}
}
