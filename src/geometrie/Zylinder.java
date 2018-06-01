package geometrie;

public class Zylinder extends Figur3D
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

    public Zylinder(Kreis k, int hoehe)
    {
        super(k);
        setHoehe(hoehe);
    }

    @Override
    public double volumen()
    {
        double volumen = hoehe * getBoden().flaeche();
        return volumen;
    }

    @Override
    public double oberflaeche()
    {
        double oberflaeche = hoehe * getBoden().umfang() + 2 * getBoden().flaeche();
        return oberflaeche;
    }

    /*
     * 
     * public static void main(String[] args) { Punkt p1 = new Punkt(2, 2); int l1 =
     * 5; int l2 = 10; int l3 = 0; int l0 = 0; Kreis k1 = new Kreis(p1, l2);
     * Zylinder z1 = new Zylinder(k1, l1); System.out.println(k1.flaeche());
     * System.out.println(z1.getHoehe()); System.out.println(z1.volumen()); }
     * 
     */

}
