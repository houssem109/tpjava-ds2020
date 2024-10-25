package ds2020;
import java.util.Scanner;


public class Film {
	    protected String titre;
	    protected String realisateur;
	    protected String paysOrigine;
	    protected
	    int duree;
	    private int nbPlace;
	    
	    
	    public Film(String titre, String realisateur, String paysOrigine, int duree, int nbPlace) {
	        this.titre = titre;
	        this.realisateur = realisateur;
	        this.paysOrigine = paysOrigine;
	        this.duree = duree;
	        this.nbPlace=nbPlace;
	    }


		public int getNbPlace() {
			return nbPlace;
		}


		public void setNbPlace(int nbPlace) {
			this.nbPlace = nbPlace;
		}
		public String toString() {
		        return titre + " de " + realisateur + " (" + paysOrigine + ") – " + duree + "min.";
		    }
		 public float totalVenteBillets() {
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.print("Entrez le nombre de places réservées pour les étudiants");
		        int nbPlacesEtudiants = scanner.nextInt();

		        while (nbPlacesEtudiants < 0 || nbPlacesEtudiants > nbPlace) {
		            System.out.print("Erreur ! Entrez un nombre valide de places pour étudiants (≤ " + nbPlace + "): ");
		            nbPlacesEtudiants = scanner.nextInt();
		        }

		        int nbPlacesPublic = nbPlace - nbPlacesEtudiants;

		        float total = (nbPlacesEtudiants * 2) + (nbPlacesPublic * 3);

		        return total;
		    }
}
