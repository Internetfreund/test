package geometrie;

public abstract class Figur2D
{

    private Punkt bezug;

    public Punkt getBezug()
    {
        return bezug;
    }

    public void setBezug(Punkt punkt)
    {
        this.bezug = punkt;
    }

    public Figur2D(Punkt bezug)
    {
        this.bezug = new Punkt(bezug);
    }

    public Figur2D(int bezugX, int bezugY)
    {
        bezug.setXKoordinate(bezugX);
        bezug.setYKoordinate(bezugY);
    }

    public abstract double umfang();

    public abstract double flaeche();

}
