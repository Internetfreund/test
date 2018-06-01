package geometrie;

public class Kreis extends Figur2D 
{

    private static final int DEFAULT_RADIUS = 5;
    private int radius;
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius(int radius)
    {
        if (radius < 1) 
        {
            this.radius = 1;
        } 
        else 
        {
            this.radius = radius;
        }
    }
    
    public Kreis(Punkt bezug, int radius)
    {
        super(bezug);
        setRadius(radius);
    }
    
    public Kreis(Punkt bezug)
    {
        this(bezug, DEFAULT_RADIUS);
    }

    
    @Override
    public double umfang() 
    {
        double umfang = 2 * Math.PI * getRadius();
        return umfang;
    }

    @Override
    public double flaeche() 
    {
        double flaeche = Math.PI * Math.pow(getRadius(), 2);
        return flaeche;
    }


/*    
    public static void main(String[] args) {
        Punkt p1 = new Punkt(2, 2);
        Punkt p2 = new Punkt(2, 2);
        int l1 = 5;
        int l2 = 10;
        int l3 = 0;
        int l0 = 0;
        Rechteck r1 = new Rechteck(p1, l3, l0);
        Kreis k1 = new Kreis(p2, l2);
        System.out.println(k1.flaeche());
        System.out.println(r1.flaecheKleinerAls(k1));
    }
*/


}
