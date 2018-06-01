package geometrie;

public class Punkt
{
    private int xKoordinate;
    private int yKoordinate;

    public int getXKoordinate()
    {
        return xKoordinate;
    }

    public int getYKoordinate()
    {
        return yKoordinate;
    }

    public void setXKoordinate(int x)
    {
        xKoordinate = x;
    }

    public void setYKoordinate(int y)
    {
        yKoordinate = y;
    }

    public Punkt(int x, int y)
    {
        xKoordinate = x;
        yKoordinate = y;
    }

    public Punkt(Punkt p2)
    {
        xKoordinate = p2.getXKoordinate();
        yKoordinate = p2.getYKoordinate();
    }

    public double abstand(Punkt p)
    {
        double abstand = Math.sqrt(Math.pow((getXKoordinate() - p.getXKoordinate()), 2)
                + Math.pow((getYKoordinate() - p.getYKoordinate()), 2));
        return abstand;
    }
    
    public double abstand(int xKoordinate, int yKoordinate)
    {
        double abstand = Math.sqrt(Math.pow((getXKoordinate() - xKoordinate), 2)
                + Math.pow((getYKoordinate() - yKoordinate), 2));
        return abstand;
    }
    

    public void verschieben(int deltaX, int deltaY)
    {
        xKoordinate += deltaX;
        yKoordinate += deltaY;
    }

    public boolean equals(Punkt p)
    {
        return getXKoordinate() == p.getXKoordinate() && getYKoordinate() == p.getYKoordinate();
    }

    /*
     * public static void main(String[] args) { Punkt p1 = new Punkt(1, 3); Punkt p2
     * = new Punkt(1, 3); System.out.println(p1.equals(p2)); }
     */
    
    public static void main(String[] args)
    {
        Punkt p1 = new Punkt(1, 1);
        System.out.println(p1.xKoordinate + " + " + p1.getYKoordinate());
        Punkt p2 = new Punkt(2, 2);
        System.out.println(p2.getYKoordinate());
        System.out.println(p1.abstand(p2));
        p2.abstand(p1);
        p1.verschieben(2, 2);
        System.out.println(p1.abstand(0, 0));
        System.out.println(p1.equals(p1));
    }
    

}
