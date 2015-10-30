package ExempleSimple;

public class CompteUser {
	private double solde;

	public double getSolde() {                // Pour r�ccuperer le solde
		return solde;
	}
	
	public void setSolde(double solde) {	 // pour mettre a la place du solde une autre somme		
		this.solde = solde;
	}


	public void debiter (double quantite){		// pour ajouter au solde une quantit� donn�e
		double newSolde = getSolde() - quantite;// on r�ccupere le solde et on lui ajoute quantit�
		setSolde(newSolde);
	}
	
	public void crediter (double quantite){		// pour soustraire au solde une quantit� donn�e
		double newSolde = getSolde() + quantite;// on r�ccupere le solde et on lui soustrait quantit�		
		setSolde(newSolde);
	}
}
