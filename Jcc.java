package ds2020;

public class Jcc {
    private Film[] competition;
    private int annee;
    private static final int nbfmax = 30;  
    private int nbF;  

    public Jcc(int taille, int annee) {
        this.annee = annee;
        if (taille<nbfmax){
        this.competition = new Film[taille];}
        else {
        	System.out.println("tu depasse la limite");
        }
        this.nbF = 0;
    }

    public void ajoutFilm(Film f) {
        if (nbF < competition.length) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("La compétition est au complet");
        }
    }

    public void listeFilmsJCC() {
        for (int i = 0; i < nbF; i++) {
            System.out.println(competition[i]);
        }
    }

    public float totalVenteBilletsJCC() {
        float total = 0;
        for (int i = 0; i < nbF; i++) {
        	
            total += competition[i].totalVenteBillets();
        }
        return total;
    }

    
}