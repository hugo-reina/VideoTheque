public class DVD extends Article
{
    private Client réserveur;
    private Client emprunteur;

    public DVD(String nom)
    {
        this.nom = nom;

    }

    public Client estEmpruntéPar(){
        if(this.emprunteur != null){
            return this.emprunteur;
        }
        return null;
    }

    public Client estRéservé() {
        if(this.réserveur != null){
            return this.réserveur;
        }
        return null;
    }

    public void setRéserveur(Client réserveur) {
        this.réserveur = réserveur;
    }

    public void setEmprunteur(Client emprunteur) {
        this.emprunteur = emprunteur;
    }
}
