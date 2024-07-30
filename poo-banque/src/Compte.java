//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Compte {

    private Personne proprietaire;
    private final long numero;
    private double solde;
    private static int compteur;

    public Compte(Personne proprietaire, double solde) {
        this.numero = ++compteur;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    public long getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) {
        if (getSolde() - montant > 0) {
            setSolde(getSolde() - montant);
        }
    }

    public void crediter (double montant) {
        setSolde(solde + montant);
    }

    public void virement(Compte destination, double montant) {
        destination.setSolde(destination.getSolde() + montant);
    }

}