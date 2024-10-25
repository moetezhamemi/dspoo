public class Main {
    public static void main(String[] args) {
        Jcc jcc2021 = new Jcc(2, 2021);

        Documentaire film1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
        film1.setNbplaces(30);

        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setNbplaces(45);

        jcc2021.ajoutfilm(film1);
        jcc2021.ajoutfilm(film2);

        jcc2021.listeFilmsJCC();

        float tv = jcc2021.totalVenteBilletsJCC();
        System.out.println("Le montant total des ventes de billets est : " + tv + " DT");
    }
}