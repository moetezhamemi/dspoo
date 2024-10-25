import java.util.Scanner;
public class Film {
    private  String titre;
    private  String realisateur;
    private  String pays;
    private  int duree;
    private  int nbplaces;

    public  Film(String titre, String r, String pays, int d)
    {
        this.titre = titre;
        realisateur = r;
        this.pays = pays;
        duree = d;
    }
    public int getNbplaces() {
        return nbplaces;
    }

    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }
    public  String toString()
    {
        String s = titre + "de" + realisateur + "(" + pays +")"+" - " + duree + "min";
        return  s;
    }

    public float totalVenteBillets() {
        Scanner scanner = new Scanner(System.in);
        int nbEtudiants;

        do {
            System.out.println("Veuillez saisir le nombre de places pour étudiants (<= " + nbplaces + "): ");
            nbEtudiants = scanner.nextInt();
        } while (nbEtudiants < 0 || nbEtudiants > nbplaces);

        int nbPublic = nbplaces - nbEtudiants;
        return (2 * nbEtudiants) + (3 * nbPublic);
    }


}
