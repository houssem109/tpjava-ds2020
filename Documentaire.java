package ds2020;

public class Documentaire extends Film {
    protected String sujet;              
    protected static final float tarif = 2.0f;

    
    public Documentaire(String titre, String realisateur, String paysOrigine, int duree, int nbPlacesReservees, String sujet) {
        super(titre, realisateur, paysOrigine, duree, nbPlacesReservees);  
        this.sujet = sujet;  
    }

    public String toString() {
        return super.toString() + " - Sujet: " + sujet;
    }

   
    public float totalVenteBillets() {
        return getNbPlace() * tarif;
    }
}