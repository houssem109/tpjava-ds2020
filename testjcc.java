package ds2020;

public class testjcc {
	public static void main(String[] args) {
        Jcc jcc2021 = new Jcc(2, 2021);

        Documentaire film1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, 30, "La guerre civile");
        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105, 45);

        jcc2021.ajoutFilm(film1);
        jcc2021.ajoutFilm(film2);

        System.out.println("Films en compétition JCC 2021:");
        jcc2021.listeFilmsJCC();
        System.out.println("---------------------------------------------------");
        System.out.println("Calcul des ventes de billets:");
        float totalVentes = jcc2021.totalVenteBilletsJCC();
        System.out.println("Montant total des ventes de billets : " + totalVentes + " DT");
    }
}
