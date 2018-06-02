package aufgabe;
import geometrie.*;



//kommentar
//nächster kommentar
public class AufgabePool 
{
    
    private Quader q; //r
    private Zylinder z1; //k1
    private Zylinder z2; //k2
    private Zylinder z3; //k3

    public AufgabePool()
    {
        Punkt pr = new Punkt(74, 390);
        Rechteck r = new Rechteck(pr, 316, 875);
        this.q = new Quader(r, 2);
        
        Punkt pk1 = new Punkt(791, 390);
        Kreis k1 = new Kreis(pk1, 158);
        this.z1 = new Zylinder(k1, 2);
        
        Punkt pk2 = new Punkt(0, 390);
        Kreis k2 = new Kreis(pk2, 74);
        this.z2 = new Zylinder(k2, 2);
        
        Punkt pk3 = new Punkt(0, 222);
        Kreis k3 = new Kreis(pk3, 74);
        this.z3 = new Zylinder(k3, 2);
                
    }
    
    
    public AufgabePool(Quader q, Zylinder z1, Zylinder z2, Zylinder z3)
    {
        this.q = q;
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
    }

    public Quader getQ()
    {        
        return q;
    }
    
    public Zylinder getZ1()
    {        
        return z1;
    }
    
    public Zylinder getZ2()
    {        
        return z2;
    }    
    
    public Zylinder getZ3()
    {        
        return z3;
    }        
       
    
    public double poolVolumen()
    {
        double poolv = z1.volumen()/2 + z2.volumen()/2 + z3.volumen()/2 + q.volumen();   
        return poolv;    
    }
    
    
    public double poolUmfang()
    {
        Rechteck r = getQ().getBoden();
        Kreis k1 = (Kreis) getZ1().getBoden();
        Kreis k2 = (Kreis) getZ2().getBoden();
        Kreis k3 = (Kreis) getZ3().getBoden();       
        double poolu = r.umfang() - k1.getRadius()*2 - k2.getRadius()*2 - k3.getRadius()*2 + k1.umfang()/2 + k2.umfang()/2 + k3.umfang()/2;        
        return poolu;    
    }
    
    
    public double poolInnererMantel()
    {
        double pooli = poolUmfang() * 2 + poolWasserOberflaeche();
        return pooli;    
    }
    
    
    public double poolWasserOberflaeche()
    {
        Rechteck r = getQ().getBoden();
        Kreis k1 = (Kreis) getZ1().getBoden();
        Kreis k2 = (Kreis) getZ2().getBoden();
        Kreis k3 = (Kreis) getZ3().getBoden();         
        double poolw = r.flaeche() + k1.flaeche()/2 + k2.flaeche()/2 + k3.flaeche()/2;  
        return poolw;    
    }
    
    public double kostenZaun(double preisProStueck)
    {   
        double kostenzaun = Math.ceil((poolUmfang()/5)) * preisProStueck;
        return kostenzaun;       
    }

    
    public static void main(String[] args) 
    {
        Punkt pr = new Punkt(74, 390);
        Rechteck r = new Rechteck(pr, 316, 875);
        Quader q = new Quader(r, 2);
        
        Punkt pk1 = new Punkt(949, 791);
        Kreis k1 = new Kreis(pk1, 158);
        Zylinder z1 = new Zylinder(k1, 2);
        
        Punkt pk2 = new Punkt(0, 390);
        Kreis k2 = new Kreis(pk2, 74);
        Zylinder z2 = new Zylinder(k2, 2);
        
        Punkt pk3 = new Punkt(0, 148);
        Kreis k3 = new Kreis(pk3, 74);
        Zylinder z3 = new Zylinder(k3, 2);
        
        AufgabePool test = new AufgabePool(q, z1, z2, z3);
        
        System.out.println(test.poolVolumen());
        System.out.println(test.poolUmfang());
        System.out.println(test.poolInnererMantel());
        System.out.println(test.poolWasserOberflaeche());
        System.out.println(test.kostenZaun(1.75)); 
    }

}
