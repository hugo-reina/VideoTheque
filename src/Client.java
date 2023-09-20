import java.util.Objects;
import java.util.Vector;

public class Client extends Article
{
    private Videotheque videothèque;
    private boolean aFaitUneRéservation;

    public Client(String nomClient, Videotheque videothèque)
    {
        this.nom = nomClient;
        this.videothèque = videothèque;
        this.aFaitUneRéservation = false;
    }


    public boolean emprunte(DVD dVD)
    {

        if(dVD.estEmpruntéPar()==null){
            dVD.estEmpruntéPar();
            dVD.setRéserveur(null);
            return this.aFaitUneRéservation = true;
        }
        return false;

    }

    public Vector<DVD> listeEmprunts()
    {
        Vector v = new Vector();
        for(int i =0 ; i< this.videothèque.sizeDVD(); i++){

            v.add(this.videothèque.getDVD(i));

        }
    return v;
    }

    public boolean rend(DVD dVD)
    {
        if(dVD.estEmpruntéPar()!=null){
            dVD.setEmprunteur(null);
            return this.aFaitUneRéservation = true;
        }
        return false;
    }

    public void réserve(DVD dVD){
        if(this.aFaitUneRéservation == false){
            if(dVD.estEmpruntéPar() != this ){
                dVD.estRéservé();
            }

        }
    }

    public void annuleRéservation(){
        this.aFaitUneRéservation = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return aFaitUneRéservation == client.aFaitUneRéservation && Objects.equals(videothèque, client.videothèque);
    }

}

