package geometrie;

public class Quader extends Figur3D
{

    private int hoehe;

    public int getHoehe()
    {
        return hoehe;
    }

    public void setHoehe(int hoehe)
    {
        if (hoehe < 1)
        {
            this.hoehe = 1;
        }
        else
        {
            this.hoehe = hoehe;
        }
    }

    public Quader(Rechteck r, int hoehe)
    {
        super(r);
        setHoehe(hoehe);
    }

    @Override
    public Rechteck getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Rechteck) myBoden;
    }

    public double laengeRaumdiagonale()
    {
        double raumdiagonale = Math.sqrt((Math.pow(getBoden().diagonalenLaenge(), 2)) + (Math.pow(getHoehe(), 2)));
        return raumdiagonale;
    }

    public static boolean istWuerfel(Object o)
    {
        if (o instanceof Quader)
        {
            Quader q = (Quader) o;
            return q.getBoden().getLaenge() == q.getBoden().getBreite() && q.getBoden().getLaenge() == q.getHoehe();
        }
        else
        {
            return false;
        }
    }

    public boolean equals(Figur3D f)
    {
        if (f instanceof Quader)
        {
            Quader q = (Quader) f;
            return getHoehe() == q.getHoehe() && getBoden().getLaenge() == q.getBoden().getLaenge()
                    && getBoden().getBreite() == q.getBoden().getBreite()
                    && getBoden().getBezug().getXKoordinate() == q.getBoden().getBezug().getXKoordinate()
                    && getBoden().getBezug().getYKoordinate() == q.getBoden().getBezug().getYKoordinate();
        }
        else
        {
            return false;
        }
    }

    @Override
    public double volumen()
    {
        double volumen = getBoden().flaeche() * getHoehe();
        return volumen;
    }

    @Override
    public double oberflaeche()
    {
        double oberflaeche = getBoden().umfang() * getHoehe() + getBoden().flaeche() * 2;
        return oberflaeche;
    }


    public static void main(String[] args) 
    {
         /*Punkt p1 = new Punkt(2, 2); Punkt p2
     * = new Punkt(2, 2); int l1 = 5; int l2 = 10; int l5 = 5; int l3 = 0; int l0 =
     * 0; int l7 = 7; Rechteck r1 = new Rechteck(p1, l5, l7); Rechteck r2 = new
     * Rechteck(p1, l5, l7); Quader q1 = new Quader(r1, l1); Quader q2 = new
     * Quader(r1, l5); Kreis k1 = new Kreis(p1, l2); Zylinder z1 = new Zylinder(k1,
     * l1); System.out.println(r1.equals(q1));
     * 
*/  }
     

}
