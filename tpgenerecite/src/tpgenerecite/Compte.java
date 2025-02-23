package tpgenerecite;

public class Compte<T> {
	protected int numCompte;
	protected double solde;
	protected T devise;
	public Compte(int numCompte, double solde, T devise) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.devise = devise;
	}
	public void deposer(double montant) {
		if(montant>0) {
			solde=this.solde+montant;
			System.out.println("depot de "+montant+this.devise);
		}
		else {
			System.out.println("montant doit etre positif");
		}
	}
	public void retirer(double montant) {
		if(montant>0) {
			solde=this.solde-montant;
			System.out.println("retrait de "+montant+this.devise);
		}
		else {
			System.out.println("montant doit etre positif");
		}
	}
	public void afficherSolde() {
		System.out.println(this.solde);
	}
	public static <T, V extends Compte<T>> void transferer(V source,V destination, double montant) {
		if(source.solde>montant && montant>0) {
			source.retirer(montant);
			destination.deposer(montant);
		}
	}
}
