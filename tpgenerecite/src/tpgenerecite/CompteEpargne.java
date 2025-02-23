package tpgenerecite;

public class CompteEpargne<T> extends Compte {
	protected double tauxInte;

	public CompteEpargne(int numCompte, double solde,T devise, double tauxInte) {
		super(numCompte, solde, devise);
		this.tauxInte = tauxInte;
	}
	public void clculerInteret() {
		this.solde=this.solde+this.solde*this.tauxInte;
	}
	public void afficherSolde() {
        System.out.println("Compte Épargne - Solde: " + this.solde + " " + this.devise);
    }
}
