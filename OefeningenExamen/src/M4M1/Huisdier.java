package M4M1;

public class Huisdier {
    //. Zorg voor een constructor, getters, setters
    // en een toString functie.
    //


    private double gewicht;
    private int leeftijd;
    private String naam;

    public Huisdier(double gewicht, int leeftijd, String naam){
        this.gewicht=gewicht;
        this.leeftijd=leeftijd;
        this.naam=naam;
    }


    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht=gewicht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam+ " is " + leeftijd + " jaar oud en weegt "+ gewicht + " kg. ";
    }

    public static void main(String[] strgs){
        Hond waf=new Hond(5.6,1,"Waf",123);
        System.out.println(waf);

        Huisdier miauw=new Huisdier(5.6,1,"Miauw");
        System.out.println(miauw);
    }
}


