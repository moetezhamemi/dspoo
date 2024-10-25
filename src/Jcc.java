public class Jcc {
    private Film[] competition;
    private  int annee;
    final int nbfmax = 30;
    private  int nbf;
    public Jcc(int t,int a)
    {
        competition = new Film[t];
        annee = a;
        nbf = 0;
    }
    public void ajoutfilm(Film f)
    {
        if(nbf == nbfmax)
        {
            System.out.println("la competition est complet");
        }
        else
        {
            competition[nbf] = f;
            nbf++;
        }
    }
    public void listeFilmsJCC ()
    {
        System.out.println("les films qui concourent sont");
        for (int i =0;i<nbf;i++)
        {
            System.out.println(competition[i].toString());
        }
    }
    public float totalVenteBilletsJCC() {
        float totalVentes = 0;
        for (int i = 0; i < nbf; i++) {
            totalVentes += competition[i].totalVenteBillets();
        }
        return totalVentes;
    }
}
