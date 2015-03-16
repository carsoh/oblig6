// Personclassen, ganske rett fram det, alle paramtere som trengtes, og deres get metoder.
public class Personer {
    private String navn;
    private int fdnummer;
    private String adresse;
    private int postnr;
    private int uniknummer;

    public Personer(int uniknummer, String navn, int fdnummer, String adresse, int postnr){
        this.navn=navn;
        this.fdnummer=fdnummer;
        this.adresse=adresse;
        this.postnr=postnr;
        this.uniknummer=uniknummer;
    }
    public int getFdnummer(){return fdnummer;}
    public int getPostnr(){return postnr;}
    public int getUniknummer(){return uniknummer;}
    public String getNavn(){return navn;}
    public String getAdresse(){return adresse;}
}
