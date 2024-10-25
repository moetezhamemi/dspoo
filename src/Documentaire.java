public class Documentaire extends Film {
    private String sujet;
    final   float tarif = 2;
    public Documentaire(String titre, String r, String pays, int d,String s)
    {
        super(titre,r,pays,d);
        sujet = s;
    }
    public String toString()
    {
        String sujet = super.toString() + " sujet: " + this.sujet;
        return sujet;
    }
    public float totalVenteBillets()
    {
        float tv = 2 * getNbplaces();
        return tv;
    }




}
