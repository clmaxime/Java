//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom){
        super(); // Fait référence à la méthode parent
    }

    public enum Statut {
        CELIBATAIRE,
        EN_COUPLE
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}