package M4M1;

public class Hond extends Huisdier{
    private int stamboeknummer;

    public Hond(double gewicht, int leeftijd, String naam, int stamboeknummer){
        super(gewicht, leeftijd, naam);
        this.stamboeknummer=stamboeknummer;
    }

    public int getStamboeknummer() {
        return stamboeknummer;
    }
    public void setStamboeknummer(int stamboeknummer) {
        this.stamboeknummer = stamboeknummer;
    }

    @Override
    public String toString() {
        return super.toString()+ getNaam() + " heeft stamboeknummer " + stamboeknummer + ".";
    }
}
