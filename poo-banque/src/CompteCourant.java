//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompteCourant extends Compte {

    private double decouvert;

    public CompteCourant(Personne proprietaire,double solde, double decouvert) {
        super(proprietaire, solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public void retirer(double montant) {
        if (getSolde() - montant > getDecouvert()) {
            this.setSolde(this.getSolde() - montant);
        }
    }




}