public class Main
{
    public static void main (String[] args) {
        Personne personne = new Personne("nom", "prénom");
        CompteEpargne compteEpargne = new CompteEpargne(personne, 100.0, 0.02);
        CompteCourant compteCourant = new CompteCourant(personne, 100.0, 200.0);
}


}
