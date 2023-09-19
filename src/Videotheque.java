import java.util.Vector;

import java.util.Vector;

public class Videotheque
{
    private Vector<DVD> listeDVD;
    private Vector<Client> listeClients;
    /**
     */
    public Videotheque()
    {
        this.listeDVD = null;
        this.listeClients = null;
    }

    public boolean addClient(String nomClient)
    {
        return listeClients.add(new Client(nomClient,this));
    }
    /**
     * @param arg0
     * @return
     * @see java.util.Vector#get(int)
     */
    public Client getClient(int arg0)
    {
        return listeClients.get(arg0);
    }
    /**
     * @return
     * @see java.util.Vector#size()
     */
    public int sizeClient()
    {
        return listeClients.size();
    }


    /**
     * @param nomClient
     * @return
     * @see java.util.Vector#indexOf(java.lang.Object)
     */
    public int indexOfClient(String nomClient)
    {
        return listeClients.indexOf(nomClient);
    }
    /**
     * @param titre
     * @return
     * @see java.util.Vector#add(java.lang.Object)
     */
    public boolean addDVD(String titre)
    {
        return listeDVD.add(new DVD(titre));
    }
    /**
     * @param index
     * @return
     * @see java.util.Vector#get(int)
     */
    public DVD getDVD(int index)
    {
        return listeDVD.get(index);
    }

    /**
     * @return
     * @see java.util.Vector#size()
     */
    public int sizeDVD()
    {
        return listeDVD.size();
    }
    /**
     * @param titre
     * @return
     * @see java.util.Vector#indexOf(java.lang.Object)
     */
    public int indexOfDVD(String titre)
    {
        return listeDVD.indexOf(titre);
    }

}

