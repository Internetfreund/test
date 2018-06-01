package geometrie;

public class Gerade
{

    private Punkt startPos;
    private Punkt endPos;

    public Punkt getStartPos()
    {
        return startPos;
    }

    public Punkt getEndPos()
    {
        return endPos;
    }

    public void setStartPos(Punkt startPos)
    {
        this.startPos = startPos;
    }

    public void setEndPos(Punkt endPos)
    {
        this.endPos = endPos;
    }

    public Gerade(Punkt start, Punkt ende)
    {
        startPos = start;
        endPos = ende;
    }

    public double laenge()
    {
        double laenge = getStartPos().abstand(getEndPos());
        return laenge;
    }

    public boolean istLaengerAls(Gerade g2)
    {
        return laenge() > g2.laenge();
    }

    public boolean equals(Gerade g2)
    {
        return getStartPos().equals(g2.getStartPos()) && getEndPos().equals(g2.getEndPos())
                || getStartPos().equals(g2.getEndPos()) && getEndPos().equals(g2.getStartPos());
    }

    /*
     * public static void main(String[] args) { Punkt p1 = new Punkt(2, 2); Punkt p2
     * = new Punkt(2, 1); Punkt p3 = new Punkt(2, 1); Punkt p4 = new Punkt(2, 2);
     * Gerade g1 = new Gerade(p1, p2); Gerade g2 = new Gerade(p3, p4);
     * 
     * 
     * System.out.println(g1.equals(g2));
     * 
     * }
     */

}
