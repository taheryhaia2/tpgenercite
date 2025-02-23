package tpgenerecite;

public class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
    public String identifiant;

    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limiteAutorisation, String identifiant) {
        super(numeroCompte, solde, devise, limiteAutorisation);
        this.identifiant = identifiant;
    }
    public boolean verifierIdentite(String identifiant) {
        return this.identifiant.equals(identifiant);
    }
}
