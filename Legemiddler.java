// Legemidler classen, med alle parametrene den skal ha.
// Har valgt aa ikke lage abstrakte klasse, fordi jeg fooler det er unoodevendig i denne sittuasjonen, men maa se
// med fremtidige obliger.
public class Legemiddler {
    private String navn;
    private int uniknum;
    private double pris;
    private double virkestoff;

   public Legemiddler(String navn, int uniknum, double pris, double virkestoff){
        this.navn=navn;
        this.uniknum=uniknum;
        this.pris=pris;
        this.virkestoff=virkestoff;
    }

    public String getNavn(){return navn;}
    public int getUniknum(){return uniknum;}
    public double pris(){return pris;}
    public double getVirkestoff(){return virkestoff;}
}
// Subclassen for TypeA piller, denne klassen implementererer interfacet for piller
class TypeAPiller extends Legemiddler implements Piller{
    private int styrkenark;
    private int pilleribox;

    public TypeAPiller(String navn,int unikum,double pris, double virkestoff , int styrkenark, int pilleribox){
        super(navn,unikum,pris, virkestoff);
        this.styrkenark=styrkenark;
        this.pilleribox=pilleribox;
    }

    public int getStyrkenarkP(){return styrkenark;}
    public int getPilleribox(){return pilleribox;}



    public double virkestoffIPille(){return super.getVirkestoff()/pilleribox; }


}
// Subclass for Type Mixtur, implementerer interfacet for mixturer.
class TypeAMixtur extends Legemiddler implements Mikstur{
    private int styrkenark;
    private double cm3;

    public TypeAMixtur(String navn,int unikum,double pris, double virkestoff , int styrkenark, int cm3){
        super(navn,unikum,pris, virkestoff);
        this.styrkenark=styrkenark;
        this.cm3=cm3;
    }

    public  int getStyrkenarkM(){return styrkenark;}
    public double getMixtur(){return cm3;}
    public double virkestoffPerCm3(){return super.getVirkestoff()/cm3; }

}

class TypeBPiller extends Legemiddler implements Piller{
    private int vanedannelse;
    private int pilleribox;
    public TypeBPiller(String navn, int uniknum, double pris, double virkestoff, int vanedannelse, int pilleribox){
        super(navn,uniknum,pris,virkestoff);
        this.vanedannelse=vanedannelse;
        this.pilleribox=pilleribox;
    }
    public int getVanedannelseP(){return vanedannelse;}
    public int getPilleribox(){return pilleribox;}
    public double virkestoffIPille(){return super.getVirkestoff()/pilleribox; }
}

class TypeBMixtur extends Legemiddler implements Mikstur{
    private int vanedannelse;
    private double cm3;
    public TypeBMixtur(String navn, int uniknum, double pris, double virkestoff, int vanedannelse, double cm3){
        super(navn,uniknum,pris,virkestoff);
        this.vanedannelse=vanedannelse;
        this.cm3=cm3;
    }
    public int getVanedannelseM(){return vanedannelse;}
    public double getMixtur(){return cm3;}
    public double virkestoffPerCm3(){return super.getVirkestoff()/cm3; }
}
class TypeCPiller extends Legemiddler implements Piller{
    private int pilleribox;
    public TypeCPiller(String navn, int uniknum, double pris, double virkestoff, int pilleribox){
        super(navn,uniknum,pris,virkestoff);
        this.pilleribox=pilleribox;
    }
    public int getPilleribox(){return pilleribox;}
    public double virkestoffIPille(){return super.getVirkestoff()/pilleribox; }
}



class TypeCMixtur extends Legemiddler implements Mikstur{
    private double cm3;
    public TypeCMixtur(String navn, int uniknum, double pris, double virkestoff, double cm3){
        super(navn,uniknum,pris,virkestoff);
        this.cm3=cm3;
    }
    public double getMixtur(){return cm3;}
    public double virkestoffPerCm3(){return super.getVirkestoff()/cm3; }
}