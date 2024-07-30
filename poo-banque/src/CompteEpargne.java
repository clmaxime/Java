//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompteEpargne extends Compte {

    private double interet;

    public CompteEpargne(Personne proprietaire, double solde, double interet) {
        super(proprietaire, solde);
        this.interet = interet;
    }

    public double getInteret() {
        return interet;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public void retirer(double montant) {
        if (this.getSolde() - montant > 0) {
            this.setSolde(this.getSolde() - montant);
        }
    }


}