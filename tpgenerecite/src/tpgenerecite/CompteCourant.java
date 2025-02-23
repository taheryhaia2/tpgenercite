package tpgenerecite;

class CompteCourant<T> extends Compte<T> {
    protected double limiteAutorisee;

    public CompteCourant(int numeroCompte, double solde, T devise, double limiteAutorisee) {
        super(numeroCompte, solde, devise);
        this.limiteAutorisee = limiteAutorisee;
    }
    public void retirer(double montant) {
        if (this.solde>=(limiteAutorisee)) {
            this.retirer(montant);
        } else {
            System.out.println("Dépassement de la limite autorisée.");
        }
    }
    public void afficherSolde() {
        System.out.println("Compte Épargne - Solde: " + this.solde + " " + this.devise);
    }
}

