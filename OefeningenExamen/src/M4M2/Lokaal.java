package M4M2;
import M3M1.Adres;

public class Lokaal {
    private Adres adres;
    private String gebouw;
    private int verdieping;
    private int lokaalnummer;

    public Lokaal(Adres adres, String gebouw, int verdieping, int lokaalnummer){
        this.adres=adres;
        this.gebouw=gebouw;
        this.verdieping=verdieping;
        this.lokaalnummer=lokaalnummer;
    }

    @Override
    public String toString(){
        return adres.toString()+ ". \nLokaal: " + gebouw+verdieping+lokaalnummer;
    }

}
