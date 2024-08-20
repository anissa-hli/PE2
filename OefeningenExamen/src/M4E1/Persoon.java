package M4E1;

import M3M1.Adres;

public class Persoon {
    private String voornaam;
    private String achternaam;
    private String email;
    private Adres adres;
    private static int aantalPersonen = 0;

    public Persoon(String voornaam, String achternaam){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
        aantalPersonen++;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getAantalPersonen(){
        return aantalPersonen;
    }

    public String toString(){
        return "Naam\n\t" + voornaam + " " + achternaam + "\nAdres\n\t" + adres;
    }

    public static void main (String[] strgs){
        Persoon persoon1=new Persoon("Anissa","Sahli");
       persoon1.setAdres(new Adres("Oostendestraat",119,"SAHLI",1080,"Brussel"));
        System.out.println(persoon1);
    }
}
