package geometrie;

public class Rechteck extends Figur2D
{

    private int breite;
    private int laenge;

    public int getBreite()
    {
        return breite;
    }

    public int getLaenge()
    {
        return laenge;
    }

    public void setBreite(int breite)
    {
        if (breite < 1)
        {
            this.breite = 1;
        }
        else
        {
            this.breite = breite;
        }
    }

    public void setLaenge(int laenge)
    {
        if (laenge < 1)
        {
            this.laenge = 1;
        }
        else
        {
            this.laenge = laenge;
        }
    }

    public Rechteck(Punkt bezug, int b, int l)
    {
        super(bezug);
        setBreite(b);
        setLaenge(l);
    }

    public double diagonalenLaenge()
    {
        double diagonale = Math.sqrt(Math.pow(getLaenge(), 2) + Math.pow(getBreite(), 2));
        return diagonale;
    }

    @Override
    public double umfang()
    {
        double umfang = 2 * getBreite() + 2 * getLaenge();
        return umfang;
    }

    @Override
    public double flaeche()
    {
        double flaeche = getBreite() * getLaenge();
        return flaeche;
    }

    public boolean flaecheKleinerAls(Figur2D f)
    {
        return flaeche() < f.flaeche();
    }

    public boolean umfangKleinerAls(Figur2D f)
    {
        return umfang() < f.umfang();
    }

    /*
     * public static void main(String[] args) {
     * 
     * Punkt p1 = new Punkt(2, 2); Punkt p2 = new Punkt(2, 2); int l1 = 5; int l2 =
     * 10; int l3 = 0; int l0 = 0; Rechteck r1 = new Rechteck(p1, l3, l2); Rechteck
     * r2 = new Rechteck(p2, l0, l3); System.out.println(r1.flaeche());
     * System.out.println(r2.flaeche());
     * System.out.println(r1.umfangKleinerAls(r2)); System.out.println(r1.getBezug()
     * == r2.getBezug()); System.out.println(r1.diagonalenLaenge());
     * System.out.println(r2.diagonalenLaenge());
     * 
     * 
     * 
     * }
     * 
     */

}
